package com.YEW.transport;

/**
 * @description:
 * @author: 86177
 * @date: Created in 2020/5/18 18:51
 * @version: 1.0
 * @modified By:
 */
public class Submarine extends MaritimeMeansOfTransport{
    @Override
    public void drivingMethod() {
        System.out.println("Submarine drivingMethod");
    }

    @Override
    public void load() {
        System.out.println("Submarine load");
    }

    @Override
    public void maintain() {
        System.out.println("Submarine maintain");
    }

    @Override
    public void addGas() {
        System.out.println("Submarine addGas");
    }


    public Submarine() {
    }

    public Submarine(String id) {
        super(id);
    }
}

