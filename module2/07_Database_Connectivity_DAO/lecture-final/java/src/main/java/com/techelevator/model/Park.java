package com.techelevator.model;

import java.time.LocalDate;

public class Park {

    private long parkId;
    private String parkName;
    private LocalDate dateEstablished;
    private double area;
    private boolean hasCamping;

    // This is a HACK to make things work
    private String stateAbbreviation;

    public long getParkId() {
        return parkId;
    }

    public void setParkId(long parkId) {
        this.parkId = parkId;
    }

    public String getParkName() {
        return parkName;
    }

    public void setParkName(String parkName) {
        this.parkName = parkName;
    }

    public LocalDate getDateEstablished() {
        return dateEstablished;
    }

    public void setDateEstablished(LocalDate dateEstablished) {
        this.dateEstablished = dateEstablished;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public boolean getHasCamping() {
        return hasCamping;
    }

    public void setHasCamping(boolean hasCamping) {
        this.hasCamping = hasCamping;
    }

    public String getStateAbbreviation() {
        return stateAbbreviation;
    }

    public void setStateAbbreviation(String stateAbbreviation) {
        this.stateAbbreviation = stateAbbreviation;
    }

    @Override
    public String toString() {
        return String.format("%s (ID: %d)", parkName, parkId);
    }
}
