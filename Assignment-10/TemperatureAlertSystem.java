package com.gla.InterfacesAbstraction;

import java.util.function.Predicate;

public class TemperatureAlertSystem {

    public static void main(String[] args) {
        double temperature = 102.5;
        double threshold = 100.0;

        Predicate<Double> alert = temp -> temp > threshold;

        if(alert.test(temperature)) {
            System.out.println("Alert! Temperature crossed threshold: " + temperature);
        } else {
            System.out.println("Temperature is normal: " + temperature);
        }
    }
}