package com.phyleet.designPatternsDemos.strategyPattern;

import com.phyleet.designPatternsDemos.strategyPattern.duckBehavior.impl.FlyNoWay;
import com.phyleet.designPatternsDemos.strategyPattern.duckBehavior.impl.Quack;

public class ModelDuck extends Duck {
    public ModelDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new Quack();
    }

    @Override
    public void display() {
        System.out.println("I'm a model duck.");
    }
}
