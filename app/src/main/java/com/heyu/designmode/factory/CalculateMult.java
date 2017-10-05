package com.heyu.designmode.factory;

/**
 * Created by Administrator on 2016/8/9.
 */
public class CalculateMult extends Calculate{

    @Override
    public double getResult() {
        return getNumA() * getNumB();
    }
}
