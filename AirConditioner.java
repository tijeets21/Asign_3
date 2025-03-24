package com.example.assignment3;

/**
 * @class AirConditioner
 * @brief This class represents an air conditioner.
 */
public class AirConditioner {
    private boolean isOn;

    /**
     * @brief Turns the air conditioner on.
     */
    public void on() {
        isOn = true;
        System.out.println("Air conditioner is ON");
    }

    /**
     * @brief Turns the air conditioner off.
     */
    public void off() {
        isOn = false;
        System.out.println("Air conditioner is OFF");
    }

    /**
     * @brief Checks if the air conditioner is on.
     * @return true if the air conditioner is on, false otherwise.
     */
    public boolean isOn() {
        return isOn;
    }
}