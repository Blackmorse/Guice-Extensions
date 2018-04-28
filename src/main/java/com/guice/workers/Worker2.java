package com.guice.workers;

import com.google.inject.assistedinject.Assisted;
import com.google.inject.assistedinject.AssistedInject;
import com.guice.services.ServiceB;
import com.guice.services.ServiceC;

public class Worker2 extends Worker {
    private ServiceB serviceB;
    private ServiceC serviceC;

    @AssistedInject
    public Worker2(ServiceB serviceB, ServiceC serviceC, @Assisted int argument) {
        super(argument);
        this.serviceB = serviceB;
        this.serviceC = serviceC;
    }

    @Override
    public void doWork() {
        System.out.println(String.format("Worker1 starts work with argument %d services %s and %s",
                argument, serviceB, serviceC));
    }
}

