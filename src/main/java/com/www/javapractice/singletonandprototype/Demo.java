package com.www.javapractice.singletonandprototype;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * <p>Application Name : Demo </p>
 * <p>Application Description :  </p>
 * <p>Company : WWW </p>
 * (C) Copyright WWW Corporation 2020 All Rights Reserved.
 *
 * @Author : HandsGoing
 * @Date : 2020.04.11 18:20
 * @Version : v1.0
 */
public class Demo {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(AppConfig.class);

        SingletonBean singletonBean = annotationConfigApplicationContext.getBean(SingletonBean.class);

        singletonBean.showHashCode();
        singletonBean.showHashCode();

        SingletonBeanAppCtxt singletonBeanAppCtxt = annotationConfigApplicationContext.getBean(SingletonBeanAppCtxt.class);
        singletonBeanAppCtxt.showHashCode();
        singletonBeanAppCtxt.showHashCode();

        SingletonBeanLookUp singletonBeanLookUp = annotationConfigApplicationContext.getBean(SingletonBeanLookUp.class);
        singletonBeanLookUp.showHashCode();
        singletonBeanLookUp.showHashCode();
    }

}
