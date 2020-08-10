package com.achu.basic.structure;

import java.util.Date;

public class RepDetails {

    int id;
    String address;
    String number;
    double salary;


    public RepDetails() {
        super();
    }

    public RepDetails(int id,String address,String number,double salary) {
        super();
        this.id = id;
        this.address = address;
        this.number = number;
        this.salary = salary;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String name) {
        this.address = address;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
