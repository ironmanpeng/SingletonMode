package com.pengtg.singletonmodel;

import com.pengtg.singletonmodel.utils.CommonLog;
import com.pengtg.singletonmodel.utils.LogFactory;

public class StaticInnerClassSingleton {
    private static final CommonLog log = LogFactory.createLog();

    private StaticInnerClassSingleton(){

    }
    public static StaticInnerClassSingleton getInstance(){
        return SingletonHolder.sInstance;
    }

    private static class SingletonHolder{
        private static final StaticInnerClassSingleton sInstance = new StaticInnerClassSingleton();
    }

    public void print(){
        log.d("I'm StaticInnerClassSingleton");
    }
}
