package com.example.assignment3;

/**
 * @class RemoteControl
 * @brief This class represents a remote control with programmable slots.
 */
public class RemoteControl {
    private Command[] onCommands;
    private Command[] offCommands;
    private Command undoCommand;

    /**
     * @brief Constructor for RemoteControl.
     * Initializes the command arrays and sets default commands to NoCommand.
     */
    public RemoteControl() {
        onCommands = new Command[7];
        offCommands = new Command[7];
        Command noCommand = new NoCommand();
        for (int i = 0; i < 7; i++) {
            onCommands[i] = noCommand;
            offCommands[i] = noCommand;
        }
        undoCommand = noCommand;
    }

    /**
     * @brief Sets the commands for a specific slot.
     * @param slot The slot number.
     * @param onCommand The command to execute when turning on.
     * @param offCommand The command to execute when turning off.
     */
    public void setCommand(int slot, Command onCommand, Command offCommand) {
        onCommands[slot] = onCommand;
        offCommands[slot] = offCommand;
    }

    /**
     * @brief Presses the button for a specific slot.
     * @param slot The slot number.
     * @param isOn True if turning on, false if turning off.
     */
    public void pressButton(int slot, boolean isOn) {
        if (isOn) {
            onCommands[slot].execute();
            undoCommand = onCommands[slot];
        } else {
            offCommands[slot].execute();
            undoCommand = offCommands[slot];
        }
    }

    /**
     * @brief Presses the undo button to undo the last command.
     */
    public void pressUndo() {
        undoCommand.undo();
    }

    /**
     * @brief Resets all buttons to NoCommand.
     */
    public void resetAllButtons() {
        Command noCommand = new NoCommand();
        for (int i = 0; i < 7; i++) {
            onCommands[i] = noCommand;
            offCommands[i] = noCommand;
        }
        undoCommand = noCommand;
        System.out.println("All buttons have been reset.");
    }
}