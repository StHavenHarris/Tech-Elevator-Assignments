package com.techelevator;

public class HomeworkAssignment {
    //instance variables
    private int totalMarks;
    private int possibleMarks;
    private String submitterName;
    private int earnedMarks;
    private String letterGrade;



    //letterGrade method
    //methods
    public String getLetterGrade () {
        //letterGrade = totalMarks / possibleMarks;
        if (((1.0 * earnedMarks / possibleMarks) * 100) >= 90) {
            return "A";
        } else if ((((double)earnedMarks/ possibleMarks) * 100) >= 80) {
            return "B";
        } else if (((1.0 * earnedMarks / possibleMarks) * 100) >= 70) {
            return "C";
        } else if (((1.0 * earnedMarks / possibleMarks) * 100) >= 60) {
            return "D";
        } else {
            return "F";
        }

    }
    //constructor
    public HomeworkAssignment (int possibleMarks, String submitterName) {
        this.possibleMarks = possibleMarks;
        this.submitterName = submitterName;
    }


    public int getTotalMarks() {
        return totalMarks;
    }

    public int getEarnedMarks(){
        this.earnedMarks = (int) ((1.0 * totalMarks / possibleMarks) * 100);
        return earnedMarks;
    }


    public void setEarnedMarks(int earnedMarks) {
        this.earnedMarks = earnedMarks;
    }


    public String getSubmitterName() {
        return submitterName;
    }


   //public void setSubmitterName(String submitterName) {
        //this.submitterName = submitterName;
   // }


   public int getPossibleMarks() {
       return possibleMarks;
    }


}
