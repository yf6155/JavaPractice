package com.www.javapractice.singletonandprototype;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Lookup;
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
public abstract class SingletonBeanLookUp {

    private PropotypeBean propotypeBean;

    public SingletonBeanLookUp() {
        System.out.println("SingletonBeanLookUp Construct.");
    }

    public void showHashCode() {
        propotypeBean = methodInvoke();
        System.out.println(propotypeBean.hashCode());
    }

    @Lookup
    protected abstract PropotypeBean methodInvoke();
}
