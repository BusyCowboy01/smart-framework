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

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * 〈一句话功能简述〉<br>
 * 〈功能详细描述〉
 *
 * @author
 * @see [相关类/方法]（可选）
 * @since [产品/模块版本] （可选）
 */
public class TestProxy {
    @Test
    public void testJDKProxy() {
        TimeService service = new TimeServiceImpl();
        DynamicProxy dynamicProxy = new DynamicProxy(service);
        TimeService helloProxy = dynamicProxy.getProxy();
        helloProxy.getNowTime1("c");
        helloProxy.getNowTime2("a","b");
    }
    @Test
    public void testCGLibProxy() {
        TimeMapper helloProxy = CGLibProxy.getInstance().getProxy(TimeMapper.class);
        helloProxy.getNowTime("a");


    }
}
