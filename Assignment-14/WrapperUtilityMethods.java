package com.gla.wrapperClasses;

public class WrapperUtilityMethods {
    public static void main(String[] args) {
        int intValue = Integer.parseInt("123");
        double doubleValue = Double.parseDouble("3.14");
        boolean boolValue = Boolean.parseBoolean("true");
        String binary = Integer.toBinaryString(10);
        boolean isDigit = Character.isDigit('5');
        char upper = Character.toUpperCase('a');

        System.out.println("Integer.parseInt(\"123\") = " + intValue);
        System.out.println("Double.parseDouble(\"3.14\") = " + doubleValue);
        System.out.println("Boolean.parseBoolean(\"true\") = " + boolValue);
        System.out.println("Integer.toBinaryString(10) = " + binary);
        System.out.println("Character.isDigit('5') = " + isDigit);
        System.out.println("Character.toUpperCase('a') = " + upper);
    }
}
