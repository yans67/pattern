package com.huangyg.factory;

/**
 * Created by huangyg on 2017/9/24.
 */
public class PersonFactory {
    /**
     * 根据类型来创建对象
     * @param key
     * @return
     */
    public IBehavior getBehavior(String key){
        if ("man".equals(key)){ // 防止 sex 为 null 抛空指针异常
            return new Man();
        }else if("women".equals(key)){
            return new Women();
        }
        return null;
    }

    /**
     * 根据类的名称来生产对象
     * @param className 类的名字
     * @return
     */
    public IBehavior getBehaviorByClass(String className) {
        try {
            IBehavior iBehavior = (IBehavior)Class.forName(className).newInstance();
            return iBehavior;
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }


}
