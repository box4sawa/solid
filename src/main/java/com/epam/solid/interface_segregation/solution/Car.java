package com.epam.solid.interface_segregation.solution;

import com.epam.solid.interface_segregation.solution.interfaces.RadioSwitch;

public class Car extends Machine implements RadioSwitch {

    private boolean radioOn;

    public boolean isRadioOn() {
        return radioOn;
    }

    @Override
    public void turnRadioOn() {
        radioOn = true;
    }

    @Override
    public void turnRadioOff() {
        radioOn = false;
    }
}