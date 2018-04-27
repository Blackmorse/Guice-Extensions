package com.guice.workers;

import com.guice.services.ServiceA;
import com.guice.services.ServiceB;
import com.guice.services.ServiceC;

public abstract class Worker {
    protected ServiceA serviceA;
    protected ServiceB serviceB;
    protected ServiceC serviceC;

    protected final int argument;

    public Worker(int argument) {
        this.argument = argument;
    }

    public abstract void doWork();

    public void setServiceA(ServiceA serviceA) {
        this.serviceA = serviceA;
    }

    public void setServiceB(ServiceB serviceB) {
        this.serviceB = serviceB;
    }

    public void setServiceC(ServiceC serviceC) {
        this.serviceC = serviceC;
    }
}
