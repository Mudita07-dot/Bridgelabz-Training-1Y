package com.gla.wrapperClasses.ScenarioBasedQuestions;

import java.util.ArrayList;

public class SensorDataLogger {

    static ArrayList<Double> data = new ArrayList<>();

    public static void log(double value) {
        data.add(value);
    }

    public static void log(Double value) {
        data.add(value);
    }

    public static void printData() {
        for (Double d : data) {
            double temp = d;
            System.out.println(temp);
        }
    }

    public static void main(String[] args) {
        log(25.5);
        log(Double.valueOf(30.2));
        log(28.7);

        printData();
    }
}