package com.ahmed.dagger2example.dagger;




import com.ahmed.dagger2example.car.Rims;
import com.ahmed.dagger2example.car.Tirs;
import com.ahmed.dagger2example.car.Wheels;

import dagger.Module;
import dagger.Provides;

@Module
public abstract class WheelsModel{

    @Provides
    static Rims provideRims(){
        return new Rims();
    }
    @Provides
    static Tirs provideTirs(){
        Tirs tirs = new Tirs();
        tirs.inflate();
        return tirs;
    }
    @Provides
    static Wheels provideWheels(Rims rims,Tirs tirs){
        return new Wheels(rims,tirs);
    }
    // End .......................
}
