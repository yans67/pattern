package com.huangyg.factory;

/**
 * Created by huangyg on 2017/9/24.
 */
public class Women implements IBehavior {

    @Override
    public void draw() {
        System.out.println("women can draw...");
    }

    @Override
    public void speak() {
        System.out.println("women can speak...");
    }
}
