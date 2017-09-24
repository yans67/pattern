package com.huangyg.notifaction;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by huangyg on 2017/9/24.
 *
 * 发布者基类
 *
 */
public class Publish {
    private List<Subscribe>Subscribes = new ArrayList<>();

    protected void addSubscribe(Subscribe subscribe){
        Subscribes.add(subscribe);
    }

    protected void deleteSubscribe(Subscribe subscribe){
        Subscribes.remove(subscribe);
    }

    protected void notifySubscribe(){
        for (Subscribe subscribe : Subscribes)
        subscribe.update(this);
    }
}
