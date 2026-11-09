package com.example;

public class App {

    public String greet(String name) {
        if (name == null || name.isBlank()) {
            return "Hello, World!";
        }
        return "Hello, " + name + "!";
    }

    public int add(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        App app = new App();
        System.out.println(app.greet("GitHub Actions"));
        System.out.println("2 + 3 = " + app.add(2, 3));
    }
}
