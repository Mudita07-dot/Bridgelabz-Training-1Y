package com.gla.InterfacesAbstraction;

public class VehicleRentalSystem {

    interface Vehicle {
        void rent();
        void returnVehicle();
    }

    static class Car implements Vehicle {
        private boolean rented = false;
        public void rent() { rented = true; System.out.println("Car rented"); }
        public void returnVehicle() { rented = false; System.out.println("Car returned"); }
    }

    static class Bike implements Vehicle {
        private boolean rented = false;
        public void rent() { rented = true; System.out.println("Bike rented"); }
        public void returnVehicle() { rented = false; System.out.println("Bike returned"); }
    }

    static class Bus implements Vehicle {
        private boolean rented = false;
        public void rent() { rented = true; System.out.println("Bus rented"); }
        public void returnVehicle() { rented = false; System.out.println("Bus returned"); }
    }

    public static void main(String[] args) {
        Vehicle car = new Car();
        Vehicle bike = new Bike();
        Vehicle bus = new Bus();

        car.rent();
        bike.rent();
        bus.rent();

        System.out.println();

        car.returnVehicle();
        bike.returnVehicle();
        bus.returnVehicle();
    }
}