package com.huangyg.factory;

/**
 * Created by huangyg on 2017/9/24.
 */
public class Man implements IBehavior {
    @Override
    public void draw() {
        System.out.println("man can draw...");
    }

    @Override
    public void speak() {
        System.out.println("man can speak...");
    }
}
