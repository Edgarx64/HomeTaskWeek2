package com.geekhub.hw2.entity;

import com.geekhub.hw2.Energy;
import com.geekhub.hw2.Force;
import com.geekhub.hw2.parts.EnergySource;
import com.geekhub.hw2.parts.Engine;
import com.geekhub.hw2.parts.Gear;
import com.geekhub.hw2.vehicle.Direction;
import com.geekhub.hw2.vehicle.Vehicle;

public class Car extends Vehicle {

    private Force force;

    public Car(EnergySource energySource, Engine engine, Gear gear) {
        super(energySource, engine, gear);
        Energy energy = energySource.get();
        force = engine.transform(energy);
    }

    @Override
    public void accelerate() {
        gear.consume(force);
        System.out.println(getName() + " gear " + force.getAmount());
    }

    @Override
    public void turn(Direction direction) {
        System.out.println(getName() + " turn " + direction.name());
    }

    @Override
    public void brake() {
        System.out.println(getName() + " stop");
    }

    public String getName(){
        return "Car";
    }
}