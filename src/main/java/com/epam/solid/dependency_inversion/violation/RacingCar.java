package com.epam.solid.dependency_inversion.violation;

public class RacingCar {
    private final int maxFuel;
    private int remainingFuel;
    private int power;

    public RacingCar(int maxFuel) {
        this.maxFuel = maxFuel;
        remainingFuel = maxFuel;
    }

    public void accelerate(){
        power++;
        remainingFuel--;
    }
}
