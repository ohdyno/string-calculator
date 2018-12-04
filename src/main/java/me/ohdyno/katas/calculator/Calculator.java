package me.ohdyno.katas.calculator;

import java.util.Arrays;
import java.util.stream.Stream;

import static java.util.function.Predicate.not;

class Calculator {
    int add(String numbers) {
        Stream<String> nums = Arrays.stream(numbers.split("[,\n]"));
        return nums.filter(not(String::isBlank))
                .map(Integer::parseInt)
                .reduce(0, Integer::sum);
    }
}
