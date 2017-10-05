package com.heyu.designmode.factory;

/**
 * Created by Administrator on 2016/8/9.
 */
public class CalculateDiv extends Calculate{

    @Override
    public double getResult() {
        if(getNumB() != 0){
            return getNumA() / getNumB();
        }else {
            return -1;
        }
    }
}
