package com.www.javapractice.aop.dao;

import org.springframework.stereotype.Repository;

/**
 * <p>Application Name : IndexDao </p>
 * <p>Application Description :  </p>
 * <p>Company : WWW </p>
 * (C) Copyright WWW Corporation 2020 All Rights Reserved.
 *
 * @Author : HandsGoing
 * @Date : 2020.04.01 08:47
 * @Version : v1.0
 */
@Repository
public class IndexDao {

    public void query(Integer i){
        System.out.println("query");
    }

}
