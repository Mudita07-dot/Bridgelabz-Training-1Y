package com.gla.InterfacesAbstraction;

public class BackgroundJobExecution {

    public static void main(String[] args) {

        Runnable task1 = () -> {
            System.out.println("Task 1 started in background...");
            try { Thread.sleep(1000); } catch (InterruptedException e) {}
            System.out.println("Task 1 completed!");
        };

        Runnable task2 = () -> {
            System.out.println("Task 2 started in background...");
            try { Thread.sleep(500); } catch (InterruptedException e) {}
            System.out.println("Task 2 completed!");
        };

        Thread thread1 = new Thread(task1);
        Thread thread2 = new Thread(task2);

        thread1.start();
        thread2.start();

        System.out.println("Main thread continues executing...");
    }
}