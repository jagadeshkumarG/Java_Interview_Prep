package com.java.InterviewPrep.InterviewQnAs;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class SeperateEvenOddNumbers {

    // Example -> [1,2,3,4,5,6,7,8,9,10]
    // Even -> [2,4,6,8,10]
    // Odd -> [1,3,5,7,9]

    public static void main(String[] args) {

        List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        
       List<Integer> filterMethEveOdd = nums.stream().filter(i -> i% 2 ==0).collect(Collectors.toList());

        Map<Boolean, List<Integer>> mapList = nums.stream().collect(Collectors.partitioningBy(num -> num % 2 == 0));

        List<Integer> evenNms = mapList.get(true);
        List<Integer> oddNms = mapList.get(false);

        System.out.println("Even_Numbers: " + evenNms);
        System.out.println("Odd_Numbers: " + oddNms);

    }

}
