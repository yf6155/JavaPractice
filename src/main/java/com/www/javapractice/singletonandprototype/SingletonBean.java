package com.www.javapractice.singletonandprototype;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * <p>Application Name : SingletonBean </p>
 * <p>Application Description :  </p>
 * <p>Company : WWW </p>
 * (C) Copyright WWW Corporation 2020 All Rights Reserved.
 *
 * @Author : HandsGoing
 * @Date : 2020.04.11 18:13
 * @Version : v1.0
 */
@Component
@Scope("singleton")
public class SingletonBean {

    @Autowired
    private PropotypeBean propotypeBean;

    public SingletonBean(){
        System.out.println("SingletonBean Construct.");
    }

    public void showHashCode(){
        System.out.println(propotypeBean.hashCode());
    }
}
