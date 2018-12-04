package me.ohdyno.katas.calculator;

import java.util.Arrays;

class Calculator {
    int add(String numbers) {
        String[] num = ("0," + numbers).split(",");
        return Arrays.stream(num)
                .map(Integer::parseInt)
                .reduce(0, Integer::sum);
    }
}
