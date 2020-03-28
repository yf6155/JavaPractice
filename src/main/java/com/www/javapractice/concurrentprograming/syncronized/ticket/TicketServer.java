package com.www.javapractice.concurrentprograming.syncronized.ticket;

import java.util.ArrayList;

/**
 * <p>Application Name : TicketServer </p>
 * <p>Application Description :  </p>
 * <p>Company : WWW </p>
 * (C) Copyright WWW Corporation 2020 All Rights Reserved.
 *
 * @Author : HandsGoing
 * @Date : 2020.03.22 11:19
 * @Version : v1.0
 */
public class TicketServer {

    private String company;

    public TicketServer(String company) {
        this.company = company;
    }

    public synchronized ArrayList<TicketPo> queryTicket(String company, String from, String to) {
        ArrayList<TicketPo> result = new ArrayList<TicketPo>();
        TicketPo po = new TicketPo();
        po.setCompany(company);
        po.setFrom(from);
        po.setTo(to);
        result.add(po);
        return result;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }
}
