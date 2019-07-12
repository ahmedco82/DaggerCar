package com.ahmed.dagger2example.dagger;


import com.ahmed.dagger2example.car.Engine;
import com.ahmed.dagger2example.car.PetrolEngine;

import dagger.Binds;
import dagger.Module;

@Module
public abstract class PetrolEngineModule {


@Binds
abstract Engine bindsEngine(PetrolEngine petrolEngine);


}
