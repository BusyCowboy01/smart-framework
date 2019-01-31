package com.wsw.proxy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.smart4j.framework.Proxy.AspectProxy;
import org.smart4j.framework.annotation.Aspect;
import org.smart4j.framework.annotation.Controller;

import java.lang.reflect.Method;

/**
 * @author BusyCowboy01
 * @date 2018/7/25.
 * @description
 */
@Aspect(Controller.class)
public class ControllerAspect extends AspectProxy {
    private static final Logger LOG = LoggerFactory.getLogger(ControllerAspect.class);
    private long begin;

    @Override
    public void before(Class<?> cls, Method method, Object[] params) throws Throwable {
//        LOG.debug("------------begin--------------");
//        LOG.debug(String.format("class: %s",cls.getName()));
//        LOG.debug(String.format("method: %s",method.getName()));
//        begin = System.currentTimeMillis();
        System.out.println("------------begin--------------");
        System.out.println(String.format("class: %s",cls.getName()));
        System.out.println(String.format("method: %s",method.getName()));
        System.out.println(System.currentTimeMillis());
    }

    @Override
    public void after(Class<?> cls, Method method, Object[] params) throws Throwable {
//        LOG.debug(String.format("time: %s",System.currentTimeMillis()-begin));
//        LOG.debug("------------end--------------");
        System.out.println(String.format("time: %s",System.currentTimeMillis()-begin));
        System.out.println("------------end--------------");
    }
}
