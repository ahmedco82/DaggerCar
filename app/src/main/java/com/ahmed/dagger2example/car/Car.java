package com.ahmed.dagger2example.car;

import android.util.Log;

import javax.inject.Inject;

public class Car {
    private static final String Tag = "Car";
    private  Driver driver;
    private  Engine engine;
    private  Wheels wheels;

    @Inject
    public Car(Driver driver , Wheels wheels , Engine engine){
       this.engine = engine;
       this.wheels = wheels;
       this.driver = driver;
    }

    @Inject
    public void enabledRemote(Remote remote){
        remote.setListener(this);
    }

    public void drive(){
        engine.start();
        Log.i(Tag,"driving...."+driver);
    }

    // End ....
}
