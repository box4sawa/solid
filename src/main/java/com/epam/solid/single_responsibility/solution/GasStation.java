package com.epam.solid.single_responsibility.solution;

public class GasStation {
    public void reFuel(final Car car){
        System.out.println("Refuel!");
        final int remainingFuel = car.getRemainingFuel();
        final int additionalFuel = car.getMaxFuel() - remainingFuel;
        car.setRemainingFuel(remainingFuel + additionalFuel);
    }

    public static void main(String[] args) {
        Car car = new Car();
        System.out.println(car);

        car.accelerate();
        car.accelerate();

        System.out.println(car);

        new GasStation().reFuel(car);

        System.out.println(car);
    }
}
