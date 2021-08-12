package com.techelevator;

public class Elevator {

    private int currentFloor = 1;
    private int numberOfFloors;
    private boolean doorOpen;

    public Elevator(int numberOfLevels){
        numberOfFloors = numberOfLevels;
    }

    public int getCurrentFloor() {
        return currentFloor;
    }

    public int getNumberOfFloors() {
        return numberOfFloors;
    }

    public boolean isDoorOpen() {
        return doorOpen;
    }


    public void openDoor(){
        doorOpen = true;
    }

    public void closeDoor(){
        doorOpen = false;
    }

   public  void goUp(int desiredFloor){

        int lastFloor =  getNumberOfFloors();
        boolean floorInRange =  (desiredFloor <= lastFloor) && (desiredFloor > getCurrentFloor());

        if((!isDoorOpen()) && floorInRange){
            currentFloor = desiredFloor;
        }
    }

    public void goDown(int desiredFloor){

        boolean floorInRange =  (desiredFloor > 0) && (desiredFloor < getCurrentFloor());

        if((!isDoorOpen()) && floorInRange){
            currentFloor = desiredFloor;
        }
    }

}
