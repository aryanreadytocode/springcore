package com.springcore.lifecycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Pepsi implements InitializingBean, DisposableBean {

    private double price;
    private int quantity;
    private String expiryDate;

    public Pepsi() {
    }

    public Pepsi(double price, int quantity, String expiryDate) {
        this.price = price;
        this.quantity = quantity;
        this.expiryDate = expiryDate;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(String expiryDate) {
        this.expiryDate = expiryDate;
    }

    @Override
    public String toString() {
        return "Pepsi{" +
                "price=" + price +
                ", quantity=" + quantity +
                ", expiryDate='" + expiryDate + '\'' +
                '}';
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("Inside destroy");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("Inside iniit");
    }
}
