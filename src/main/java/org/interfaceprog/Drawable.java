package org.interfaceprog;


public interface Drawable {
    void draw();
    default void msg()
    {
        System.out.println("Default Method");
    }

    static void display() {
        System.out.println("Using Static keyword");
    }

}
