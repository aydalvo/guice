package com.req;

import com.google.inject.Inject;
import com.interfaces.DrawShape;

public class CircleRequest {

    @Inject
    DrawShape d;

//    @Inject
//    public CircleRequest(DrawShape d){
//        this.d=d;
//    }

    public void makeRequest(){
        d.draw();
    }

    public DrawShape getDrawShape() {
        return d;
    }

    public void setDrawShape(DrawShape d) {
        this.d = d;
    }
}
