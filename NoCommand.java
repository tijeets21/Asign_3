package com.example.assignment3;

/**
 * @class NoCommand
 * @brief This class represents a no-operation command.
 */
public class NoCommand implements Command {
    /**
     * @brief Executes the no-operation command.
     * This method prints a message indicating that no command is assigned to the slot.
     */
    @Override
    public void execute() {
        System.out.println("No command assigned to this slot.");
    }

    /**
     * @brief Undoes the no-operation command.
     * This method prints a message indicating that there is no command to undo.
     */
    @Override
    public void undo() {
        System.out.println("No command to undo.");
    }
}