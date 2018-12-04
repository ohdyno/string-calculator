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

    @Test
    @DisplayName("Adding multiple numbers returns the sum")
    void multipleNumbers() {
        assertEquals(55, new Calculator().add("1,2,3,4,5,6,7,8,9,10"));
    }

    @Test
    @DisplayName("Adding numbers separated by new lines (\\n) instead of commas (,)")
    void newLineDelimiters() {
        assertEquals(55, new Calculator().add("1\n2,3\n4,5,6\n7,8,9,10"));
    }

    @Test
    @DisplayName("Can define explicit delimiter")
    void defineDelimiter() {
        assertEquals(55, new Calculator().add("//something\nsomething1something2something3something4something5something6something7something8something9something10"));
        assertEquals(55, new Calculator().add("//;\n;1;2;3;4;5;6;7;8;9;10"));
    }
}
