package com.gla.multithreading;

import java.time.LocalTime;

class SmartDevice implements Runnable {
    private String deviceName;
    private int interval; // in milliseconds

    SmartDevice(String deviceName, int seconds) {
        this.deviceName = deviceName;
        this.interval = seconds * 1000;
    }

    @Override
    public void run() {
        for(int i = 1; i <= 5; i++) {
            System.out.println(
                    "[" + LocalTime.now() + "] " +
                            deviceName + " is running | Thread: " +
                            Thread.currentThread().getName() +
                            " | Priority: " + Thread.currentThread().getPriority()
            );

            try {
                Thread.sleep(interval);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println(deviceName + " has completed its cycles.\n");
    }
}

public class SmartHomeAutomationSystem {
    public static void main(String[] args) {

        SmartDevice temperatureSensor = new SmartDevice("Temperature Sensor", 5);
        SmartDevice securityCamera = new SmartDevice("Security Camera", 3);
        SmartDevice lightController = new SmartDevice("Light Controller", 4);
        SmartDevice doorLockMonitor = new SmartDevice("Door Lock Monitor", 6);

        Thread tempThread = new Thread(temperatureSensor, "Temp-Thread");
        Thread securityThread = new Thread(securityCamera, "Security-Thread");
        Thread lightThread = new Thread(lightController, "Light-Thread");
        Thread doorThread = new Thread(doorLockMonitor, "Door-Thread");

        securityThread.setPriority(10);
        tempThread.setPriority(7);
        lightThread.setPriority(5);
        doorThread.setPriority(5);

        tempThread.start();
        securityThread.start();
        lightThread.start();
        doorThread.start();

        try {
            tempThread.join();
            securityThread.join();
            lightThread.join();
            doorThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("\nAll Smart Home Devices have completed execution.");
    }
}