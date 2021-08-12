package com.techelevator;

public class HomeworkAssignment {

    private int earnedMarks;
    private int possibleMarks;
    private String submitterName;
    private String letterGrade;

    public HomeworkAssignment(int possibleMarks, String submitterName){
        this.possibleMarks = possibleMarks;
        this.submitterName = submitterName;
    }

    public int getEarnedMarks() {

        return earnedMarks;
    }

    public void setEarnedMarks(int earnedMarks) {

        this.earnedMarks = earnedMarks;
    }

    public int getPossibleMarks() {

        return possibleMarks;
    }

    public String getSubmitterName() {

        return submitterName;
    }

    public String getLetterGrade() {

        int perCent = getEarnedMarks() * 100 / getPossibleMarks() ;

        if(perCent >= 90){
            letterGrade = "A";
        }else if(perCent < 90 && perCent >= 80 ){
            letterGrade = "B";
        }else if(perCent < 80 && perCent >= 70 ){
            letterGrade = "C";
        }else if(perCent < 70 && perCent >= 60 ){
            letterGrade = "D";
        }else {
            letterGrade = "F";
        }
        return letterGrade;
    }

}
