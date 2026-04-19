package com.gla.wrapperClasses.ScenarioBasedQuestions;

import java.util.ArrayList;
import java.util.Objects;

public class ProductRatingsAnalyzer {
    public static void main(String[] args) {
        int[] primitiveRatings = {4, 5, 3, 4};

        ArrayList<Integer> objectRatings = new ArrayList<>();
        objectRatings.add(5);
        objectRatings.add(null);
        objectRatings.add(3);
        objectRatings.add(4);

        ArrayList<Integer> allRatings = new ArrayList<>();

        for (int r : primitiveRatings) {
            allRatings.add(r);
        }

        allRatings.addAll(objectRatings);

        int sum = 0;
        int count = 0;

        for (Integer r : allRatings) {
            if (Objects.nonNull(r)) {
                sum += r;
                count++;
            }
        }

        double avg = (count == 0) ? 0 : (double) sum / count;

        System.out.println("Average rating = " + avg);
    }
}