package com.guice.workers;

import com.google.inject.Inject;
import com.guice.services.ServiceB;
import com.guice.services.ServiceC;

public class Worker2 extends Worker{
    private ServiceB serviceB;
    private ServiceC serviceC;

    @Inject
    public Worker2(ServiceB serviceB, ServiceC serviceC) {
        this.serviceB = serviceB;
        this.serviceC = serviceC;
    }

    @Override
    public void doWork() {
        System.out.println(String.format("Worker2 starts work with %s and %s", serviceB, serviceC));
    }
}
