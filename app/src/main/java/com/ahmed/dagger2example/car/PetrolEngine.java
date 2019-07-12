package com.ahmed.dagger2example.car;

import android.util.Log;

import javax.inject.Inject;
import javax.inject.Named;

public class PetrolEngine implements Engine {

    private static final String Tag = "Car";
    private int horsePower , engineCapicity;

    @Inject
    public PetrolEngine(
     @Named ("horse pwoer") int horsePower,
      @Named ("engine capicity") int engineCapicity){
       this.horsePower= horsePower;
      this.engineCapicity = engineCapicity;
    }

    @Override
    public void start(){

        Log.i(Tag,"petroEngine started..." + horsePower+"(--)"+engineCapicity);

    }

  // End
}
