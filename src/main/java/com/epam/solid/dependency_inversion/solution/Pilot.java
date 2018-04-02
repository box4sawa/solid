package com.epam.solid.dependency_inversion.solution;


import java.util.Objects;

public class Pilot {
    private Machine machine;

    public Pilot(Machine machine){
        if (Objects.isNull(machine))
            machine = new RacingCar(100);
        this.machine = machine;
    }

    public void increaseSpeed(){
        machine.accelerate();
    }
}