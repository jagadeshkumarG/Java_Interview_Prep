package com.java.InterviewPrep.InterviewQnAs;



import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class Employees {
    private String name;
    private String Department;
    private int exprrience;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return Department;
    }

    public void setDepartment(String department) {
        Department = department;
    }

    public int getExprrience() {
        return exprrience;
    }

    public void setExprrience(int exprrience) {
        this.exprrience = exprrience;
    }

    public Employees(String name, String department, int exprrience) {
        super();
        this.name = name;
        Department = department;
        this.exprrience = exprrience;
    }
}

public class EmployeesCountWithExp {

    public static void main(String[] args) {

        List<Employees> employeeList = Arrays.asList(new Employees("Vachu", "Dev", 21),
                new Employees("Jagha", "Dev", 23), new Employees("Kyathi", "Finance", 10),
                new Employees("Pranu", "IT", 8), new Employees("Mukharjee", "HR", 25));

        Map<String, Long> map = employeeList.stream().filter(emp -> emp.getExprrience() > 20)
                .collect(Collectors.groupingBy(Employees::getDepartment, Collectors.counting()));

        map.forEach((department, count) -> {
            System.out.println("department: "+department+" count: " +count);
        });

    }

}

