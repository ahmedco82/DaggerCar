package com.ahmed.dagger2example.dagger;

import com.ahmed.dagger2example.MainActivity;
import com.ahmed.dagger2example.car.Car;

import javax.inject.Named;
import javax.inject.Singleton;

import dagger.BindsInstance;
import dagger.Component;
//@Component(modules ={ WheelsModel.class,DieselEngineModule.class})
//@Component(modules ={ WheelsModel.class,DieselEngineModule.class,PetrolEngineModule.class})
@Singleton
@Component(modules ={ WheelsModel.class,PetrolEngineModule.class})
public interface CarComponent{

     Car getCar();
     void Inject(MainActivity mainActivity);

     @Component.Builder
     interface Builder{
     @BindsInstance
     Builder  horsePower(@Named("horse pwoer") int horsePower);

     @BindsInstance
     Builder  EngineCapcity(@Named("engine capicity")int engineCapcity);
     CarComponent bulid();


    }
}
