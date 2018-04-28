package com.guice.workers;

import com.google.inject.assistedinject.Assisted;
import com.google.inject.assistedinject.AssistedInject;
import com.guice.services.ServiceA;
import com.guice.services.ServiceB;

public class Worker1 extends Worker {
    private ServiceA serviceA;
    private ServiceB serviceB;

    @AssistedInject
    public Worker1(ServiceA serviceA, ServiceB serviceB, @Assisted int argument) {
        super(argument);
        this.serviceA = serviceA;
        this.serviceB = serviceB;
    }

    @Override
    public void doWork() {
        System.out.println(String.format("Worker1 starts work with argument %d services %s and %s",  argument, serviceA, serviceB));
    }
}
