package com.epam.solid.single_responsibility.solution;

public class Car {
    private final int MAX_FUEL = 20;
    private int remainingFuel = MAX_FUEL;

    public int getMaxFuel() {
        return MAX_FUEL;
    }

    public int getRemainingFuel() {
        return remainingFuel;
    }

    public void setRemainingFuel(final int remainingFuel) {
        this.remainingFuel = remainingFuel;
    }

    public void accelerate() {
        System.out.println("Accelerate!");
        remainingFuel--;
    }

    @Override
    public String toString() {
        return "Car{" +
                "MAX_FUEL=" + MAX_FUEL +
                ", remainingFuel=" + remainingFuel +
                '}';
    }
}
