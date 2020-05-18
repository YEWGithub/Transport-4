package com.YEW.transport;

/**
 * @description:
 * @author: 86177
 * @date: Created in 2020/5/18 18:43
 * @version: 1.0
 * @modified By:
 */
public class Bicycle extends LandTransport{
    @Override
    public void drivingMethod() {
        System.out.println("Bicycle drivingMethod");
    }

    @Override
    public void load() {
        System.out.println("Bicycle load");
    }

    @Override
    public void maintain() {
        System.out.println("Bicycle maintain");
    }

    @Override
    public void addGas() {
        System.out.println("Bicycle addGas");
    }


    public Bicycle() {
    }

    public Bicycle(String id) {
        super(id);
    }
}

