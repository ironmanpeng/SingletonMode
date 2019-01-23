package com.pengtg.singletonmodel;

import java.util.HashMap;
import java.util.Map;

public class SingletonManager {
    public static final String DCLSINGLETON = "DoubleCheckLockSingleton";
    public static final String SICSINGLETON = "StaticInnerClassSingleton";
    public static final String ENUMSINGLETON = "EnumSingleton";

    private static Map<String,Object> objectMap = new HashMap<String, Object>();

    static {
        registerService(SingletonManager.DCLSINGLETON,DoubleCheckLockSingleton.getInstance());
        registerService(SingletonManager.SICSINGLETON,StaticInnerClassSingleton.getInstance());
        registerService(SingletonManager.ENUMSINGLETON,EnumSingleton.getInstance());
    }
    private SingletonManager(){
    }

    public static void registerService(String key,Object instance){
        if(!objectMap.containsKey(key)){
            objectMap.put(key,instance);
        }
    }

    public static Object getService(String key){
        return objectMap.get(key);
    }
}
