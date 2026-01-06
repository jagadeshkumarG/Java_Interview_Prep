package com.java.InterviewPrep.InterviewQnAs;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FindingCommonElements {

    public static void subStringFilter() {
        List<String> list = Arrays.asList("Java", "Spring", "SpringBoot", "Hibernate", "SQL");

        String subString = "Spring";

        List<String> subStringList = list.stream().filter(str -> str.contains(subString)).collect(Collectors.toList());

        System.out.println(subStringList);
    }

    public static void main(String[] args) {
        // List1 = [1,2,3,4,5,6]
        // List2 = [4,5,6,7,8,9]

        List<Integer> list1 = Arrays.asList(1, 2, 3, 4, 5, 6);

        List<Integer> list2 = Arrays.asList(4, 5, 6, 7, 8, 9);

        List<Integer> commonElements = list1.stream().filter(list2::contains).collect(Collectors.toList());

        System.out.println(commonElements);

        subStringFilter();

    }
}

