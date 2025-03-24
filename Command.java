package com.example.assignment3;

/**
 * @interface Command
 * @brief Interface for command objects.
 */
public interface Command {
    /**
     * @brief Executes the command.
     */
    void execute();

    /**
     * @brief Undoes the command.
     */
    void undo();
}