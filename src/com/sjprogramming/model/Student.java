package com.sjprogramming.model;

public class Student {
    private int rollNum;
    private String name;
    private String clgName;
    private String city;
    private double percentage;
   private double phn;
    public Student(){

    }

    public Student(String name, String clgName, String city, double percentage,double phn) {
        this.name = name;
        this.clgName = clgName;
        this.city = city;
        this.percentage = percentage;
        this.phn = phn;
    }

    public Student(int rollNum, String name, String clgName, String city, double percentage, double phn) {
        this.rollNum = rollNum;
        this.name = name;
        this.clgName = clgName;
        this.city = city;
        this.percentage = percentage;
        this.phn = phn;
    }

    public int getRollNum() {
        return rollNum;
    }

    public void setRollNum(int rollNum) {
        this.rollNum = rollNum;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getClgName() {
        return clgName;
    }

    public void setClgName(String clgName) {
        this.clgName = clgName;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public double getPercentage() {
        return percentage;
    }

    public void setPercentage(double percentage) {
        this.percentage = percentage;
    }
    public double getphn() {
        return phn;
    }

    public void setphn(double phn) {
        this.phn = phn;
    }

    @Override
    public String toString() {
        return "Student{" +
                "rollNum=" + rollNum +
                ", name='" + name + '\'' +
                ", clgName='" + clgName + '\'' +
                ", city='" + city + '\'' +
                ", percentage=" + percentage +
                ", Mobile=" + phn +
                '}';
    }
}
