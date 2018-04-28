package com.guice.workers;

import com.google.inject.Inject;
import com.guice.services.ServiceA;
import com.guice.services.ServiceB;

public class Worker1 extends Worker{
    private ServiceA serviceA;
    private ServiceB serviceB;

    @Inject
    public Worker1(ServiceA serviceA, ServiceB serviceB) {
        this.serviceA = serviceA;
        this.serviceB = serviceB;
    }

    @Override
    public void doWork() {
        System.out.println(String.format("Worker1 starts work with %s and %s", serviceA, serviceB));
    }
}
