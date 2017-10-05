package com.heyu.designmode.strategy;

/**
 * Created by heyu on 2016/8/9.
 */
public class CashContext {
    private CashSuper cashSuper;

    public CashContext(String type){
        switch (type){
            case "CashNormal":
                cashSuper = new CashNormal();
                break;
            case "CashPercentOff":
                cashSuper = new CashPercentOff();
                break;
            case "CashFullCut":
                cashSuper = new CashFullCut();
                break;
        }
    }

    public double getResult(double money){
        return cashSuper.getResult(money);
    }

}
