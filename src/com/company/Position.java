package com.company;

public class Position {
    private int xPosition;
    private int yPosition;
    private char direction;

    public Position(int xPosition, int yPosition, char direction) {
        this.xPosition = xPosition;
        this.yPosition = yPosition;
        this.direction = direction;
    }

    public int getxPosition() {
        return xPosition;
    }

    public int getyPosition() {
        return yPosition;
    }

    public char getDirection() {
        return direction;
    }

    public void setxPosition(int xPosition) {
        this.xPosition = xPosition;
    }

    public void setyPosition(int yPosition) {
        this.yPosition = yPosition;
    }

    public void setDirection(char direction) {
        this.direction = direction;
    }

    public void displayPosition() {
        InputOutput inputOutput = new InputOutput();
        inputOutput.outputData("Position :" + xPosition + " " + yPosition + " " + direction);
    }

    @Override
    public boolean equals(Object o) {

        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Position position = (Position) o;

        if (xPosition != position.xPosition) return false;
        if (yPosition != position.yPosition) return false;
        return direction == position.direction;
    }

    @Override
    public int hashCode() {
        int result = xPosition;
        result = 31 * result + yPosition;
        result = 31 * result + (int) direction;
        return result;
    }
}
