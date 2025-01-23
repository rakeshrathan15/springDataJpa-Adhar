package com.neoteric.springbootjpa_adhar.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


public class Nominee {


    private String nomineeName;
    private  String relation;

  //  private User user;

    private Address address;

    public Nominee(){

    }

    public Nominee(String nomineeName, String relation, Address address) {
        this.nomineeName = nomineeName;
        this.relation = relation;
        this.address = address;
    }

    public String getNomineeName() {
        return nomineeName;
    }

    public void setNomineeName(String nomineeName) {
        this.nomineeName = nomineeName;
    }

    public String getRelation() {
        return relation;
    }

    public void setRelation(String relation) {
        this.relation = relation;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}
