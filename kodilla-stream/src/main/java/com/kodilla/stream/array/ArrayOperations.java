package com.kodilla.stream.array;

import java.util.stream.IntStream;

public interface ArrayOperations {
    static Double getAverage(int[] numbers){

        IntStream.range(0, numbers.length)
                .map(n -> numbers[n])
                .forEach(System.out::println);

        Double average =  IntStream.range(0, numbers.length)
                .map(n -> numbers[n])
                .average()
                .getAsDouble();
        return average;
    }
}
