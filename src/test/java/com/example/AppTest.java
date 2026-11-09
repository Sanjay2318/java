package com.example;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class AppTest {

    private final App app = new App();

    @Test
    void greetWithName() {
        assertEquals("Hello, Alice!", app.greet("Alice"));
    }

    @Test
    void greetWithNullOrBlank() {
        assertEquals("Hello, World!", app.greet(null));
        assertEquals("Hello, World!", app.greet("  "));
    }

    @Test
    void addNumbers() {
        assertEquals(5, app.add(2, 3));
    }
}
