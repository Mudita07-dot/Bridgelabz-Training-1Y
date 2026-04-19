package com.gla.wrapperClasses;

public class WrapperToPrimitive {
    public static void main(String[] args) {
        Double obj = 45.67;

        double d = obj;
        int i = (int) d;

        System.out.println("Double object value: " + obj);
        System.out.println("Primitive double value: " + d);
        System.out.println("Primitive int value: " + i);
    }
}