package com.guice;

import com.google.inject.Inject;
import com.google.inject.Provider;
import com.google.inject.Singleton;
import com.guice.workers.Worker;
import com.guice.workers.Worker1;
import com.guice.workers.Worker2;

@Singleton
public class RequestHandler {
    private Provider<Worker1> worker1Provider;
    private Provider<Worker2> worker2Provider;

    @Inject
    public RequestHandler(Provider<Worker1> worker1Provider,
                          Provider<Worker2> worker2Provider) {
        this.worker1Provider = worker1Provider;
        this.worker2Provider = worker2Provider;
    }

    public void handleRequest(Request request) {
        Worker worker = null;
        if (request.parameter.equals("case1")) {
            worker = worker1Provider.get();
        } else if (request.parameter.equals("case2")) {
            worker = worker2Provider.get();
        }

        worker.doWork();
    }
}
