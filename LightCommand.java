package com.example.assignment3;

/**
 * @class LightCommand
 * @brief This class represents a command to control a light.
 */
public class LightCommand implements Command {
    private Light light;
    private boolean isOn;

    /**
     * @brief Constructor for LightCommand.
     * @param light The light to be controlled.
     * @param isOn The desired state of the light.
     */
    public LightCommand(Light light, boolean isOn) {
        this.light = light;
        this.isOn = isOn;
    }

    /**
     * @brief Executes the command to turn the light on or off.
     */
    @Override
    public void execute() {
        if (isOn) {
            light.on();
        } else {
            light.off();
        }
    }

    /**
     * @brief Undoes the command to turn the light on or off.
     */
    @Override
    public void undo() {
        if (isOn) {
            light.off();
        } else {
            light.on();
        }
    }
}
