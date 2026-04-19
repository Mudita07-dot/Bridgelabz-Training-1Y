package com.gla.wrapperClasses;

import java.util.ArrayList;

public class WrapperInCollections {
    public static void main(String[] args) {
        double[] prices = {10.5, 20.0, 35.75, 5.5};
        ArrayList<Double> list = new ArrayList<>();

        for (double price : prices) {
            list.add(price);
        }

        double max = list.get(0);
        double sum = 0;

        for (Double p : list) {
            if (p > max) {
                max = p;
            }
            sum += p;
        }

        double avg = sum / list.size();

        System.out.println("Highest price = " + max);
        System.out.println("Average price = " + avg);
    }
}