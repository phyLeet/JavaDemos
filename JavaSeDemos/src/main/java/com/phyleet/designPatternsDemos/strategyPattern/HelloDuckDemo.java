package com.phyleet.designPatternsDemos.strategyPattern;

import com.phyleet.designPatternsDemos.strategyPattern.duckBehavior.impl.FlyRocketPowered;

public class HelloDuckDemo {
    public static void main(String[] args) {
        Duck mallard = new MallardDuck();
        mallard.performFly();
        mallard.performQuack();

        Duck model = new ModelDuck();
        model.performFly();
        model.setFlyBehavior(new FlyRocketPowered());
        model.performFly();
    }
}
