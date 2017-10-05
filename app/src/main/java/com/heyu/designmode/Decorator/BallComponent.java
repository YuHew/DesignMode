package com.heyu.designmode.Decorator;

import android.util.Log;

/**
 * Created by Administrator on 2016/9/5.
 */
public class BallComponent implements Component{
    @Override
    public void play() {
        Log.d("BallComponent", "play ball");
    }
}
