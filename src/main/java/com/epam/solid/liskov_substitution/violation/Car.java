package com.epam.solid.liskov_substitution.violation;

public class Car extends Machine {
    @Override
    public void changeGear(Gear gear) {
        if(Gear.R == gear && getGear() == Gear.D) {
            throw new RuntimeException("Can't change to REVERSE gear when " + getGear().toString() + " gear is engaged!");
        }
    }
}
