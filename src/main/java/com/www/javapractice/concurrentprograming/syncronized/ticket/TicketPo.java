package com.www.javapractice.concurrentprograming.syncronized.ticket;

import java.math.BigDecimal;

/**
 * <p>Application Name : TicketPo </p>
 * <p>Application Description :  </p>
 * <p>Company : WWW </p>
 * (C) Copyright WWW Corporation 2020 All Rights Reserved.
 *
 * @Author : HandsGoing
 * @Date : 2020.03.22 11:05
 * @Version : v1.0
 */
public class TicketPo {

    //航空公司
    private String company;

    // 出发地
    private String from;

    // 目的地
    private String to;

    // 是否需要中转
    private boolean ifNeedTransferStation;

    // 票价
    private BigDecimal price;


    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public boolean getIfNeedTransferStation() {
        return ifNeedTransferStation;
    }

    public void setIfNeedTransferStation(boolean ifNeedTransferStation) {
        this.ifNeedTransferStation = ifNeedTransferStation;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }
}
