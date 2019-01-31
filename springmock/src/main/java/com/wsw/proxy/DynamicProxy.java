/*
 * Copyright (C), 2002-, 苏宁易购电子商务有限公司
 * FileName:
 * Author:
 * Date:
 * Description: //模块目的、功能描述
 * History: //修改记录
 * <author>      <time>      <version>    <desc>
 * 修改人姓名             修改时间            版本号                  描述
 */
package com.wsw.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * 使用JDK实现动态代理
 */
public class DynamicProxy implements InvocationHandler {
    private volatile Object target;

    public DynamicProxy(Object target) {
        //保存真实的对象
        this.target = target;
    }


    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        before();
        //通过反射调用函数
        Object result = method.invoke(target, args);
        after();
        //返回函数调用的返回结果
        return result;
    }

    private void before() {
        System.out.println("Before");
    }

    private void after() {
        System.out.println("After");
    }

    public <T> T getProxy() {
        return (T) Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(), this);
    }
}
