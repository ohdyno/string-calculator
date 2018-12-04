package me.ohdyno.katas.calculator;

import java.util.Arrays;

class Calculator {
    int add(String numbers) {
        if (numbers.isBlank()) {
            return 0;
        }
        if (numbers.length() == 1) {
            return Integer.parseInt(numbers);
        }
        String[] num = numbers.split(",");
        return Arrays.stream(num)
                .map(Integer::parseInt)
                .reduce(0, Integer::sum);
    }
}
