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
package com.wsw.controller;

import com.wsw.model.Customer;
import com.wsw.service.CustomerService;
import org.smart4j.framework.Proxy.Proxy;
import org.smart4j.framework.Proxy.ProxyChain;
import org.smart4j.framework.annotation.Action;
import org.smart4j.framework.annotation.Controller;
import org.smart4j.framework.annotation.Inject;
import org.smart4j.framework.bean.View;
import org.smart4j.framework.util.JsonUtil;
import org.smart4j.helper.ServletHelper;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 〈一句话功能简述〉<br>
 * 〈功能详细描述〉
 *
 * @author
 * @see [相关类/方法]（可选）
 * @since [产品/模块版本] （可选）createCustomer
 */
@Controller
public class CustomerController {
    @Inject
    private CustomerService customerService;

    @Action("get:/queryList")
    public void queryList() {
        List<Customer> customerList = customerService.getCustomerList();
        System.out.println(JsonUtil.toJson(customerList));
    }

    @Action("get:/addCustomer")
    public void addCustomer() {
        Map<String,Object> fieldMap = new HashMap();
        fieldMap.put("name","ccc");
        fieldMap.put("contact","ccc");
        fieldMap.put("telephone","ccc");
        fieldMap.put("email","ccc");
        fieldMap.put("remark","ccc");
        System.out.println(customerService.createCustomer(fieldMap));
    }

}
