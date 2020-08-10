package com.achu.basic.structure;

import java.util.Date;

public class SalesRep {

    int id;
    String name;
    double opening_sales;
    double closing_sales;
    Date date;

    public SalesRep() {
        super();
    }

    public SalesRep(int id,String name,double opening_sales,double closing_sales) {
        super();
        this.id = id;
        this.name = name;
        this.opening_sales = opening_sales;
        this.closing_sales = closing_sales;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getClosing_sales() {
        return closing_sales;
    }

    public void setClosing_sales(double closing_sales) {
        this.closing_sales = closing_sales;
    }

    public double getOpening_sales() {
        return opening_sales;
    }

    public void setOpening_sales(double opening_sales) {
        this.opening_sales = opening_sales;
    }
}
