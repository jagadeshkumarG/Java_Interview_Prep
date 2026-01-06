package com.java.InterviewPrep.InterviewQnAs;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class SortingStringByLength {
        public static void main(String[] args) {
            List<String> strings = Arrays.asList("apple", "banana", "cherry", "date");
            List<String> sortedByLength = strings.stream()
                    .sorted((s1, s2) -> Integer.compare(s1.length(), s2.length()))
                    .collect(Collectors.toList());
            System.out.println(sortedByLength);

            List<String> strings1 = Arrays.asList("apple", "banana", "cherry", "date", "fig");
            Map<Integer, List<String>> groupedByLength = strings1.stream()
                    .collect(Collectors.groupingBy(String::length));
            System.out.println(groupedByLength);

            List<Integer> numbers = Arrays.asList(3, 7, 2, 9, 5);
            Optional<Integer> max = numbers.stream().reduce(Integer::max);
          //  numbers.stream().max(Integer::compare);
            System.out.println(max.orElseThrow()); // Output should be 9
        }
    }
