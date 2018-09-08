package com.stephenWS.app;
import com.stephenWS.rest.RestService;//import test service we created
import javax.ws.rs.core.Application;
import java.util.HashSet;
import java.util.Set;


public class WSApplication extends Application {

    private Set<Object> singletons = new HashSet<Object>();

    public WSApplication(){
        //Register Service
        singletons.add(new RestService());
    }

    @Override
    public Set<Object> getSingletons(){
        return singletons;
    }

}

