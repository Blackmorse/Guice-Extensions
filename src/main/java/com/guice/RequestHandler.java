package com.guice;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import com.guice.workers.Worker;

@Singleton
public class RequestHandler {
    private WorkerFactory workerFactory;

    @Inject
    public RequestHandler(WorkerFactory workerFactory) {
        this.workerFactory = workerFactory;
    }

    public void handleRequest(Request request) {
        Worker worker = null;
        if (request.parameter.equals("case1")) {
            worker = workerFactory.createWorker1(request.argument);
        } else if (request.parameter.equals("case2")) {
            worker = workerFactory.createWorker2(request.argument);
        }

        worker.doWork();
    }
}
