package com.heyu.designmode.Decorator;

/**
 * Created by heyu on 2016/9/5.
 */
public abstract class AbstractComponent implements Component {

    private Component component;

    public AbstractComponent(Component c) {
        this.component = c;
    }

    public void play() {
        this.component.play();
    }

}
