package com.java.InterviewPrep.InterviewQnAs;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class FindSeconLargestNum {

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        Integer i = list.stream().sorted(Comparator.reverseOrder())
                .skip(1)
                .findFirst()
                .get();
        System.out.println(i);
    }
}
