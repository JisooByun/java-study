package com.java.lambda;


import lombok.AllArgsConstructor;

public class Member {
    private String name;
    private String id;
    private Address address;

    public Member() {

    }

    public Member(String name) {
        this.name = name;
    }

    public Member(String name, String id) {
        this.name = name;
        this.id = id;

    }

    public Member(String name, String id, Address address) {
        this.name = name;
        this.id = id;
        this.address = address;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
