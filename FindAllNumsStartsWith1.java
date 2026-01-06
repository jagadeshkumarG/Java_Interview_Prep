package com.java.InterviewPrep.InterviewQnAs;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FindAllNumsStartsWith1 {

    // Example [1, 12, 34, 54, 56, 67, 18, 17, 45, 10]
    // Ans [1, 12, 18, 17, 10]

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(1, 12, 34, 54, 56, 67, 18, 17, 45, 10);

        List<String> collect = numbers.stream().map(numb -> numb + "")
                .filter(str -> str.startsWith("1")).collect(Collectors.toList());
        System.out.println(collect);
        // forEach(System.out::println)
        ;
//		System.out.println("----------------------------------");
//
//		numbers.stream().filter(str -> str%2==0).forEach(System.out::println);
    }

}
