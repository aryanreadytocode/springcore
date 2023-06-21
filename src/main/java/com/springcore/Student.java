package com.springcore;

public class Student {
    private int StudentId;
    private String studentName;
    private String studentCity;

    public Student() {
    }

    public Student(int studentId, String studentName, String studentCity) {
        StudentId = studentId;
        this.studentName = studentName;
        this.studentCity = studentCity;
    }

    public int getStudentId() {
        return StudentId;
    }

    public void setStudentId(int studentId) {
        System.out.println("setting student id");
        StudentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        System.out.println("Setting student name");
        this.studentName = studentName;
    }

    public String getStudentCity() {
        return studentCity;
    }

    public void setStudentCity(String studentCity) {
        System.out.println("Setting student city");
        this.studentCity = studentCity;
    }

    @Override
    public String toString() {
        return "Student{" +
                "StudentId=" + StudentId +
                ", studentName='" + studentName + '\'' +
                ", studentCity='" + studentCity + '\'' +
                '}';
    }
}
