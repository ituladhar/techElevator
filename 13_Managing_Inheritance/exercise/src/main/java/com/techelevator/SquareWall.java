package com.techelevator;

public class SquareWall extends RectangleWall {
        private int sideLength;

    //<editor-fold desc="Constructor and Getters">
    public SquareWall(String name, String color, int sideLength) {
        super(name, color, sideLength, sideLength);
        this.sideLength = sideLength;
    }

    public int getSideLength() {
        return sideLength;
    }
    //</editor-fold>

    // Methods

    public String toString() {
        return getName() + " (" + getSideLength() + "x" + getLength() + ") " + "square";
    }

    @Override
    public int getArea() {
        return getSideLength() * getSideLength();
    }
}
