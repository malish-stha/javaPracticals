package com.malish;

import java.util.Date;

public class Order {
    private int id;
    private double amount;
    private Date date;
    private int customerID;

    public Order() {}

    public Order(int id, double amount, Date date, int customerID) {
        this.id = id;
        this.amount = amount;
        this.date = date;
        this.customerID = customerID;
    }

    public int getId() {
        return id;
    }

    public double getAmount() {
        return amount;
    }

    public Date getDate() {
        return date;
    }

    public int getCustomerID() {
        return customerID;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public void setCustomerID(int customerID) {
        this.customerID = customerID;
    }
}
