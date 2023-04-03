package com.seliniumexpress.di;

public class Student {

    private String  studentName;
    private int id;

    public Student(String studentName, int id) {
        System.out.println("param constructor called...");
        this.studentName = studentName;
        this.id = id;
    }

    public Student( int id) {
        System.out.println("single param constructor called...");
        this.studentName = studentName;
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        System.out.println("setter method called :setId");
        this.id = id;
    }

    public Student() {

        System.out.println("Student constr called ...");
    }

    public String getStudentName() {

        return studentName;
    }

    public void setStudentName(String studentName) {
        System.out.println("setter method called :setName");
        this.studentName = studentName;
    }

    public void displayStudentInfo(){
        System.out.println("The student name is: " + studentName + ". and id  of student = "  + id );
    }

}
