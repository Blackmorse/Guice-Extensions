package com.guice;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import com.guice.workers.Worker;
import com.guice.workers.Worker1;
import com.guice.workers.Worker2;

@Singleton
public class RequestHandler {
    private WorkerFactory<Worker1> worker1Factory;
    private WorkerFactory<Worker2> worker2Factory;

    @Inject
    public RequestHandler(WorkerFactory<Worker1> worker1Factory,
                          WorkerFactory<Worker2> worker2Factory) {
        this.worker1Factory = worker1Factory;
        this.worker2Factory = worker2Factory;
    }

    public void handleRequest(Request request) {
        Worker worker = null;
        if (request.parameter.equals("case1")) {
            worker = worker1Factory.createWorker(request.argument);
        } else if (request.parameter.equals("case2")) {
            worker = worker2Factory.createWorker(request.argument);
        }

        worker.doWork();
    }
}
