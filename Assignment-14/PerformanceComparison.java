package com.gla.wrapperClasses.ScenarioBasedQuestions;

import java.util.ArrayList;

public class PerformanceComparison {
    public static void main(String[] args) {
        int n = 1_000_000;

        int[] arr = new int[n];
        long start1 = System.nanoTime();

        for (int i = 0; i < n; i++) {
            arr[i] = i;
        }

        long sum1 = 0;
        for (int i = 0; i < n; i++) {
            sum1 += arr[i];
        }

        long end1 = System.nanoTime();

        ArrayList<Integer> list = new ArrayList<>();
        long start2 = System.nanoTime();

        for (int i = 0; i < n; i++) {
            list.add(i);
        }

        long sum2 = 0;
        for (int val : list) {
            sum2 += val;
        }

        long end2 = System.nanoTime();

        System.out.println("Array sum = " + sum1);
        System.out.println("Array time = " + (end1 - start1) + " ns");

        System.out.println("ArrayList sum = " + sum2);
        System.out.println("ArrayList time = " + (end2 - start2) + " ns");
    }
}