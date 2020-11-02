package com.phyleet.designPatternsDemos.strategyPattern.duckBehavior.impl;

import com.phyleet.designPatternsDemos.strategyPattern.duckBehavior.FlyBehavior;

public class FlyNoWay implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("I can't fly.");
    }
}
