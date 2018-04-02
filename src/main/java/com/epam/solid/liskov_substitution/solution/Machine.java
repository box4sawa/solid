package com.epam.solid.liskov_substitution.solution;

public abstract class Machine {
    private boolean isMoving;
    private Gear gear;

    public void move(){
        isMoving = true;
    }

    public void stop(){
        isMoving = false;
    }

    public boolean isMoving() {
        return isMoving;
    }

    public Gear getGear() {
        return gear;
    }

    public void changeGear(final Gear gear) {
        this.gear = gear;
    }
}
