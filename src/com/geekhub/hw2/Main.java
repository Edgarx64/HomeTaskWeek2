package com.geekhub.hw2;

import com.geekhub.hw2.entity.Boat;
import com.geekhub.hw2.entity.Car;
import com.geekhub.hw2.entity.SolarCar;
import com.geekhub.hw2.vehicle.Direction;
import com.geekhub.hw2.vehicle.Driveable;
import com.geekhub.hw2.vehicle.Vehicle;

public class Main {

    public static void main(String[] args) {
        //TODO: Invoke testDrive method for every vehicle
        Vehicle[] vehicles = {
                new Car(() -> new Energy(20),
                        energy -> new Force(energy.getAmount()),
                        force -> force.setAmount(force.getAmount() - 1)),
                new Boat(() -> new Energy(30),
                        energy -> new Force(energy.getAmount()),
                        force -> force.setAmount(force.getAmount() - 1)),
                new SolarCar(() -> new Energy(15),
                        energy -> new Force(energy.getAmount()),
                        force -> force.setAmount(force.getAmount() - 1))
        };

        for (Vehicle vehicle : vehicles) {
            testDrive(vehicle);
        }
    }

    private static void testDrive(Driveable driveable) {
        driveable.accelerate();
        driveable.turn(Direction.LEFT);
        driveable.turn(Direction.RIGHT);
        driveable.brake();
        driveable.accelerate();
        driveable.brake();
    }
}
