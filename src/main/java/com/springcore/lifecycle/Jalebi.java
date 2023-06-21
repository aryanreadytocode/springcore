package com.springcore.lifecycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Jalebi {
    private int sugarLevel;
    private double weight;
    private double pricePerKg;

    public Jalebi() {
    }

    public Jalebi(int sugarLevel, double weight, double pricePerKg) {
        this.sugarLevel = sugarLevel;
        this.weight = weight;
        this.pricePerKg = pricePerKg;
    }

    public int getSugarLevel() {
        return sugarLevel;
    }

    public void setSugarLevel(int sugarLevel) {
        this.sugarLevel = sugarLevel;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getPricePerKg() {
        return pricePerKg;
    }

    public void setPricePerKg(double pricePerKg) {
        this.pricePerKg = pricePerKg;
    }

    @PostConstruct
    public void cookJalebi() {
        System.out.println("Jalebi bnta");
    }
    @PreDestroy
    public void overJalebi() {
        System.out.println("Jalebi khatm");
    }

    @Override
    public String toString() {
        return "Jalebi{" +
                "sugarLevel=" + sugarLevel +
                ", weight=" + weight +
                ", pricePerKg=" + pricePerKg +
                '}';
    }
}
