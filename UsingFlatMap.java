package com.java.InterviewPrep.InterviewQnAs;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class UsingFlatMap {
    // list of lists of integers, use flatMap to get a single list of all integers.

    public static void main(String[] args) {
        List<List<Integer>> lists = Arrays.asList(
                Arrays.asList(1, 2, 3),
                Arrays.asList(4, 5, 6),
                Arrays.asList(7, 8, 9)
        );

        List<Integer> flatList = lists.stream()
                .flatMap(Collection::stream)
                .collect(Collectors.toList());
        System.out.println(flatList); // Output should be [1, 2, 3, 4, 5, 6, 7, 8, 9]

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

        int sumOfSquares = numbers.parallelStream()
                .map(n -> n * n)
                .reduce(0, Integer::sum);
        System.out.println(sumOfSquares); // Output should be 55

        // converting String into streams
        String[] array = {"zebra", "apple", "orange", "banana"};

        String result = Arrays.stream(array)
                .sorted()
                .collect(Collectors.joining(", "));
        System.out.println(result); // Output should be "apple, banana, orange, zebra"
    }
}
