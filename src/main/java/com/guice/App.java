package com.guice;

import com.guice.services.ServiceA;
import com.guice.services.ServiceB;
import com.guice.services.ServiceC;

public class App
{
    public static void main( String[] args ) {
        RequestHandler requestHandler = new RequestHandler(new ServiceA(), new ServiceB(), new ServiceC());

        Request request = new Request();
        request.parameter = "case1";
        request.argument = 5;

        requestHandler.handleRequest(request);

        request.parameter = "case2";
        requestHandler.handleRequest(request);
    }
}
