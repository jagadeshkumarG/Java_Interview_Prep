package com.java.InterviewPrep.InterviewQnAs;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class FindingEvenNums {

    //Input = 20, 23,8, 49, 23,96, 32
    //Output = 20,8,96,32
    public static void main(String[] args) {
        List<Integer> intList = Arrays.asList(20, 23,8, 49, 23,96, 32);

       List<Integer> newList = intList.stream().distinct().filter(in -> in%2==0).collect(Collectors.toList());

        Map<Boolean, List<Integer>> collectsss = intList.stream().collect(Collectors.partitioningBy(i -> i % 2 == 0));

        // intList.stream().distinct().forEach(System.out::println);

       System.out.println(collectsss);
    }


}
