package com.guice;

import com.google.inject.Guice;
import com.google.inject.Injector;

public class App
{
    public static void main( String[] args ) {
        Request request = new Request();
        request.parameter = "case1";
        request.argument = 5;

        Injector injector = Guice.createInjector(new Module());
        RequestHandler requestHandler = injector.getInstance(RequestHandler.class);

        requestHandler.handleRequest(request);

        request.parameter = "case2";
        requestHandler.handleRequest(request);
    }
}
