package com.gla.InterfacesAbstraction;

public class DigitalPaymentSystem {

    interface Payment {
        void pay(double amount);
    }

    static class UPI implements Payment {
        @Override
        public void pay(double amount) {
            System.out.println("Paid " + amount + " via UPI");
        }
    }

    static class CreditCard implements Payment {
        @Override
        public void pay(double amount) {
            System.out.println("Paid " + amount + " via Credit Card");
        }
    }

    static class Wallet implements Payment {
        @Override
        public void pay(double amount) {
            System.out.println("Paid " + amount + " via Wallet");
        }
    }

    public static void main(String[] args) {
        Payment upi = new UPI();
        Payment card = new CreditCard();
        Payment wallet = new Wallet();

        upi.pay(500);
        card.pay(1200);
        wallet.pay(250);
    }
}