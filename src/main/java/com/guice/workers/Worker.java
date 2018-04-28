package com.guice.workers;

public abstract class Worker{
    protected final int argument;

    public Worker(int argument) {
        this.argument = argument;
    }

    public abstract void doWork();
}
