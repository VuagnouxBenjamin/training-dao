package com.benjamin.Entities;

import com.mysql.cj.xdevapi.JsonArray;

public class User {

    private int id;
    private String email, password, first_name, last_name, phone_number, shipping_address, billing_address;
    private JsonArray roles = new JsonArray();

    public User() {
    }

    public User(int id, String email, String password, String first_name, String last_name, String phone_number, String shipping_address, String billing_address) {
        this.id = id;
        this.email = email;
        this.password = password;
        this.first_name = first_name;
        this.last_name = last_name;
        this.phone_number = phone_number;
        this.shipping_address = shipping_address;
        this.billing_address = billing_address;
    }

    public int getId() {
        return id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getPhone_number() {
        return phone_number;
    }

    public void setPhone_number(String phone_number) {
        this.phone_number = phone_number;
    }

    public String getShipping_address() {
        return shipping_address;
    }

    public void setShipping_address(String shipping_address) {
        this.shipping_address = shipping_address;
    }

    public String getBilling_address() {
        return billing_address;
    }

    public void setBilling_address(String billing_address) {
        this.billing_address = billing_address;
    }

    public JsonArray getRoles() {
        return roles;
    }

    public void setRoles(JsonArray roles) {
        this.roles = roles;
    }
}
