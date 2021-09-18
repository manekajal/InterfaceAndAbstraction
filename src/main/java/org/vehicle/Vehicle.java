package org.vehicle;

public interface Vehicle {
     String licensePlate = "";

    void start();
    void stop();
    default void blowHorn(){
        System.out.println("Blowing horn");
    }
}
