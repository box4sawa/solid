package com.epam.solid.interface_segregation.solution;

import com.epam.solid.interface_segregation.solution.interfaces.CameraSwitch;

public class Drone extends Machine implements CameraSwitch {

    private boolean cameraOn;

    public boolean isCameraOn() {
        return cameraOn;
    }

    @Override
    public void turnCameraOn() {
        cameraOn = true;
    }

    @Override
    public void turnCameraOff() {
        cameraOn = false;
    }
}