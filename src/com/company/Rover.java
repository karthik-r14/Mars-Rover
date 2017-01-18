package com.company;

public class Rover {
    private Position initialPosition;
    private Position finalPosition;
    private String commands;

    public Rover(String initialPosition, String commands) {
        this.commands = commands;
        PositionParser positionParser = new PositionParser(initialPosition);
        this.initialPosition = positionParser.parse();
    }

    public void computeFinalPosition() {
        Position temporaryPosition = new Position(initialPosition.getxPosition(),
                initialPosition.getyPosition(), initialPosition.getDirection());

        for (int i = 0; i < commands.length(); i++) {
            char command = commands.charAt(i);
            switch (command) {
                case 'L':
                    temporaryPosition.setDirection(getUpdatedDirection('L', temporaryPosition.getDirection()));
                    break;
                case 'R':
                    temporaryPosition.setDirection(getUpdatedDirection('R', temporaryPosition.getDirection()));
                    break;
                case 'M':
                    if(temporaryPosition.getDirection() == 'E' || temporaryPosition.getDirection() == 'W')
                        temporaryPosition.setxPosition(getUpdatedPosition(temporaryPosition.getDirection(), temporaryPosition.getxPosition()));
                    else
                        temporaryPosition.setyPosition(getUpdatedPosition(temporaryPosition.getDirection(), temporaryPosition.getyPosition()));
            }
        }
        finalPosition = temporaryPosition;
    }

    private int getUpdatedPosition(char direction, int position) {
        switch (direction) {
            case 'N':
                position += 1;
                break;
            case 'S':
                position -= 1;
                break;
            case 'E':
                position += 1;
                break;
            case 'W':
                position -= 1;
                break;
        }
        return position;
    }

    public void displayFinalPosition() {
        finalPosition.displayPosition();
    }

    private char getUpdatedDirection(char command, char direction) {
        char updatedDirection = 'N';

        switch (direction) {
            case 'N':
                if (command == 'L')
                    updatedDirection = 'W';
                else if (command == 'R')
                    updatedDirection = 'E';
                break;
            case 'E':
                if (command == 'L')
                    updatedDirection = 'N';
                else if (command == 'R')
                    updatedDirection = 'S';
                break;
            case 'W':
                if (command == 'L')
                    updatedDirection = 'S';
                else if (command == 'R')
                    updatedDirection = 'N';
                break;
            case 'S':
                if (command == 'L')
                    updatedDirection = 'E';
                else if (command == 'R')
                    updatedDirection = 'W';
        }

        return updatedDirection;
    }
}
