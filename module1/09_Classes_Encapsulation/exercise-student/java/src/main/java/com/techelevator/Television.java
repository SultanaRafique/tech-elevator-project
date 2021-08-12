package com.techelevator;

public class Television {

    private boolean isOn = false;
    private int currentChannel = 3;
    private int currentVolume = 2;

    public boolean isOn() {

        return isOn;
    }

    public int getCurrentChannel() {

        return currentChannel;
    }

    public int getCurrentVolume() {

        return currentVolume;
    }

    public void turnOff(){

        isOn = false;
    }

    public void turnOn(){
        isOn = true;
        currentChannel = 3;
        currentVolume = 2;
    }

    public void changeChannel(int newChannel){

       boolean channelInRange = newChannel >= 3 && newChannel <= 18;
       if(channelInRange && isOn){
           currentChannel = newChannel;
       }

    }

    public void channelUp(){
        int minChannel = 3;

        boolean channelInRange = (getCurrentChannel() + 1) >= 3 && (getCurrentChannel() + 1) <= 18;
        boolean channelupRange = (getCurrentChannel() + 1) > 18;

        if(isOn() && channelInRange){
            currentChannel++;
        }else if(isOn() && channelupRange){
            currentChannel = minChannel;
        }
    }

    public void channelDown(){
        int maxChannel = 18;

        boolean channelInRange = (getCurrentChannel() - 1) >= 3 && (getCurrentChannel() - 1) <= 18;
        boolean channeldownRange = (getCurrentChannel() - 1) < 3;

        if(isOn() && channelInRange){
            currentChannel--;
        }else if(isOn() && channeldownRange){
            currentChannel = maxChannel;
        }
    }

    public void raiseVolume(){
        boolean volumelInRange = (getCurrentVolume() + 1) >= 0 && (getCurrentVolume() + 1) <= 10;

        if(isOn && volumelInRange){
            currentVolume++;
        }
    }

    public void lowerVolume(){
        boolean volumelInRange = (getCurrentVolume() - 1) >= 0 && (getCurrentVolume() - 1) <= 10;

        if(isOn && volumelInRange){
            currentVolume--;
        }
    }
}
