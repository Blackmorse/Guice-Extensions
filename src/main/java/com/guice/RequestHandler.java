package com.guice;

import com.guice.services.ServiceA;
import com.guice.services.ServiceB;
import com.guice.services.ServiceC;
import com.guice.workers.Worker;
import com.guice.workers.Worker1;
import com.guice.workers.Worker2;

public class RequestHandler {
    private final ServiceA serviceA;
    private final ServiceB serviceB;
    private final ServiceC serviceC;

    public RequestHandler(ServiceA serviceA,
                             ServiceB serviceB,
                             ServiceC serviceC) {
        this.serviceA = serviceA;
        this.serviceB = serviceB;
        this.serviceC = serviceC;
    }

    public void handleRequest(Request request) {
        Worker worker = null;
        if (request.parameter.equals("case1")) {
            worker = new Worker1(request.argument);
        } else if (request.parameter.equals("case2")) {
            worker = new Worker2(request.argument);
        }

        worker.setServiceA(serviceA);
        worker.setServiceB(serviceB);
        worker.setServiceC(serviceC);

        worker.doWork();
    }
}
