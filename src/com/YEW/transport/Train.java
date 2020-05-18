package com.YEW.transport;

/**
 * @description:
 * @author: 86177
 * @date: Created in 2020/5/18 18:50
 * @version: 1.0
 * @modified By:
 */
public class Train extends LandTransport{
    @Override
    public void drivingMethod() {
        System.out.println("Train drivingMethod");
    }

    @Override
    public void load() {
        System.out.println("Train load");
    }

    @Override
    public void maintain() {
        System.out.println("Train maintain");
    }

    @Override
    public void addGas() {
        System.out.println("Train addGas");
    }


    public Train() {
    }

    public Train(String id) {
        super(id);
    }
}