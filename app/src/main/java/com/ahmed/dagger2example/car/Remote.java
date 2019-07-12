package com.ahmed.dagger2example.car;

import android.util.Log;

import javax.inject.Inject;

public class Remote {

    private static final String Tag ="Remote";

    @Inject
    public Remote(){

    }

    public void setListener(Car car){
        Log.i(Tag,"Remote ..connected");
    }
}
