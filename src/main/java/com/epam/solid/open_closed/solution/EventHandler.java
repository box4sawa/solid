package com.epam.solid.open_closed.solution;

import com.epam.solid.open_closed.solution.mode.DrivingMode;

public class EventHandler {
    private Car car;

    public EventHandler(Car car) {
        this.car = car;
    }

    public void changeDrivingMode(DrivingMode drivingMode){
        car.setPower(drivingMode.getPower());
        car.setSuspensionHeight(drivingMode.getSuspensionHeight());
        // now, when we need to add another mode (e.g. ECONOMY) just create a new class: Economy.
    }
}
