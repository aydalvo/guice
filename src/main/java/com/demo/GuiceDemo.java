package com.demo;

import com.bean.DrawSquare;
import com.google.inject.Guice;
import com.google.inject.Injector;
import com.interfaces.DrawShape;
import com.module.AppModule;
import com.req.SquareRequest;

public class GuiceDemo {

    private static final String SQUARE_REQ = "SQUARE";

    public static void main(String[] args) {
//        selfManagingDepedency(SQUARE_REQ);
//        firstLevelOfDependencyManagedByGuice(SQUARE_REQ);
        fullDependencyManagedByGuice(SQUARE_REQ);
    }

    private static void fullDependencyManagedByGuice(String squareReq) {
        if (SQUARE_REQ.equals(squareReq)) {
            Injector injector = Guice.createInjector(new AppModule());
            SquareRequest squareRequest = injector.getInstance(SquareRequest.class);
            squareRequest.makeRequest();

            SquareRequest squareRequest2 = injector.getInstance(SquareRequest.class);
            squareRequest2.makeRequest();

            boolean areDrawShapeEqual = squareRequest.getDrawShape() == squareRequest2.getDrawShape();
            System.out.println("Were draw shape equal : " + areDrawShapeEqual);

            boolean areSquareRequestEqual = squareRequest == squareRequest2;
            System.out.println("Were square request equal : " + areSquareRequestEqual);
        }
    }

    private static void firstLevelOfDependencyManagedByGuice(String squareReq) {
        if (SQUARE_REQ.equals(squareReq)) {
            Injector injector = Guice.createInjector(new AppModule());
            DrawShape d = injector.getInstance(DrawShape.class);
//            SquareRequest squareRequest = new SquareRequest(d);
//            squareRequest.makeRequest();
        }
    }

    /*private static void selfManagingDepedency(String squareReq) {
        if (SQUARE_REQ.equals(squareReq)) {
            DrawShape d = new DrawSquare();
            SquareRequest squareRequest = new SquareRequest(d);
            squareRequest.makeRequest();
        }
    }*/
}
