package com.guice;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import com.guice.workers.Worker;

import java.util.Map;

@Singleton
public class RequestHandler {
    private Map<String, WorkerFactory> workerFactoryMap;

    @Inject
    public RequestHandler(Map<String, WorkerFactory> workerFactoryMap) {
        this.workerFactoryMap = workerFactoryMap;
    }

    public void handleRequest(Request request) {
        Worker worker = workerFactoryMap.get(request.parameter)
                .createWorker(request.argument);
        worker.doWork();
    }
}
