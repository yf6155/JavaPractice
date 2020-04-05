package com.www.javapractice.annot.test;


import com.www.javapractice.annot.entity.City;
import com.www.javapractice.annot.util.CommonUtil;

/**
 * <p>Application Name : Test </p>
 * <p>Application Description :  </p>
 * <p>Company : WWW </p>
 * (C) Copyright WWW Corporation 2020 All Rights Reserved.
 *
 * @Author : HandsGoing
 * @Date : 2020.03.31 21:53
 * @Version : v1.0
 */
public class Test {

    public static void main(String[] args) {
        City city = new City();
        city.setId("1");
        city.setName("city");

        System.out.println(CommonUtil.buildSql(city));
    }

}
