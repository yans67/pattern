package com.huangyg.factory;

/**
 * Created by huangyg on 2017/9/24.
 *
 * 工厂模式
 *
 */
public class start {
    public static void main(String[] args){
        PersonFactory personFactory = new PersonFactory();
        IBehavior iBehavior = personFactory.getBehavior("women");
        iBehavior.speak();
    }
}
