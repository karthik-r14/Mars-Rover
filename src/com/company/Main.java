package com.company;

public class Main {

    public static void main(String[] args) {
        InputOutput inputOutput = new InputOutput();
        String roverPosition;
        String roverCommands;

        inputOutput.outputData("Enter Rover Position");
        roverPosition = inputOutput.inputData();
        inputOutput.outputData("Enter Rover commands");
        roverCommands = inputOutput.inputData();

        Rover rover = new Rover(roverPosition, roverCommands);
        rover.computeFinalPosition();
        rover.displayFinalPosition();
    }
}

