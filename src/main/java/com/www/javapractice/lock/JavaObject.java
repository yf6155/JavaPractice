package com.www.javapractice.lock;

import com.www.javapractice.lock.entity.Obj;
import com.www.javapractice.lock.entity.Obj1;
import com.www.javapractice.lock.entity.Obj2;
import org.openjdk.jol.info.ClassLayout;

/**
 * <p>Application Name : JavaObject </p>
 * <p>Application Description :  </p>
 * <p>Company : WWW </p>
 * (C) Copyright WWW Corporation 2020 All Rights Reserved.
 *
 * @Auther : HandsGoing
 * @Date : 2020.03.18 08:35
 * @Version : v1.0
 */
public class JavaObject {

    public static Obj o = new Obj();

    public static Obj1 o1 = new Obj1();

    public static Obj2 o2 = new Obj2();

    public static void main(String[] args) {
        System.out.println(ClassLayout.parseInstance(o).toPrintable());
        System.out.println(ClassLayout.parseInstance(o1).toPrintable());
        System.out.println(ClassLayout.parseInstance(o2).toPrintable());

    }

}
