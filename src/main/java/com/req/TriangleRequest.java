package com.req;

import com.google.inject.Inject;
import com.interfaces.DrawShape;

public class TriangleRequest {

    DrawShape d;

    /*@Inject
    public TriangleRequest(DrawShape d){
        this.d=d;
    }*/

    public void makeRequest(){
        d.draw();
    }

    public DrawShape getDrawShape() {
        return d;
    }

    @Inject
    public void setDrawShape(DrawShape d) {
        this.d = d;
    }
}
