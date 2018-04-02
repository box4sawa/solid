package com.epam.solid.interface_segregation.solution;

import com.epam.solid.interface_segregation.solution.interfaces.EngineSwitch;

public class Machine implements EngineSwitch {
    private boolean engineRunning;

    public boolean isEngineRunning() {
        return engineRunning;
    }

    @Override
    public void startEngine() {
        engineRunning = true;
    }

    @Override
    public void shutDownEngine() {
        engineRunning = false;
    }
}
