package com.github.jamsa.sc.base.entity;

import org.springframework.cglib.proxy.Enhancer;

public class EntityFactory {
    public static final SetterInterceptor setterInterceptor = new SetterInterceptor();

    public static <T extends BaseEntity> T getInstance(Class<T> clazz){
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(clazz);
        enhancer.setCallback(setterInterceptor);
        return (T)enhancer.create();
    }
}
