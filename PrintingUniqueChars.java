package com.java.InterviewPrep.InterviewQnAs;

import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class PrintingUniqueChars {

    public static void main(String[] args) {

        String str = "WELCOME";

        Stream.of(str.split(""))
                .filter(s -> str.indexOf(s) == str.lastIndexOf(str))
                .collect(Collectors.toList()).forEach(System.out::println);
        str.chars().mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        //System.out.println(collect);
    }
}
