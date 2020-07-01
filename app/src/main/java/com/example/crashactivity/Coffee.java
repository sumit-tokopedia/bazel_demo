package com.example.crashactivity;

import dagger.Component;
import javax.inject.Singleton;

  @Singleton
  @Component(modules = { DripCoffeeModule.class })
  public interface Coffee {
    CoffeeMaker maker();
  }

