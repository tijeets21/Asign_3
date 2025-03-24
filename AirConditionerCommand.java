package com.example.assignment3;

/**
 * @class AirConditionerCommand
 * @brief This class represents a command to control the air conditioner.
 */
public class AirConditionerCommand implements Command {
    private AirConditioner airConditioner;
    private boolean isOn;

    /**
     * @brief Constructor for AirConditionerCommand.
     * @param airConditioner The air conditioner to be controlled.
     * @param isOn The desired state of the air conditioner.
     */
    public AirConditionerCommand(AirConditioner airConditioner, boolean isOn) {
        this.airConditioner = airConditioner;
        this.isOn = isOn;
    }

    /**
     * @brief Executes the command to turn the air conditioner on or off.
     */
    @Override
    public void execute() {
        if (isOn) {
            airConditioner.on();
        } else {
            airConditioner.off();
        }
    }

    /**
     * @brief Undoes the command to turn the air conditioner on or off.
     */
    @Override
    public void undo() {
        if (isOn) {
            airConditioner.off();
        } else {
            airConditioner.on();
        }
    }
}
