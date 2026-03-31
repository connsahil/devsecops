package com.demo;

public class UserService {

    public boolean validateEmail(String email) {

        if (email == null || email.isEmpty()) {
            return false;
        }

        return email.contains("@") && email.contains(".");
    }

    public boolean validatePassword(String password) {

        if (password == null) {
            return false;
        }

        if (password.length() < 8) {
            return false;
        }

        boolean hasDigit = false;

        for (char c : password.toCharArray()) {
            if (Character.isDigit(c)) {
                hasDigit = true;
            }
        }

        return hasDigit;
    }
}
