package com.YEW.transport;

/**
 * @description:
 * @author: 86177
 * @date: Created in 2020/5/18 18:44
 * @version: 1.0
 * @modified By:
 */
public class Hovercraft extends MaritimeMeansOfTransport{
    @Override
    public void drivingMethod() {
        System.out.println("Hovercraft drivingMethod");
    }

    @Override
    public void load() {
        System.out.println("Hovercraft load");
    }

    @Override
    public void maintain() {
        System.out.println("Hovercraft maintain");
    }

    @Override
    public void addGas() {
        System.out.println("Hovercraft addGas");
    }


    public Hovercraft() {
    }

    public Hovercraft(String id) {
        super(id);
    }
}
