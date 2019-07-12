package com.ahmed.dagger2example.car;

import javax.inject.Inject;

public class Wheels{


   private Rims rims ;
   private Tirs tirs;

    @Inject
    public Wheels(Rims rims ,Tirs tirs){
      this.rims = rims;
      this.tirs = tirs;
    }


    // End ;
}
