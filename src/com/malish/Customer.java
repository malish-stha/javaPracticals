package com.malish;

public class Customer {
    private int id;
    private String name;
    private String phone;
    private String country;

    public Customer() {}

    public Customer(int id, String name, String phone, String country) {
        this.id = id;
        this.name = name;
        this.phone = phone;
        this.country = country;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }

    public String getCountry() {
        return country;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}
