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
package com.wsw.service;

import com.wsw.model.Customer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.smart4j.framework.annotation.Service;
import org.smart4j.framework.annotation.Transaction;
import org.smart4j.helper.DatabaseHelper;

import java.util.List;
import java.util.Map;

/**
 * 提供客户数据服务
 */
@Service
public class CustomerService {

    private static final Logger LOGGER = LoggerFactory.getLogger(CustomerService.class);

    /*
     * 获取客户列表
     * */
    public List<Customer> getCustomerList(){
        //to do something
        String sql="select * from customer";
        return DatabaseHelper.queryEntityList(Customer.class,sql);

    }

    /*
     * 获取客户
     * */
    public  Customer getCustomer(long id){
        //to do something
        String sql = "SELECT * FROM customer WHERE id = ?";
        return DatabaseHelper.queryEntity(Customer.class, sql, id);
    }

    /*
     * 创建客户
     * */
    @Transaction
    public boolean createCustomer(Map<String,Object> fieldMap){
        //to do something
        boolean flag = DatabaseHelper.insertEntity(Customer.class,fieldMap);
        //int i = 9/0;//故意设置的错误，检验事务是否起作用
        return flag;
    }

    /*
     * 更新客户
     * */
    public boolean updateCustomer(long id,Map<String,Object> fieldMap){
        //to do something
        return DatabaseHelper.updateEntity(Customer.class,id,fieldMap);
    }

    /*
     * 删除客户
     * */
    public boolean deleteCustomer(long id){
        //to do something
        return DatabaseHelper.deleteEntity(Customer.class,id);
    }
}