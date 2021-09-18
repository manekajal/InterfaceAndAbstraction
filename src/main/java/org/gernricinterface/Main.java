package org.gernricinterface;

public class Main {
    public static void main(String[] args){
        Integer arr[] = { 12,43,56,23};
        MyClass<Integer> my = new MyClass<Integer>(arr);
        System.out.println("Minimum value: " + my.min());
        System.out.println("Minimum value: " + my.max());
    }
}
