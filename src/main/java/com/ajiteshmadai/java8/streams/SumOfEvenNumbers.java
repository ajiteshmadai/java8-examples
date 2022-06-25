package com.ajiteshmadai.java8.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class SumOfEvenNumbers {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        Optional<Integer> sum = numbers.stream()
                .filter(number -> number % 2 == 0)
                .reduce(Integer::sum);
        System.out.println(sum.get());

    }

}
