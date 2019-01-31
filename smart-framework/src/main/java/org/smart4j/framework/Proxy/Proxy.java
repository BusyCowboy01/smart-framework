/*
 * FileName:
 * Author:
 * Date:
 * Description:
 * <author>
 */
package org.smart4j.framework.Proxy;
/**
 * @author BusyCowboy01
 * @date 2018/7/25.
 * @description
 * 代理接口
 */
public interface Proxy {
    Object doProxy(ProxyChain proxyChain) throws Throwable;
}
