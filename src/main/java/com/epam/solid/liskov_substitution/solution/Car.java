package com.epam.solid.liskov_substitution.solution;

public class Car extends Machine {
    @Override
    public void changeGear(Gear gear) {
        if (isMovingForwards() || isMovingBackwards()) {
            stop();
        }
        super.changeGear(gear);
    }

    private boolean isMovingBackwards() {
        return isMoving() && Gear.R == getGear();
    }

    private boolean isMovingForwards() {
        return isMoving() && Gear.D == getGear();
    }
}
