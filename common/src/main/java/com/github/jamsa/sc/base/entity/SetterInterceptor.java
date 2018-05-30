package com.github.jamsa.sc.base.entity;

import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;
import org.springframework.util.StringUtils;

import java.lang.reflect.Method;
import java.util.Set;


public class SetterInterceptor implements MethodInterceptor {

    public static final String SET_PREFIX="set";


    @Override
    public Object intercept(Object obj, Method method, Object[] args, MethodProxy proxy) throws Throwable{
        if(method.getName().startsWith(SET_PREFIX)){
            if(obj instanceof BaseEntity){
                BaseEntity entity = (BaseEntity)obj;
                Set changedProperties = entity.getChangedProperties();
                String propertyName = method.getName().substring(SET_PREFIX.length());
                propertyName = StringUtils.uncapitalize(propertyName);
                if(args.length==1){
                    changedProperties.add(propertyName);
                }
            }
        }
        return proxy.invokeSuper(obj,args);
    }
}
