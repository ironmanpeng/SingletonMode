package com.pengtg.singletonmodel;

import com.pengtg.singletonmodel.utils.CommonLog;
import com.pengtg.singletonmodel.utils.LogFactory;

/**
 * 使用枚举的单例模式
 *
 * @author pengtg
 *
 */
public class EnumSingleton {
    private static final CommonLog log = LogFactory.createLog();

    private EnumSingleton(){}
    public static EnumSingleton getInstance(){
        return Singleton.INSTANCE.getInstance();
    }

    private static enum Singleton{
        INSTANCE;

        private EnumSingleton singleton;
        //JVM会保证此方法绝对只调用一次
        private Singleton(){
            singleton = new EnumSingleton();
        }
        public EnumSingleton getInstance(){
            return singleton;
        }
    }

    public void print(){
        log.d("I'm EnumSingleton");
    }
}
