package com.example.assignment3;

/**
 * @class Light
 * @brief This class represents a light.
 */
public class Light {
    private String location;
    private boolean isOn;

    /**
     * @brief Constructor for Light.
     * @param location The location of the light.
     */
    public Light(String location) {
        this.location = location;
    }

    /**
     * @brief Turns the light on.
     */
    public void on() {
        isOn = true;
        System.out.println(location + " light is ON");
    }

    /**
     * @brief Turns the light off.
     */
    public void off() {
        isOn = false;
        System.out.println(location + " light is OFF");
    }

    /**
     * @brief Gets the location of the light.
     * @return The location of the light.
     */
    public String getLocation() {
        return location;
    }

    /**
     * @brief Checks if the light is on.
     * @return true if the light is on, false otherwise.
     */
    public boolean isOn() {
        return isOn;
    }
}