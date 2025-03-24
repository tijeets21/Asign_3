package com.example.assignment3;

/**
 * @class GarageDoorCommand
 * @brief This class represents a command to control the garage door.
 */
public class GarageDoorCommand implements Command {
    private GarageDoor garageDoor;
    private boolean isOpen;

    /**
     * @brief Constructor for GarageDoorCommand.
     * @param garageDoor The garage door to be controlled.
     * @param isOpen The desired state of the garage door.
     */
    public GarageDoorCommand(GarageDoor garageDoor, boolean isOpen) {
        this.garageDoor = garageDoor;
        this.isOpen = isOpen;
    }

    /**
     * @brief Executes the command to open or close the garage door.
     */
    @Override
    public void execute() {
        if (isOpen) {
            garageDoor.open();
        } else {
            garageDoor.close();
        }
    }

    /**
     * @brief Undoes the command to open or close the garage door.
     */
    @Override
    public void undo() {
        if (isOpen) {
            garageDoor.close();
        } else {
            garageDoor.open();
        }
    }
}
