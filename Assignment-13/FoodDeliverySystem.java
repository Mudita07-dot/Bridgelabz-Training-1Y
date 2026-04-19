package com.gla.multithreading;

class Order {
    int orderId;
    String restaurant;
    int deliveryTime; // in seconds
    String deliveryType;

    Order(int id, String restaurant, int time, String type) {
        this.orderId = id;
        this.restaurant = restaurant;
        this.deliveryTime = time;
        this.deliveryType = type;
    }
}

class DeliveryAgent implements Runnable {
    private Order order;

    DeliveryAgent(Order order) {
        this.order = order;
    }

    @Override
    public void run() {
        long startTime = System.currentTimeMillis();

        try {
            System.out.println(Thread.currentThread().getName() +
                    " picked up Order #" + order.orderId +
                    " from " + order.restaurant +
                    " [" + order.deliveryType + "]");

            Thread.sleep(1000);

            System.out.println(Thread.currentThread().getName() +
                    " is delivering Order #" + order.orderId +
                    " (In Transit)");

            Thread.sleep(order.deliveryTime * 1000);

            System.out.println(Thread.currentThread().getName() +
                    " delivered Order #" + order.orderId);

        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        long endTime = System.currentTimeMillis();
        System.out.println("Order #" + order.orderId +
                " completed in " + (endTime - startTime)/1000.0 + " seconds\n");
    }
}

public class FoodDeliverySystem {
    public static void main(String[] args) {

        Order o1 = new Order(101, "Dominos", 3, "Express");
        Order o2 = new Order(102, "KFC", 5, "Standard");
        Order o3 = new Order(103, "McDonalds", 6, "Economy");
        Order o4 = new Order(104, "Pizza Hut", 4, "Express");
        Order o5 = new Order(105, "Burger King", 7, "Standard");

        Thread t1 = new Thread(new DeliveryAgent(o1), "Agent-1");
        Thread t2 = new Thread(new DeliveryAgent(o2), "Agent-2");
        Thread t3 = new Thread(new DeliveryAgent(o3), "Agent-3");
        Thread t4 = new Thread(new DeliveryAgent(o4), "Agent-4");
        Thread t5 = new Thread(new DeliveryAgent(o5), "Agent-5");

        t1.setPriority(10);
        t4.setPriority(10);

        t2.setPriority(5);
        t5.setPriority(5);

        t3.setPriority(3);

        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
    }
}