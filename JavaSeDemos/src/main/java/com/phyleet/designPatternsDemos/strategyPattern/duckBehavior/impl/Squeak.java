package com.phyleet.designPatternsDemos.strategyPattern.duckBehavior.impl;

import com.phyleet.designPatternsDemos.strategyPattern.duckBehavior.QuackBehavior;

public class Squeak implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("Squeak.");
    }
}
