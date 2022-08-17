package org.launchcode.java.demos.lsn3classes1;

// Start working here with your Student class.
// To instantiate the Student class, add your code to the main in the file, SchoolPractice.

public class Student {

    private String name;
    public void setName(String name){
        this.name = name;
    }

    private int studentId;
    public void setStudentId(int studentId){
        this.studentId = studentId;
    }

    private int numberOfCredits = 0;
    private void setNumberOfCredits(int numberOfCredits){
        this.numberOfCredits = numberOfCredits;
    }

    private double gpa = 0.0;
    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public String getName(){
        return name;
    }

    public int get;

    public int getStudentId() {
        return studentId;
    }

    public int getNumberOfCredits(){
        return numberOfCredits;
    }

    public double getGpa(){
        return gpa;
    }
}