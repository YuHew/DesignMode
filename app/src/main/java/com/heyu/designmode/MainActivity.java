package com.heyu.designmode;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.heyu.designmode.Decorator.BallComponent;
import com.heyu.designmode.Decorator.BasketballComponent;
import com.heyu.designmode.Decorator.Component;
import com.heyu.designmode.Decorator.FootballComponent;
import com.heyu.designmode.factory.CalcFactory;
import com.heyu.designmode.factory.Calculate;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //decorator
        Component c = new BasketballComponent(new FootballComponent(new BallComponent()));
        c.play();

        c = new FootballComponent(new BasketballComponent(new BallComponent()));
        c.play();


        //factory
        Calculate calc = CalcFactory.createCalculate("+");
        calc.setNumA(2);
        calc.setNumB(3);
        double a = calc.getResult();
        Log.d("MainActivity", "a:" + a);
    }
}
