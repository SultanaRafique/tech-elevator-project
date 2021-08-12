package com.techelevator;

public class Airplane {
    String planeNumber;
    private int totalFirstClassSeats;
    private int bookedFirstClassSeats;
    private int availableFirstClassSeats;
    private int totalCoachSeats;
    private int bookedCoachSeats;
    private int availableCoachSeats;

    public Airplane(String planeNumber, int totalFirstClassSeats, int totalCoachSeats) {
        this.planeNumber = planeNumber;
        this.totalFirstClassSeats = totalFirstClassSeats;
        this.totalCoachSeats = totalCoachSeats;
    }

    public String getPlaneNumber() {
        return planeNumber;
    }

    public int getTotalFirstClassSeats() {
        return totalFirstClassSeats;
    }

    public int getBookedFirstClassSeats() {
        return bookedFirstClassSeats;
    }

    public int getAvailableFirstClassSeats() {
        return getTotalFirstClassSeats() - getBookedFirstClassSeats();
    }

    public int getTotalCoachSeats() {
        return totalCoachSeats;
    }

    public int getBookedCoachSeats() {
        return bookedCoachSeats;
    }

    public int getAvailableCoachSeats() {
        return getTotalCoachSeats() - getBookedCoachSeats();
    }

    public boolean reserveSeats(boolean forFirstClass, int totalNumberOfSeats){
        boolean result = false;
        boolean isFirstClassAvailable  = getAvailableFirstClassSeats() >= totalNumberOfSeats;
        boolean isCoachSeatAvailable  = getAvailableCoachSeats() >= totalNumberOfSeats;


        if (forFirstClass && isFirstClassAvailable) {
            bookedFirstClassSeats += totalNumberOfSeats;
            result = true;
        }else if((!forFirstClass) && isCoachSeatAvailable ){
            bookedCoachSeats += totalNumberOfSeats;
            result = true;
        }

        return result;
    }


}
