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
package com.wsw.model;

/**
 * 客户
 */
public class Customer {
    /*
     * id
     * */
    private long id;
    /*
     * 客户名称
     * */
    private  String name;
    /*
     * 联系人
     * */
    private  String contact;
    /*
     * 电话号码
     * */
    private  String telephone;
    /*
     * 邮箱地址
     * */
    private  String email;
    /*
     * 备注
     * */
    private  String remark;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }
}