package com.gla.multithreading;

import java.util.*;

class TicketThread extends Thread {
    private int ticketId;
    private String type;
    private int priority;
    private int queuePosition;
    private static Random rand = new Random();
    public long processingTime = 0;

    TicketThread(int id, String type, int priority, int queuePosition, String agentName) {
        super(agentName);
        this.ticketId = id;
        this.type = type;
        this.priority = priority;
        this.queuePosition = queuePosition;
    }

    @Override
    public void run() {
        try {
            long start = System.currentTimeMillis();

            System.out.println(
                    "Ticket #" + ticketId +
                            " | Type: " + type +
                            " | Agent: " + getName() +
                            " | Priority: " + priority +
                            " | Queue Position: " + queuePosition +
                            " -> STARTED"
            );

            int sleepTime = (rand.nextInt(5) + 1) * 1000;
            Thread.sleep(sleepTime);

            long end = System.currentTimeMillis();
            processingTime = (end - start);

            System.out.println(
                    "Ticket #" + ticketId +
                            " -> COMPLETED in " + (processingTime / 1000.0) + " sec\n"
            );

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public int getPriorityLevel() {
        return priority;
    }
}

public class CustomerSupportSystem {
    public static void main(String[] args) throws InterruptedException {

        List<TicketThread> tickets = new ArrayList<>();

        tickets.add(new TicketThread(1, "Critical Bug", 10, 1, "Agent-A"));
        tickets.add(new TicketThread(2, "Feature Request", 4, 2, "Agent-B"));
        tickets.add(new TicketThread(3, "General Query", 2, 3, "Agent-C"));
        tickets.add(new TicketThread(4, "Feedback", 1, 4, "Agent-D"));
        tickets.add(new TicketThread(5, "Critical Bug", 10, 5, "Agent-E"));
        tickets.add(new TicketThread(6, "Feature Request", 4, 6, "Agent-F"));
        tickets.add(new TicketThread(7, "General Query", 2, 7, "Agent-G"));
        tickets.add(new TicketThread(8, "Feedback", 1, 8, "Agent-H"));
        tickets.add(new TicketThread(9, "Critical Bug", 10, 9, "Agent-I"));
        tickets.add(new TicketThread(10, "General Query", 2, 10, "Agent-J"));

        Collections.sort(tickets, (a, b) -> b.getPriorityLevel() - a.getPriorityLevel());

        long totalStart = System.currentTimeMillis();

        for (TicketThread t : tickets) {
            t.setPriority(t.getPriorityLevel());
            t.start();
        }

        for (TicketThread t : tickets) {
            t.join();
        }

        long totalEnd = System.currentTimeMillis();

        System.out.println("\nTotal Processing Time: " + (totalEnd - totalStart) / 1000.0 + " sec");

        Map<Integer, List<Long>> map = new HashMap<>();

        for (TicketThread t : tickets) {
            map.putIfAbsent(t.getPriorityLevel(), new ArrayList<>());
            map.get(t.getPriorityLevel()).add(t.processingTime);
        }

        System.out.println("\nAverage Time per Priority:");

        for (int p : map.keySet()) {
            List<Long> times = map.get(p);
            long sum = 0;
            for (long t : times) sum += t;

            double avg = sum / (double) times.size() / 1000.0;
            System.out.println("Priority " + p + " -> " + avg + " sec");
        }
    }
}