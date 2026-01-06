package com.java.InterviewPrep.InterviewQnAs;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class NthHighestSalaryDemo {

    public static Map.Entry<String, Integer> getNthHighestSalary(int num, Map<String, Integer> map) {

        return map.entrySet().stream().sorted(Collections.reverseOrder(Map.Entry.comparingByValue()))
                .collect(Collectors.toList()).get(num - 1);
    }

    public static Map.Entry<Integer, List<String>> getDynamicNthHighestSalary(int num, Map<String, Integer> map) {
        return map.entrySet().stream()
                .collect(Collectors.groupingBy(Map.Entry::getValue,
                        Collectors.mapping(Map.Entry::getKey, Collectors.toList())))
                .entrySet().stream().sorted(Collections.reverseOrder(Map.Entry.comparingByKey()))
                .collect(Collectors.toList()).get(num - 1);

    }

    public static void main(String[] args) {

        Map<String, Integer> map1 = new HashMap<>();
        map1.put("Shan", 1000);
        map1.put("Venu", 1200);
        map1.put("Venakt", 1500);
        map1.put("Vachuuuu", 2000);
        map1.put("Jagha", 1800);
        map1.put("Kishore", 1700);

        Map.Entry<String, Integer> result = map1.entrySet().stream().sorted(Map.Entry.comparingByValue())
                .collect(Collectors.toList()).get(1);

        Map.Entry<String, Integer> resultReverse = map1.entrySet().stream()
                .sorted(Collections.reverseOrder(Map.Entry.comparingByValue())).collect(Collectors.toList()).get(1);

        System.out.println("Result :" + result);

        System.out.println("resultReverse :" + resultReverse);

        Map.Entry<String, Integer> results = getNthHighestSalary(3, map1);
        System.out.println(results);

        Map<String, Integer> map2 = new HashMap<>();
        map2.put("Shan", 1200);
        map2.put("Venu", 1200);
        map2.put("Venakt", 1700);
        map2.put("Vachuuuu", 2000);
        map2.put("Jagha", 2000);
        map2.put("Kishore", 1700);

        Map.Entry<Integer, List<String>> salaryResult = map2.entrySet().stream()
                .collect(Collectors.groupingBy(Map.Entry::getValue,
                        Collectors.mapping(Map.Entry::getKey, Collectors.toList())))
                .entrySet().stream().sorted(Collections.reverseOrder(Map.Entry.comparingByKey()))
                .collect(Collectors.toList()).get(1);

        System.out.println(salaryResult);

        System.out.println(getDynamicNthHighestSalary(3, map2));

    }

}
