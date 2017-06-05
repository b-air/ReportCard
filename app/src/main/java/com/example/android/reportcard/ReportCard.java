package com.example.android.reportcard;

import java.util.ArrayList;

/**
 * Created by bruno on 18/05/2017.
 * Udacity Google scholarship Report Card Project 5
 * Android Basics Multi-screen Apps
 */

public class ReportCard {

    //PRIVATE VAR
    /*
     * Declaring mStudentName  mYear mSubject mGrades
     */
    //name
    private String mStudentName;

    //year
    private int mYear;

    //class
    private String mSubject;

    //grades
    private ArrayList<Integer> mGrades;


    //PUBLIC


    //CONSTRUCTOR
    public ReportCard(String studentName, int year, String subject, ArrayList<Integer> grades) {
        mStudentName = studentName;
        mYear = year;
        mSubject = subject;
        mGrades = grades;
    }

    //default
    public ReportCard() {
        mStudentName = "Default";
        mYear = 9999;
        mSubject = "none";
        mGrades = new ArrayList<>();
        mGrades.add(0);
        mGrades.add(0);
    }


    //METHODS

    public String getName() {
        return mStudentName;
    }

    //set
    public void setName(String studentName) {
        mStudentName = studentName;
    }

    public int getYear() {
        return mYear;
    }

    public void setYear(int year) {
        mYear = year;
    }


    //get

    public String getSubject() {
        return mSubject;
    }

    public void setSubject(String subject) {
        mSubject = subject;
    }

    public ArrayList<Integer> getGrades() {
        return mGrades;
    }

    public void setGrades(ArrayList<Integer> grades) {
        mGrades = grades;
    }


    //array
    /*
     * Use the array to calculate average
     */

    public double getAverage() {

        double gradeAverage = 0.0;
        int total = 0;
        for (int i = 0; i < mGrades.size(); i++) {
            total = total + mGrades.get(i);
        }
        gradeAverage = total / mGrades.size();

        return gradeAverage;
    }


    // toString
    /*
     * Using toString to display Report Card Variables
     */

    public String toString() {

        return "Report Card:\n\n" +
                "Scholarship " + mYear + "\n" +
                "Name: " + mStudentName + "\n" +
                "Received the following grades in " + mSubject + "\n" +
                mGrades + "\n" +
                "Subject is passed with an average of: " + getAverage();
    }


}
