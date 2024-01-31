package com.req;

import com.google.inject.Inject;
import com.interfaces.DrawShape;

public class SquareRequestSubclass extends SquareRequest {

    @Inject
    public SquareRequestSubclass(DrawShape d){
        super(d);
    }

    public void makeRequest(){
        System.out.println("Delegating call to draw method");
        d.draw();
    }
}
