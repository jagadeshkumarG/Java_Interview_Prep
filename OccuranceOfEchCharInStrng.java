package com.java.InterviewPrep.InterviewQnAs;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class OccuranceOfEchCharInStrng {

	public static void main(String[] args) {

		String input = "ilovejavatechie";
		
		String str = "Hello World";
		
		String[] split = str.split(" ");

		String[] results = input.split("");
		// System.out.println(Arrays.toString(results));

		Map<String, Long> collect = Arrays.stream(results)
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		System.out.println("collect :" + collect);

		Map<String, Long> charCount = Arrays.stream(split)
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		
		charCount.forEach((key, value) -> System.out.println(key + " : " + value));

		Map<Character, Long> collect1 = input.chars().mapToObj(c -> (char) c)
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		System.out.println(collect1);

		Map<Character, Long> charCountMap = input.chars().mapToObj(c -> (char) c).reduce(new HashMap<>(), (map, c) -> {
			map.put(c, map.getOrDefault(c, 0L) + 1);
			return map;
		}, (map1, map2) -> {
			map1.putAll(map2);
			return map1;
		});

		// Print the result
		charCountMap.forEach((character, count) -> System.out.println(character + ": " + count));

		String s = "Jagadeesh";
		s.concat("Kumar");
		System.out.println(s);

	}

}
