package com.techelevator;

public class Elevator {
    private int currentFloor = 1;
    private  int numberOfFloors;
    private boolean doorOpen;

    //Constructor
    public  Elevator(int numberOfLevels) {
        this.numberOfFloors= numberOfLevels;
    }

    //getter
    public int getCurrentFloor(){ return currentFloor;}
    public int getNumberOfFloors(){ return numberOfFloors;}
    public boolean isDoorOpen(){return doorOpen;}

    //Methods
    public void openDoor(){this.doorOpen =true;}
    public void closeDoor(){this.doorOpen=false;}
    public void goUp(int desiredFloor){
        if(!doorOpen) {
            if(desiredFloor >= this.currentFloor && desiredFloor <= numberOfFloors)
                this.currentFloor = desiredFloor;
        }
    }
    public void goDown(int desiredFloor){
        if (!doorOpen) {
            if (desiredFloor <= this.currentFloor && desiredFloor > 0)
                this.currentFloor = desiredFloor;
        }
    }



}
