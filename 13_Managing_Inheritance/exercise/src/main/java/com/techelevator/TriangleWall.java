package com.techelevator;

public class TriangleWall extends Wall{
    private int base;
    private int height;

    //<editor-fold desc="Constructor and Getters">
    public TriangleWall(String name, String color, int base, int height) {
        super(name, color);
        this.base = base;
        this.height = height;
    }

    public int getBase() {
        return base;
    }

    public int getHeight() {
        return height;
    }
    //</editor-fold>

    //Method
    public int getArea(){
        return (getBase()  * getHeight()) /2;
    }

    public String toString(){
        return getName() +" (" + getBase() + "x" + getHeight() + ") " + "triangle";
    }
}
