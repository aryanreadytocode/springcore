package com.springcore.autowire;


public class Emp {
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
