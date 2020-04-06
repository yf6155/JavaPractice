package com.www.javapractice.beanfandfbean;

import org.springframework.beans.factory.FactoryBean;
import org.springframework.stereotype.Component;

/**
 * <p>Application Name : ServiceFactoryBean </p>
 * <p>Application Description :  </p>
 * <p>Company : WWW </p>
 * (C) Copyright WWW Corporation 2020 All Rights Reserved.
 *
 * @Author : HandsGoing
 * @Date : 2020.04.05 21:34
 * @Version : v1.0
 */
public class ServiceFactoryBean implements FactoryBean {

    private String msg;

    @Override
    public Object getObject() throws Exception {
        RealFactoryBean temp = new RealFactoryBean();
        String[] array = msg.split(",");
        temp.setMsg1(array[0]);
        temp.setMsg2(array[1]);
        temp.setMsg3(array[2]);
        return temp;
    }

    @Override
    public Class<?> getObjectType() {
        return RealFactoryBean.class;
    }

    @Override
    public boolean isSingleton() {
        return true;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
