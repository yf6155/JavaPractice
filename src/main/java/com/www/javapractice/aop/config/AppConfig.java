package com.www.javapractice.aop.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * <p>Application Name : AppConfig </p>
 * <p>Application Description :  </p>
 * <p>Company : WWW </p>
 * (C) Copyright WWW Corporation 2020 All Rights Reserved.
 *
 * @Author : HandsGoing
 * @Date : 2020.04.01 08:56
 * @Version : v1.0
 */
@Configuration
@EnableAspectJAutoProxy
@ComponentScan("com.www.javapractice.aop")
public class AppConfig {
}
