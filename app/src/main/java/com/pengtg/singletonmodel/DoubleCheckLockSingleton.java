package com.pengtg.singletonmodel;

import com.pengtg.singletonmodel.utils.CommonLog;
import com.pengtg.singletonmodel.utils.LogFactory;

public class DoubleCheckLockSingleton {
    private static final CommonLog log = LogFactory.createLog();
    private static DoubleCheckLockSingleton sInstance = null;
    private DoubleCheckLockSingleton(){

    }
    public static DoubleCheckLockSingleton getInstance(){
        if(sInstance == null){
            synchronized (DoubleCheckLockSingleton.class){
                if(sInstance == null){
                    sInstance = new DoubleCheckLockSingleton();
                }
            }
        }
        return sInstance;
    }
    public void print(){
        log.d("I'm DoubleCheckLockSingleton");
    }
}
