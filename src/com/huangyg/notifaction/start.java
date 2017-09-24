package com.huangyg.notifaction;

import com.huangyg.factory.IBehavior;
import com.huangyg.factory.PersonFactory;

/**
 * Created by huangyg on 2017/9/24.
 *
 * 模板方法模式
 *
 */
public class start {
    public static void main(String[] args){
        PersonFactory personFactory = new PersonFactory();
        IBehavior iBehavior = personFactory.getBehavior("women");
        iBehavior.speak();
    }
}
