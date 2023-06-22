package com.springcore.autowire.annotation;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Emp {

    @Autowired
    @Qualifier("add0")
    private Address add;

    public Emp() {
    }

    public Emp(Address address) {
        System.out.println("Inside constructor of emp");
        this.add = address;
    }

    public Address getAdd() {
        return add;
    }

    public void setAdd(Address add) {
        this.add = add;
        System.out.println("Inside Set Method of Emp");
    }

    @Override
    public String toString() {
        return "Emp{" +
                "address=" + add +
                '}';
    }
}
