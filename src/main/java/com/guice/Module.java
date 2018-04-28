package com.guice;

import com.google.inject.AbstractModule;
import com.google.inject.TypeLiteral;
import com.google.inject.assistedinject.FactoryModuleBuilder;
import com.google.inject.multibindings.MapBinder;
import com.guice.workers.Worker;
import com.guice.workers.Worker1;
import com.guice.workers.Worker2;

public class Module extends AbstractModule{
    @Override
    protected void configure() {
        install(new FactoryModuleBuilder().implement(Worker.class, Worker1.class)
                .build(new TypeLiteral<WorkerFactory<Worker1>>() {}));

        install(new FactoryModuleBuilder().implement(Worker.class, Worker2.class)
                .build(new TypeLiteral<WorkerFactory<Worker2>>() {}));

        MapBinder<String, WorkerFactory> binder = MapBinder.newMapBinder(binder(), String.class, WorkerFactory.class);
        binder.addBinding("case1").to(new TypeLiteral<WorkerFactory<Worker1>>(){});
        binder.addBinding("case2").to(new TypeLiteral<WorkerFactory<Worker2>>(){});
    }
}
