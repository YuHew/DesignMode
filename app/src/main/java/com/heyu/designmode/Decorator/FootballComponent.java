package com.heyu.designmode.Decorator;

import android.util.Log;

/**
 * Created by Administrator on 2016/9/5.
 */
public class FootballComponent extends AbstractComponent {

    public FootballComponent(Component c) {
        super(c);
    }

    public void play() {
        super.play();
        Log.d("FootballComponent", "play football");
    }

}
