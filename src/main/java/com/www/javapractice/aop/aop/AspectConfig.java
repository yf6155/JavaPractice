package com.www.javapractice.aop.aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * <p>Application Name : AspectConfig </p>
 * <p>Application Description :  </p>
 * <p>Company : WWW </p>
 * (C) Copyright WWW Corporation 2020 All Rights Reserved.
 *
 * @Author : HandsGoing
 * @Date : 2020.04.01 08:48
 * @Version : v1.0
 */
@Component
@Aspect
public class AspectConfig {

    @Pointcut("execution(* com.www.javapractice.aop.dao.*.*(..))")
    public void pointC(){

    }

    @Pointcut("within(com.www.javapractice.aop.dao.IndexDao)")
    public void pointWithIn(){

    }

    @Pointcut("args(java.lang.Integer)")
    public void pointArgs(){

    }

    @Before("pointArgs()")
    public void before(){
        System.out.println("before");
    }

}
