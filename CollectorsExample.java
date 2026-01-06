package com.java.InterviewPrep.InterviewQnAs;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CollectorsExample {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "David", "Alice");

        // Grouping by name
        Map<String, Long> nameCount = names.stream()
                                           .collect(Collectors.groupingBy(name -> name, Collectors.counting()));

        System.out.println("Name counts: " + nameCount);
    }
}

