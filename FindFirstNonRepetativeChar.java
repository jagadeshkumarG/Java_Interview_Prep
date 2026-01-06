package com.java.InterviewPrep.InterviewQnAs;

public class FindFirstNonRepetativeChar {

    public static void main(String[] args) {

        String str = "abcdab";

        for (Character ch : str.toCharArray()) {
            if (str.indexOf(ch) == str.lastIndexOf(ch)) {
                System.out.println("First non repeted character:" +ch);
                break;
            }
        }
    }
}
