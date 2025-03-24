package com.example.assignment3;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * @class RemoteControlGUI
 * @brief This class represents the graphical user interface for the remote control.
 */
public class RemoteControlGUI {
    private JFrame frame;
    private RemoteControl remote;

    /**
     * @brief Constructor for RemoteControlGUI.
     * Sets up the GUI components and assigns commands to the remote control.
     */
    public RemoteControlGUI() {
        remote = new RemoteControl();

        Light livingRoomLight = new Light("Living room");
        Light outdoorLight = new Light("Outdoor");
        Light[] allLights = {livingRoomLight, outdoorLight};

        AirConditioner airConditioner = new AirConditioner();
        GarageDoor garageDoor = new GarageDoor();

        Command airConditionerOnCommand = new AirConditionerCommand(airConditioner, true);
        Command airConditionerOffCommand = new AirConditionerCommand(airConditioner, false);
        Command garageDoorOpenCommand = new GarageDoorCommand(garageDoor, true);
        Command garageDoorCloseCommand = new GarageDoorCommand(garageDoor, false);
        Command livingRoomLightOnCommand = new LightCommand(livingRoomLight, true);
        Command livingRoomLightOffCommand = new LightCommand(livingRoomLight, false);
        Command outdoorLightOnCommand = new LightCommand(outdoorLight, true);
        Command outdoorLightOffCommand = new LightCommand(outdoorLight, false);
        Command allLightsOnCommand = new AllLightsCommand(allLights, true);
        Command allLightsOffCommand = new AllLightsCommand(allLights, false);
        Command resetAllButtonsCommand = new ResetAllButtonsCommand(remote);
        Command noCommand = new NoCommand();

        remote.setCommand(0, airConditionerOnCommand, airConditionerOffCommand);
        remote.setCommand(1, garageDoorOpenCommand, garageDoorCloseCommand);
        remote.setCommand(2, livingRoomLightOnCommand, livingRoomLightOffCommand);
        remote.setCommand(3, outdoorLightOnCommand, outdoorLightOffCommand);
        remote.setCommand(4, allLightsOnCommand, allLightsOffCommand);
        remote.setCommand(5, resetAllButtonsCommand, null);
        remote.setCommand(6, noCommand, noCommand); // Unused slot

        frame = new JFrame("Remote Control");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 400);
        frame.setLayout(new GridLayout(4, 4));

        JButton acOnButton = new JButton("Air Conditioner ON");
        JButton acOffButton = new JButton("Air Conditioner OFF");
        JButton garageOpenButton = new JButton("Garage Door OPEN");
        JButton garageCloseButton = new JButton("Garage Door CLOSE");
        JButton livingRoomLightOnButton = new JButton("Living Room Light ON");
        JButton livingRoomLightOffButton = new JButton("Living Room Light OFF");
        JButton outdoorLightOnButton = new JButton("Outdoor Light ON");
        JButton outdoorLightOffButton = new JButton("Outdoor Light OFF");
        JButton allLightsOnButton = new JButton("All Lights ON");
        JButton allLightsOffButton = new JButton("All Lights OFF");
        JButton resetButton = new JButton("Reset All Buttons");
        JButton undoButton = new JButton("Undo");
        JButton unusedSlotButton = new JButton("Unused Slot");

        acOnButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                remote.pressButton(0, true);
            }
        });

        acOffButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                remote.pressButton(0, false);
            }
        });

        garageOpenButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                remote.pressButton(1, true);
            }
        });

        garageCloseButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                remote.pressButton(1, false);
            }
        });

        livingRoomLightOnButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                remote.pressButton(2, true);
            }
        });

        livingRoomLightOffButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                remote.pressButton(2, false);
            }
        });

        outdoorLightOnButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                remote.pressButton(3, true);
            }
        });

        outdoorLightOffButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                remote.pressButton(3, false);
            }
        });

        allLightsOnButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                remote.pressButton(4, true);
            }
        });

        allLightsOffButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                remote.pressButton(4, false);
            }
        });

        resetButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                remote.resetAllButtons();
            }
        });

        undoButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                remote.pressUndo();
            }
        });

        unusedSlotButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Unused slot. This slot is not programmed.");
            }
        });

        frame.add(acOnButton);
        frame.add(acOffButton);
        frame.add(garageOpenButton);
        frame.add(garageCloseButton);
        frame.add(livingRoomLightOnButton);
        frame.add(livingRoomLightOffButton);
        frame.add(outdoorLightOnButton);
        frame.add(outdoorLightOffButton);
        frame.add(allLightsOnButton);
        frame.add(allLightsOffButton);
        frame.add(resetButton);
        frame.add(undoButton);
        frame.add(unusedSlotButton);

        frame.setVisible(true);
    }

    /**
     * @brief Main method to launch the RemoteControlGUI.
     * @param args Command line arguments.
     */
    public static void main(String[] args) {
        new RemoteControlGUI();
    }
}
