package com.huangyg.notifaction;

/**
 * Created by huangyg on 2017/9/24.
 *
 * 订阅者基类
 */
public interface Subscribe {

    public void update(Publish publish);
}
