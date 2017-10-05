package com.heyu.designmode.strategy;

/**
 * Created by heyu on 2016/8/9.
 */
public abstract class CashSuper {

    private double price;
    private double number;

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getNumber() {
        return number;
    }

    public void setNumber(double number) {
        this.number = number;
    }

    public abstract double getResult(double money);
}
