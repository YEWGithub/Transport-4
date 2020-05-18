package com.YEW.transport;

/**
 * @description:
 * @author: 86177
 * @date: Created in 2020/5/18 18:47
 * @version: 1.0
 * @modified By:
 */
public class Motorcycle extends LandTransport{
    @Override
    public void drivingMethod() {
        System.out.println("Motorcycle drivingMethod");
    }

    @Override
    public void load() {
        System.out.println("Motorcycle load");
    }

    @Override
    public void maintain() {
        System.out.println("Motorcycle maintain");
    }

    @Override
    public void addGas() {
        System.out.println("Motorcycle addGas");
    }


    public Motorcycle() {
    }

    public Motorcycle(String id) {
        super(id);
    }
}

