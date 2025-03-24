package com.example.assignment3;

/**
 * @class RemoteControlTest
 * @brief This class tests the functionality of the RemoteControl and its commands.
 */
public class RemoteControlTest {
    /**
     * @brief Main method to test the RemoteControl.
     * @param args Command line arguments.
     */
    public static void main(String[] args) {
        RemoteControl remote = new RemoteControl();

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

        remote.pressButton(0, true); // Air Conditioner ON
        remote.pressButton(0, false); // Air Conditioner OFF
        remote.pressButton(1, true); // Garage Door OPEN
        remote.pressButton(1, false); // Garage Door CLOSE
        remote.pressButton(2, true); // Living Room Light ON
        remote.pressButton(2, false); // Living Room Light OFF
        remote.pressButton(3, true); // Outdoor Light ON
        remote.pressButton(3, false); // Outdoor Light OFF
        remote.pressButton(4, true); // All Lights ON
        remote.pressButton(4, false); // All Lights OFF
        remote.resetAllButtons(); // Reset All Buttons
        remote.pressUndo(); // Undo last command
    }
}
