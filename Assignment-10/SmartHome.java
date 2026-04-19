package com.gla.InterfacesAbstraction;

public class SmartHome {

    interface SmartDevice {
        void turnOn();
        void turnOff();
    }

    static class Light implements SmartDevice {
        private boolean isOn = false;
        public void turnOn() { isOn = true; System.out.println("Light is turned ON"); }
        public void turnOff() { isOn = false; System.out.println("Light is turned OFF"); }
    }

    static class AC implements SmartDevice {
        private boolean isOn = false;
        public void turnOn() { isOn = true; System.out.println("AC is turned ON"); }
        public void turnOff() { isOn = false; System.out.println("AC is turned OFF"); }
    }

    static class TV implements SmartDevice {
        private boolean isOn = false;
        public void turnOn() { isOn = true; System.out.println("TV is turned ON"); }
        public void turnOff() { isOn = false; System.out.println("TV is turned OFF"); }
    }

    public static void main(String[] args) {
        SmartDevice light = new Light();
        SmartDevice ac = new AC();
        SmartDevice tv = new TV();

        light.turnOn();
        ac.turnOn();
        tv.turnOn();

        System.out.println();

        light.turnOff();
        ac.turnOff();
        tv.turnOff();
    }
}