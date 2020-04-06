package com.www.javapractice.beanfandfbean;

/**
 * <p>Application Name : RealFactoryBean </p>
 * <p>Application Description :  </p>
 * <p>Company : WWW </p>
 * (C) Copyright WWW Corporation 2020 All Rights Reserved.
 *
 * @Author : HandsGoing
 * @Date : 2020.04.05 21:35
 * @Version : v1.0
 */
public class RealFactoryBean {

    private String msg1;

    private String msg2;

    private String msg3;

    public void test(){
        System.out.println("RealFactoryBean test");
    }

    public String getMsg1() {
        return msg1;
    }

    public void setMsg1(String msg1) {
        this.msg1 = msg1;
    }

    public String getMsg2() {
        return msg2;
    }

    public void setMsg2(String msg2) {
        this.msg2 = msg2;
    }

    public String getMsg3() {
        return msg3;
    }

    public void setMsg3(String msg3) {
        this.msg3 = msg3;
    }
}
