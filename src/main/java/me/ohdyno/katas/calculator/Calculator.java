package me.ohdyno.katas.calculator;

import java.util.Arrays;
import java.util.stream.Stream;

import static java.util.function.Predicate.not;

class Calculator {
    int add(String numbers) {
        DelimitedNumbers delimited = new DelimitedNumbers(numbers);
        Stream<String> nums = Arrays.stream(delimited.numbers().split(delimited.delimiter()));
        return nums.filter(not(String::isBlank))
                .map(Integer::parseInt)
                .reduce(0, Integer::sum);
    }


    private class DelimitedNumbers {
        private String numbers;
        private String delimiter;

        DelimitedNumbers(String numbers) {
            extractDelimiter(numbers);
        }

        String numbers() {
            return this.numbers;
        }

        String delimiter() {
            return this.delimiter;
        }

        private void extractDelimiter(String numbers) {
            if (numbers.startsWith("//")) {
                String[] split = numbers.split("\\n");
                this.delimiter = split[0].substring(2);
                this.numbers = split[1];
            } else {
                this.numbers = numbers;
                this.delimiter = "[,\n]";
            }
        }
    }
}
