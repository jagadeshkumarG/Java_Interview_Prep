package com.java.InterviewPrep.InterviewQnAs;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Employee {
    private String name;
    private int performanceScore;
    private int yearsOfExperience;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPerformanceScore() {
        return performanceScore;
    }

    public void setPerformanceScore(int performanceScore) {
        this.performanceScore = performanceScore;
    }

    public int getYearsOfExperience() {
        return yearsOfExperience;
    }

    public void setYearsOfExperience(int yearsOfExperience) {
        this.yearsOfExperience = yearsOfExperience;
    }

    public Employee(String name, int performanceScore, int yearsOfExperience) {
        super();
        this.name = name;
        this.performanceScore = performanceScore;
        this.yearsOfExperience = yearsOfExperience;
    }
}

public class EmployeeBonous {

    // printing employees with more than 7 performance rating & more than 3 yrs of experience & joining them with "," separated

    public static void main(String[] args) {

        List<Employee> employeeList = Arrays.asList(new Employee("Jagha", 8, 5), new Employee("Vachu", 9, 4),
                new Employee("Paru", 7, 5), new Employee("Vijaya", 5, 2), new Employee("Pranu", 6, 1));

        String str = employeeList.stream().filter(emp -> emp.getPerformanceScore() > 7)
                .filter(emp -> emp.getYearsOfExperience() > 3).map(Employee::getName).collect(Collectors.joining(","));

        System.out.println(str);

    }

}

