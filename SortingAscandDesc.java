package com.java.InterviewPrep.InterviewQnAs;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class SortingAscandDesc {

    public static void main(String[] args) {

        List<Integer> numberList = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        //numberList.stream().sorted().forEach(System.out::println); //asc
        //numberList.stream().sorted((a,b) -> b-a).forEach(System.out::println); //desc
        List<Integer> newList = numberList.stream().sorted(Collections.reverseOrder()).collect(Collectors.toList()); //desc
        //forEach(System.out::println);
        System.out.println(newList);
//        String str = "JAVA LOVE I";
//        String [] split = str.split(" ");
//        for(int r = split.length-1;r>=0;r--) {
//            System.out.println(split[r]+ " ");
        }
}
