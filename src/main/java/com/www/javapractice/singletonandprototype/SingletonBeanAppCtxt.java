package com.www.javapractice.singletonandprototype;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
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
public class SingletonBeanAppCtxt implements ApplicationContextAware {

    private ApplicationContext applicationContext;

    private PropotypeBean propotypeBean;

    public SingletonBeanAppCtxt(){
        System.out.println("SingletonBeanAppCtxt Construct.");
    }

    public void showHashCode(){
        propotypeBean = applicationContext.getBean(PropotypeBean.class);
        System.out.println(propotypeBean.hashCode());
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) {
        this.applicationContext = applicationContext;
    }
}
