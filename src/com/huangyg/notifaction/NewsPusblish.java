package com.huangyg.notifaction;

/**
 * Created by huangyg on 2017/9/24.
 */
public class NewsPusblish extends Publish{

    private String state;

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
        this.notifySubscribe();
    }

}
