package com.ahmed.dagger2example.car;

import android.util.Log;

import javax.inject.Inject;

public class DieselEngine implements Engine {

private static final String Tag = "Car";

    private int horsePower;


    @Inject
    public DieselEngine(int horsePower){
        this.horsePower = horsePower;
    }

    @Override
    public void start() {
        Log.i(Tag,"DieselEngine started..." +horsePower);
    }

}
