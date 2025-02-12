package com.neoteric.springbootjpa_adhar.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name="address",schema = "usernominee")

public class AddressEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "address_id")
    private  Long id;

    @Column(name="street")
    private String street;

    @Column(name = "city")
    private String city;

    @Column(name="state")
    private String  state;

    @Column(name = "pincode")
    private String pincode;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getPincode() {
        return pincode;
    }

    public void setPincode(String pincode) {
        this.pincode = pincode;
    }
}
