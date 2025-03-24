package com.example.assignment3;

/**
 * @class GarageDoor
 * @brief This class represents a garage door.
 */
public class GarageDoor {
    private boolean isOpen;

    /**
     * @brief Opens the garage door.
     */
    public void open() {
        isOpen = true;
        System.out.println("Garage door is OPEN");
    }

    /**
     * @brief Closes the garage door.
     */
    public void close() {
        isOpen = false;
        System.out.println("Garage door is CLOSED");
    }

    /**
     * @brief Checks if the garage door is open.
     * @return true if the garage door is open, false otherwise.
     */
    public boolean isOpen() {
        return isOpen;
    }
}