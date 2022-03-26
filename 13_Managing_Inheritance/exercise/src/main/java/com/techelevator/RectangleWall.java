package com.techelevator;

public class RectangleWall extends Wall{
    private int length;
    private int height;

    //<editor-fold desc="Constructor and Getters">
    public RectangleWall(String name, String color, int length, int height) {
        super(name, color);
        this.length = length;
        this.height = height;
    }

    public int getLength() {
        return length;
    }

    public int getHeight() {
        return height;
    }
    //</editor-fold>

    //Methods
    public int getArea(){
        return  getLength() * getHeight();
    }

    //Add a toString() method that returns a String
    public String toString(){
        return getName() + " ("+ getLength() + "x" + getHeight() +") " + "rectangle";
    }
}
