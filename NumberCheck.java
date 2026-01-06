package com.java.InterviewPrep.InterviewQnAs;

import java.util.Arrays;
import java.util.List;

public class NumberCheck {

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        int numberToCheck = 5;

        boolean isPresent = list.stream().anyMatch(num -> num == numberToCheck);

        if (isPresent) {
            System.out.println("the Number isPresent in the List");
        } else {
            System.out.println("the Number isNotPresent in the List");
        }

        List<Integer> list5 = Arrays.asList(1, 2, 3, 12, 5, 10);

        boolean numList = list5.stream().allMatch(num -> num % 5 == 0);

        //boolean numList = list5.stream().allMatch(num -> num % 5 == 0);

        System.out.println(numList);

    }

}

