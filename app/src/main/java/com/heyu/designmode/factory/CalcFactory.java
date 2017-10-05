package com.heyu.designmode.factory;

/**
 * Created by heyu on 2016/8/9.
 */
public class CalcFactory {

    public static Calculate createCalculate(String type){
        Calculate calculate = null;
        switch (type){
            case "+":
                calculate = new CalculatePlus();
                break;
            case "-":
                calculate = new CalculateSub();
                break;
            case "*":
                calculate = new CalculateMult();
                break;
            case "/":
                calculate = new CalculateDiv();
                break;
        }
        return calculate;
    }
}
