package com.geekhub.hw2.entity;

import com.geekhub.hw2.parts.EnergySource;
import com.geekhub.hw2.parts.Engine;
import com.geekhub.hw2.parts.Gear;

public class SolarCar extends Car{

    public SolarCar(EnergySource energySource, Engine engine, Gear gear) {
        super(energySource, engine, gear);
    }

    @Override
    public String getName(){
        return "Solar Car";
    }
}