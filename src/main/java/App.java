package com.demo;

public class App {

    public static void main(String[] args) {

        Calculator calculator = new Calculator();
        UserService userService = new UserService();

        int sum = calculator.add(5, 3);
        int product = calculator.multiply(4, 6);

        System.out.println("Sum: " + sum);
        System.out.println("Product: " + product);

        boolean emailValid = userService.validateEmail("user@test.com");
        boolean passwordValid = userService.validatePassword("password123");

        System.out.println("Email valid: " + emailValid);
        System.out.println("Password valid: " + passwordValid);
    }
}
