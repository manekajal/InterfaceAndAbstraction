package org.vehicle;

public class Truck implements Vehicle{

    @Override
    public void start() {
        System.out.println("starting truck engine...");

    }

    @Override
    public void stop() {
        System.out.println("stopping  truck engine...");
    }

    @Override
    public void blowHorn() {
        Vehicle.super.blowHorn();
    }
}
