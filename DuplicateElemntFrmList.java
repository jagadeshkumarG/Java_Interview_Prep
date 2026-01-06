package com.java.InterviewPrep.InterviewQnAs;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

public class DuplicateElemntFrmList {

	public static void main(String[] args) {

		List<Integer> list = Arrays.asList(10, 60, 20, 50, 30, 40, 60, 10);
//
		Set<Integer> integerSet = list.stream().filter(i -> Collections.frequency(list, i) > 1)
				.collect(Collectors.toSet());

		System.out.println(integerSet);

		List<Integer> distinctList = list.stream().distinct().collect(Collectors.toList());

		distinctList.forEach(System.out::println);

		Map<Integer, Long> listCount = list.stream()
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

		System.out.println("listCount : " + listCount);

		List<Integer> duplicateList = listCount.entrySet().stream().filter(e -> e.getValue() > 1).map(n -> n.getKey())
				.collect(Collectors.toList());
//				.forEach((e) -> System.out.println(e.getKey() + " -> " + e.getValue()));
		System.out.println("duplicateList : " + duplicateList);
		duplicateList.forEach(System.out::println);

//		duplicateList.forEach(System.out::println);

		listCount.entrySet().stream().filter(e -> e.getValue() > 1)
//				.map(n -> n.getKey())
//				.collect(Collectors.toList());
				.forEach((e) -> System.out.println(e.getKey() + " -> " + e.getValue()));

	}

}
