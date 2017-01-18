package com.company;

public class PositionParser {

    private String position;

    public PositionParser(String position) {
        this.position = position;
    }

    public Position parse() {
        int xPosition,yPosition;
        char direction;
        xPosition = Character.getNumericValue(position.charAt(0));
        yPosition = Character.getNumericValue(position.charAt(2));
        direction = position.charAt(4);
        return new Position(xPosition, yPosition, direction);
    }
}
