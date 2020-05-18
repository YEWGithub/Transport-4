package com.YEW.transport;

/**
 * @description:
 * @author: 86177
 * @date: Created in 2020/5/18 18:42
 * @version: 1.0
 * @modified By:
 */
public class Automobile extends LandTransport{
    @Override
    public void drivingMethod() {
        System.out.println("Automobile drivingMethod");
    }

    @Override
    public void load() {
        System.out.println("Automobile load");
    }

    @Override
    public void maintain() {
        System.out.println("Automobile maintain");
    }

    @Override
    public void addGas() {
        System.out.println("Automobile addGas");
    }


    public Automobile() {
    }

    public Automobile(String id) {
        super(id);
    }
}

