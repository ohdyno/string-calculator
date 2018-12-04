package me.ohdyno.katas.calculator;

class Calculator {
    int add(String numbers) {
        if (numbers.isBlank()) {
            return 0;
        }
        return Integer.parseInt(numbers);
    }
}
