package com.example.assignment3;

/**
 * @class AllLightsCommand
 * @brief This class represents a command to control all lights.
 */
public class AllLightsCommand implements Command {
    private Light[] lights;
    private boolean isOn;

    /**
     * @brief Constructor for AllLightsCommand.
     * @param lights Array of lights to be controlled.
     * @param isOn The desired state of all lights.
     */
    public AllLightsCommand(Light[] lights, boolean isOn) {
        this.lights = lights;
        this.isOn = isOn;
    }

    /**
     * @brief Executes the command to turn all lights on or off.
     */
    @Override
    public void execute() {
        if (isOn) {
            System.out.println("All lights are turned ON");
        } else {
            System.out.println("All lights are turned OFF");
        }
        for (Light light : lights) {
            if (isOn) {
                light.on();
            } else {
                light.off();
            }
        }
    }

    /**
     * @brief Undoes the command to turn all lights on or off.
     */
    @Override
    public void undo() {
        for (Light light : lights) {
            if (isOn) {
                light.off();
            } else {
                light.on();
            }
        }
    }
}
