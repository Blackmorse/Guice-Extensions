package com.guice;

import com.google.inject.AbstractModule;
import com.google.inject.assistedinject.FactoryModuleBuilder;
import com.guice.workers.Worker1;
import com.guice.workers.Worker2;

public class Module extends AbstractModule {
    @Override
    protected void configure() {
        install(new FactoryModuleBuilder().implement(Worker1.class, Worker1.class)
                .implement(Worker2.class, Worker2.class)
                .build(WorkerFactory.class));
    }
}
