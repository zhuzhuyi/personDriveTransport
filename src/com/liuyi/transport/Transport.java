package com.liuyi.transport;

import java.util.Date;

public abstract class Transport {

    //属性
    private String ownership;
    private String GPSPosition;
    private String price;
    private String id;
    Date dateOfPurchase;
    //构造方法
    public Transport() {

    }
    public Transport(String s) {

    }
    //基类抽象方法
    public abstract void load();
    public abstract void maintain();
    public abstract void addGas();
    public abstract void DriveMethod();
}

