package com.gla.wrapperClasses.ScenarioBasedQuestions;

import java.util.ArrayList;

public class StudentMarksReport {
    public static void main(String[] args) {
        Object[] inputs = {"85", 95, Integer.valueOf(88), "null", "abc"};

        ArrayList<Integer> validMarks = new ArrayList<>();

        for (Object obj : inputs) {
            if (obj == null) continue;

            try {
                if (obj instanceof String) {
                    String str = (String) obj;
                    if (str.equalsIgnoreCase("null")) continue;
                    validMarks.add(Integer.parseInt(str));
                } else if (obj instanceof Integer) {
                    validMarks.add((Integer) obj);
                }
            } catch (NumberFormatException e) {
                // ignore invalid values
            }
        }

        int sum = 0;
        for (Integer mark : validMarks) {
            sum += mark;
        }

        double avg = validMarks.size() == 0 ? 0 : (double) sum / validMarks.size();

        System.out.println("Average marks = " + avg);
    }
}