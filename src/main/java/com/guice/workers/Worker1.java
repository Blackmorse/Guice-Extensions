package com.guice.workers;

public class Worker1 extends Worker {

    public Worker1(int argument) {
        super(argument);
    }

    @Override
    public void doWork() {
        System.out.println(String.format("Worker1 starts work with argument %d services %s and %s",
                argument, serviceA, serviceB));
    }
}
