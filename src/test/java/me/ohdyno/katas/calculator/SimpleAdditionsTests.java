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

}
