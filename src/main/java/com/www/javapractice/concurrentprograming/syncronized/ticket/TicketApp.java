package com.www.javapractice.concurrentprograming.syncronized.ticket;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

/**
 * <p>Application Name : TicketApp </p>
 * <p>Application Description :  </p>
 * <p>Company : WWW </p>
 * (C) Copyright WWW Corporation 2020 All Rights Reserved.
 *
 * @Author : HandsGoing
 * @Date : 2020.03.22 11:11
 * @Version : v1.0
 */
public class TicketApp {

    private static ArrayList<TicketPo> ticketInfo = new ArrayList<TicketPo>();

    private volatile static int queryFlag = 0;

    public static void main(String[] args) {

        System.out.println("开始查询");
        String f = "上海";
        String t = "北京";

        Thread t1 = new Thread() {
            @Override
            public void run() {
                TicketServer ts = new TicketServer("东航");
                ticketInfo.addAll(ts.queryTicket(ts.getCompany(), f, t));
            }
        };
        t1.setName("东航");

        Thread t2 = new Thread() {
            @Override
            public void run() {
                TicketServer ts = new TicketServer("南航");
                ticketInfo.addAll(ts.queryTicket(ts.getCompany(), f, t));
            }
        };
        t2.setName("南航");

        t1.start();
        t2.start();


        try {
            TimeUnit.SECONDS.sleep(20);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(ticketInfo.toString());

        System.out.println("查询结束");
    }
}
