package com.ahmed.dagger2example.dagger;


import com.ahmed.dagger2example.car.DieselEngine;
import com.ahmed.dagger2example.car.Engine;

import dagger.Binds;
import dagger.Module;
import dagger.Provides;

@Module
public  class DieselEngineModule {

    private int horsePower;

    public DieselEngineModule(int horsePower) {

        this.horsePower = horsePower;

    }



    @Provides
    int provideHorsePower(){
     return horsePower;
    }

    @Provides
    Engine providesEngine(DieselEngine Engine){
      return Engine;
    }



   /*
   @Provides
    Engine providesEngine(PetrolEngine petrolEngine){
      return petrolEngine;
   }
  */

}
