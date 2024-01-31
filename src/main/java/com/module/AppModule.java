package com.module;

import com.annotations.ColorValue;
import com.annotations.EdgeValue;
import com.bean.DrawSquare;
import com.google.inject.AbstractModule;
import com.google.inject.Scopes;
import com.interfaces.DrawShape;
import com.req.SquareRequest;

public class AppModule extends AbstractModule {

    @Override
    protected void configure() {
        bind(DrawShape.class).to(DrawSquare.class).in(Scopes.SINGLETON); /*.in(Scopes.SINGLETON) -> It means that just one instance is created.*/
        bind(String.class).annotatedWith(ColorValue.class).toInstance("Red");
        bind(Integer.class).annotatedWith(EdgeValue.class).toInstance(40);
        bind(SquareRequest.class).in(Scopes.SINGLETON);
        /*bind(SquareRequest.class).to(SquareRequestSubclass.class);*/
    }
}
