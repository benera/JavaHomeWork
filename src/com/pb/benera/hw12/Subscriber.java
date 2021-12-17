package com.pb.benera.hw12;

import java.time.LocalDateTime;


public class Subscriber {
    private String name;
    private String birthdate;
    private String phone;
    private String address;
    private LocalDateTime localDateTime;


    public Subscriber(String name, String birthdate, String phone, String address, LocalDateTime localDateTime) {
        this.name = name;
        this.birthdate = birthdate;
        this.phone = phone;
        this.address = address;
        this.localDateTime = localDateTime;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(String birthdate) {
        this.birthdate = birthdate;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public LocalDateTime getDatetime() {
        return localDateTime;
    }

    public void setDatetime(LocalDateTime datetime) {
        this.localDateTime = datetime;
    }


    @Override
    public String toString() {
        return "Contact [Name=" + name + ", birthdate=" + birthdate + ", phone=" + phone + ", address=" + address
                + ", localDateTime: " + localDateTime + "]";
    }

}