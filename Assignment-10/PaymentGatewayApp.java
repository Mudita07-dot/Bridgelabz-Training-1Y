package com.gla.InterfacesAbstraction;

public class PaymentGatewayApp {

    interface PaymentProcessor {
        void pay(double amount);

        default void refund(double amount) {
            System.out.println("Refund of " + amount + " processed by default method.");
        }
    }

    static class UPI implements PaymentProcessor {
        @Override
        public void pay(double amount) {
            System.out.println("Paid " + amount + " via UPI");
        }
    }

    static class CreditCard implements PaymentProcessor {
        @Override
        public void pay(double amount) {
            System.out.println("Paid " + amount + " via Credit Card");
        }

        @Override
        public void refund(double amount) {
            System.out.println("Refund of " + amount + " via Credit Card gateway");
        }
    }

    static class Wallet implements PaymentProcessor {
        @Override
        public void pay(double amount) {
            System.out.println("Paid " + amount + " via Wallet");
        }
    }

    public static void main(String[] args) {
        PaymentProcessor upi = new UPI();
        PaymentProcessor card = new CreditCard();
        PaymentProcessor wallet = new Wallet();

        upi.pay(500);
        card.pay(1200);
        wallet.pay(250);

        System.out.println();

        upi.refund(200);    // Uses default method
        card.refund(500);   // Uses overridden method
        wallet.refund(100); // Uses default method
    }
}