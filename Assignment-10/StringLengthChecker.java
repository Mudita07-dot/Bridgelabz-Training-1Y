package com.gla.InterfacesAbstraction;

import java.util.function.Function;

public class StringLengthChecker {

    public static void main(String[] args) {
        String message = "Hello, this is a sample message!";
        int limit = 20;

        Function<String, Integer> getLength = str -> str.length();

        int length = getLength.apply(message);

        if(length > limit) {
            System.out.println("Message exceeds the limit! Length: " + length);
        } else {
            System.out.println("Message is within the limit. Length: " + length);
        }
    }
}