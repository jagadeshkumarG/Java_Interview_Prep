package com.java.InterviewPrep.InterviewQnAs;

import java.util.Random;
import java.util.Scanner;

public class PrintingNRandaomNums {

    public static void main(String[] args) {
        System.out.println("Enter the how many nums u want to Print: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Random rand = new Random();
        rand.ints(10, 99).limit(n).forEach(System.out::println);

    }
}
