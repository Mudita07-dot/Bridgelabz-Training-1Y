package com.gla.multithreading;

class BankAccount {
    String accountHolder;
    String accountType;

    BankAccount(String name, String type) {
        this.accountHolder = name;
        this.accountType = type;
    }
}

class BalanceChecker implements Runnable {
    BankAccount account;

    BalanceChecker(BankAccount acc) {
        this.account = acc;
    }

    @Override
    public void run() {
        for(int i = 1; i <= 3; i++) {
            System.out.println(
                    Thread.currentThread().getName() +
                            " [" + account.accountType + " Account] is checking balance | Priority: " +
                            Thread.currentThread().getPriority()
            );

            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class BankingSystemSimulation {
    public static void main(String[] args) {

        BankAccount premiumAccount = new BankAccount("Abhay", "Premium");
        BankAccount regularAccount = new BankAccount("Rohit", "Regular");
        BankAccount basicAccount = new BankAccount("Aman", "Basic");

        Thread premiumUser = new Thread(new BalanceChecker(premiumAccount), "Premium-User");
        Thread regularUser = new Thread(new BalanceChecker(regularAccount), "Regular-User");
        Thread basicUser = new Thread(new BalanceChecker(basicAccount), "Basic-User");

        premiumUser.setPriority(Thread.MAX_PRIORITY); // 10
        regularUser.setPriority(Thread.NORM_PRIORITY); // 5
        basicUser.setPriority(Thread.MIN_PRIORITY); // 1

        premiumUser.start();
        regularUser.start();
        basicUser.start();
    }
}