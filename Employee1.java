package com.learn.javacourse;

public class Employee1 {

    private  String city;
    private  int Dob;

    public Employee1(String city, int dob) {
        this.city = city;
        Dob = dob;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getDob() {
        return Dob;
    }

    public void setDob(int dob) {
        Dob = dob;
    }
}
