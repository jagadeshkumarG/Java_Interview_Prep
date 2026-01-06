package com.java.InterviewPrep.InterviewQnAs;

import java.util.Arrays;
import java.util.List;

public class FindStringHaveLengthMoreThan5 {

    public static void main(String[] args) {

        List<String> list = Arrays.asList("india", "austrila", "englad", "srilanka", "usa", "uk");

        list.stream().filter(str -> str.length() > 5).map(str -> str.toUpperCase()).forEach(System.out::println);

    }

}
