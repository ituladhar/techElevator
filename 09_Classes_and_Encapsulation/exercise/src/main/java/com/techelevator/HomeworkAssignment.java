package com.techelevator;

public class HomeworkAssignment {
    private int earnedMarks;
    private int possibleMarks;
    private String submitterNames;

 //Getter and Setter
    public int getEarnedMarks (){
        return earnedMarks;
    }

    public void setEarnedMarks (int earnedMarks){
        this.earnedMarks = earnedMarks;
    }

    public int getPossibleMarks (){
        return possibleMarks;
    }

    public String getSubmitterName (){
        return submitterNames;
            }
    public  void setSubmitterNames(){
        this.submitterNames=submitterNames;
    }
    //Constructor
    public HomeworkAssignment ( int possibleMarks, String  submitterNames){
        this.possibleMarks = possibleMarks;
        this.submitterNames = submitterNames;
    }

    //Derived

    public String getLetterGrade(){
        double totalMarks = ((double)earnedMarks/(double)possibleMarks) * 100;
        if( totalMarks> 90) return "A";
        else if (totalMarks >= 80) return "B";
        else if (totalMarks >= 70) return "C";
        else if (totalMarks >= 60) return "D";
        else return "F";

    }


}
