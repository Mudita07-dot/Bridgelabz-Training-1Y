package com.gla.wrapperClasses.ScenarioBasedQuestions;

public class UserValidation {

    public static boolean isValidAge(String input) {
        try {
            int age = Integer.parseInt(input);
            return age >= 18;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    public static void main(String[] args) {
        String[] testInputs = {"20", "17", "abc", "18"};

        for (String input : testInputs) {
            System.out.println("Input: " + input + " -> " + isValidAge(input));
        }
    }
}
