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

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 〈一句话功能简述〉<br>
 * 〈功能详细描述〉
 *
 * @author
 * @see [相关类/方法]（可选）
 * @since [产品/模块版本] （可选）
 */
public class TimeServiceImpl implements TimeService {

    public void getNowTime1(String c) {
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        c = dateFormat.format(new Date());
        System.out.println(c);
    }
    public void getNowTime2(String a, String b) {
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        a = dateFormat.format(new Date());
        b = dateFormat.format(new Date());
        System.out.println(a + b);
    }
}
