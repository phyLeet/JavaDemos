package com.phyleet.designPatternsDemos.strategyPattern.duckBehavior.impl;

import com.phyleet.designPatternsDemos.strategyPattern.duckBehavior.FlyBehavior;

public class FlyRocketPowered implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("I'm flying with a rocket.");
    }
}
