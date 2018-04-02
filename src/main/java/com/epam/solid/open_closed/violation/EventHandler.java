package com.epam.solid.open_closed.violation;

public class EventHandler {
    private Car car;

    public EventHandler(Car car) {
        this.car = car;
    }

    public void changeDrivingMode(final DrivingMode drivingMode){
        switch (drivingMode){
            case SPORT:
                car.setPower(500);
                car.setSuspensionHeight(10);
                break;
            case COMFORT:
                car.setPower(400);
                car.setSuspensionHeight(20);
                break;
            default:
                car.setPower(300);
                car.setSuspensionHeight(25);
                break;
                //when we need to add another mode (e.g. ECONOMY) 2 classes will change DrivingMode and EventHandler.
        }
    }
}
