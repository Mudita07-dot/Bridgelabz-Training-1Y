package com.gla.InterfacesAbstraction;

public class PasswordValidatorApp {

    interface SecurityUtils {
        static boolean isStrongPassword(String password) {
            if(password.length() < 8) return false;
            boolean hasUpper = false, hasLower = false, hasDigit = false, hasSpecial = false;
            for(char ch : password.toCharArray()) {
                if(Character.isUpperCase(ch)) hasUpper = true;
                else if(Character.isLowerCase(ch)) hasLower = true;
                else if(Character.isDigit(ch)) hasDigit = true;
                else hasSpecial = true;
            }
            return hasUpper && hasLower && hasDigit && hasSpecial;
        }
    }

    public static void main(String[] args) {
        String password1 = "Abc123!";
        String password2 = "StrongPass@1";

        System.out.println("Password: " + password1 + " is strong? " + SecurityUtils.isStrongPassword(password1));
        System.out.println("Password: " + password2 + " is strong? " + SecurityUtils.isStrongPassword(password2));
    }
}