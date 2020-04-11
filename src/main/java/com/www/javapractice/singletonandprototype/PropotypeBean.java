package com.www.javapractice.singletonandprototype;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * <p>Application Name : PropotypeBean </p>
 * <p>Application Description :  </p>
 * <p>Company : WWW </p>
 * (C) Copyright WWW Corporation 2020 All Rights Reserved.
 *
 * @Author : HandsGoing
 * @Date : 2020.04.11 18:16
 * @Version : v1.0
 */
@Component
@Scope("prototype")
public class PropotypeBean {

    public PropotypeBean(){
        System.out.println("PropotypeBean Construct.");
    }

}
