package com.www.javapractice.concurrentprograming.singletones;

/**
 * <p>Application Name : EnumDemo </p>
 * <p>Application Description :  </p>
 * <p>Company : WWW </p>
 * (C) Copyright WWW Corporation 2020 All Rights Reserved.
 *
 * @Author : HandsGoing
 * @Date : 2020.03.23 20:37
 * @Version : v1.0
 */
public enum EnumDemo {
    A,B,C,D;

    public  void m1(){
        System.out.println("method");
    }

    public static void main(String[] args) {
        A.m1();
        B.m1();
        C.m1();
        D.m1();
        System.out.println(A.getClass().getName());
        System.out.println(B.getClass().getName());
        System.out.println(C.getClass().getName());
        System.out.println(D.getClass().getName());
    }

}
