package me.ohdyno.katas.calculator;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SimpleAdditionsTests {
    @Test
    @DisplayName("Adding an empty string returns 0")
    void returns0() {
        assertEquals(0, new Calculator().add(""));
    }

    @Test
    @DisplayName("Adding one number returns the number itself")
    void oneNumber() {
        assertEquals(1, new Calculator().add("1"));
        assertEquals(2, new Calculator().add("2"));
    }

    @Test
    @DisplayName("Adding two numbers returns the sum")
    void twoNumbers() {
        assertEquals(0, new Calculator().add("0,0"));
        assertEquals(1, new Calculator().add("1,0"));
    }
}
