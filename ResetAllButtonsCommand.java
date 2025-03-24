package com.example.assignment3;

/**
 * @class ResetAllButtonsCommand
 * @brief This class represents a command to reset all buttons on the remote control.
 */
public class ResetAllButtonsCommand implements Command {
    private RemoteControl remoteControl;

    /**
     * @brief Constructor for ResetAllButtonsCommand.
     * @param remoteControl The remote control to be reset.
     */
    public ResetAllButtonsCommand(RemoteControl remoteControl) {
        this.remoteControl = remoteControl;
    }

    /**
     * @brief Executes the reset all buttons command.
     * This method resets all buttons on the remote control and prints a confirmation message.
     */
    @Override
    public void execute() {
        remoteControl.resetAllButtons();
        System.out.println("All buttons have been reset.");
    }

    /**
     * @brief Undoes the reset all buttons command.
     * This method prints a message indicating that the reset all buttons command cannot be undone.
     */
    @Override
    public void undo() {
        System.out.println("Cannot undo reset all buttons command.");
    }
}