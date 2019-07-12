package com.ahmed.dagger2example;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.ahmed.dagger2example.car.Car;
import com.ahmed.dagger2example.dagger.CarComponent;
import com.ahmed.dagger2example.dagger.DaggerCarComponent;
import com.ahmed.dagger2example.dagger.DieselEngineModule;
import javax.inject.Inject;
import dagger.internal.DaggerCollections;
// https://www.youtube.com/watch?v=wJkHYBf8VkA

public class MainActivity extends AppCompatActivity {

    @Inject
    Car car,car1;

    @Override
    protected void onCreate(Bundle savedInstanceState){
      super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // CarComponent carComponent = DaggerCarComponent.create();
        CarComponent carComponent = DaggerCarComponent.builder().horsePower(30).EngineCapcity(59).bulid();
        //CarComponent carComponent2 = DaggerCarComponent.builder().horsePower(33).EngineCapcity(90).bulid();
        // dieselEngineModule(new DieselEngineModule(40)).build();
        // CarComponent carComponent = DaggerCarComponent.builder().dieselEngineModule(new DieselEngineModule(40)).build();
        carComponent.Inject(this);
        // carComponent.getCar().drive();
        car1.drive();
        car.drive();
    }
}



























