package com.gla.multithreading;

class ExamActivity implements Runnable {
    private String activityName;
    private int startDelay;
    private int duration;

    ExamActivity(String name, int delay, int duration) {
        this.activityName = name;
        this.startDelay = delay;
        this.duration = duration;
    }

    @Override
    public void run() {
        try {
            Thread.sleep(startDelay * 1000);

            System.out.println(Thread.currentThread().getName() +
                    " STARTED: " + activityName);

            for(int i = 1; i <= duration; i++) {
                System.out.println(activityName + " in progress... (" + i + "s)");
                Thread.sleep(1000);
            }

            System.out.println(Thread.currentThread().getName() +
                    " COMPLETED: " + activityName + "\n");

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

public class ExamHallManagementSystem {
    public static void main(String[] args) throws InterruptedException {

        Thread entryThread = new Thread(
                new ExamActivity("Student Entry Monitoring", 0, 6), "Entry-Thread");

        Thread questionThread = new Thread(
                new ExamActivity("Question Paper Distribution", 5, 3), "Question-Thread");

        Thread attendanceThread = new Thread(
                new ExamActivity("Attendance Marking", 10, 3), "Attendance-Thread");

        Thread collectionThread = new Thread(
                new ExamActivity("Answer Sheet Collection", 15, 4), "Collection-Thread");

        questionThread.setPriority(10);
        attendanceThread.setPriority(8);
        collectionThread.setPriority(7);
        entryThread.setPriority(5);

        System.out.println("Initial States:");
        System.out.println("Entry: " + entryThread.getState());
        System.out.println("Question: " + questionThread.getState());
        System.out.println("Attendance: " + attendanceThread.getState());
        System.out.println("Collection: " + collectionThread.getState());
        System.out.println();

        entryThread.start();
        questionThread.start();
        attendanceThread.start();
        collectionThread.start();

        Thread.sleep(1000);
        System.out.println("\nStates After Starting:");
        System.out.println("Entry: " + entryThread.getState());
        System.out.println("Question: " + questionThread.getState());
        System.out.println("Attendance: " + attendanceThread.getState());
        System.out.println("Collection: " + collectionThread.getState());
        System.out.println();

        entryThread.join();
        questionThread.join();
        attendanceThread.join();
        collectionThread.join();

        System.out.println("\nFinal States:");
        System.out.println("Entry: " + entryThread.getState());
        System.out.println("Question: " + questionThread.getState());
        System.out.println("Attendance: " + attendanceThread.getState());
        System.out.println("Collection: " + collectionThread.getState());
    }
}