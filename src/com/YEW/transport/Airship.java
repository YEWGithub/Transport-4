package com.YEW.transport;

/**
 * @description:
 * @author: 86177
 * @date: Created in 2020/5/18 18:40
 * @version: 1.0
 * @modified By:
 */
public class Airship extends AirTransport{
    @Override
    public void drivingMethod() {
        System.out.println("Airship drivingMethod");
    }

    @Override
    public void load() {
        System.out.println("Airship load");
    }

    @Override
    public void maintain() {
        System.out.println("Airship maintain");
    }

    @Override
    public void addGas() {
        System.out.println("Airship addGas");
    }

    public Airship() {
    }

    public Airship(String id) {
        super(id);
    }
}
