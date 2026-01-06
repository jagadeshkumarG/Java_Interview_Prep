package com.java.InterviewPrep.InterviewQnAs;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FirstRepeatingCharacter {

	public static void main(String[] args) {

		String inputChar = "bumbchik";

		Optional<Character> firstRepeatingChar = inputChar.chars().mapToObj(c -> (char) c)
				.collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
				.entrySet().stream().filter(entry -> entry.getValue() > 1).map(Map.Entry::getKey).findFirst();

		System.out.println("FirstRepeatingChar " + firstRepeatingChar);

		firstRepeatingChar.ifPresent(c -> System.out.println("First repeating character: " + c));

		String str = "this is test. this test is just a test. this is a test";
		
		////////////////////////////////////|||||||||\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\

		String[] s = str.split(" ");

		Map<String, Long> repChar = Arrays.stream(s)
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

		repChar.entrySet().stream().filter(e -> e.getValue() > 2)
				.forEach(e -> System.out.println(e.getKey() + " -> " + e.getValue()));

	}

}
