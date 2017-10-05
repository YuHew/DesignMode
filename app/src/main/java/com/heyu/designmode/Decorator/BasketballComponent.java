package com.heyu.designmode.Decorator;

import android.util.Log;

/**
 * Created by Administrator on 2016/9/5.
 */
public class BasketballComponent extends AbstractComponent{

    public BasketballComponent(Component c){
        super(c);
    }

    public void play(){
        super.play();
        Log.d("BasketballComponent", "play basketball");
    }
}
