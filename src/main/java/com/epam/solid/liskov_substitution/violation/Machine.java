package com.epam.solid.liskov_substitution.violation;

public abstract class Machine {
    private Gear gear;

    public Gear getGear() {
        return gear;
    }

    public void changeGear(Gear gear) {
        this.gear = gear;
    }
}
