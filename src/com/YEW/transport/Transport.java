package com.YEW.transport;

import java.util.Date;

/**
 * @description:
 * @author: 86177
 * @date: Created in 2020/5/18 18:07
 * @version: 1.0
 * @modified By:
 */
public abstract class Transport {
    private String id;
    private String ownership;
    private String GPSPosition;
    private String price;
    private Date dateOfPurchase;

    public abstract void drivingMethod();
    public abstract void load();
    public abstract void maintain();
    public abstract void addGas();

    public Transport() {
    }

    public Transport(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getOwnership() {
        return ownership;
    }

    public void setOwnership(String ownership) {
        this.ownership = ownership;
    }

    public String getGPSPosition() {
        return GPSPosition;
    }

    public void setGPSPosition(String GPSPosition) {
        this.GPSPosition = GPSPosition;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public Date getDateOfPurchase() {
        return dateOfPurchase;
    }

    public void setDateOfPurchase(Date dateOfPurchase) {
        this.dateOfPurchase = dateOfPurchase;
    }
}
