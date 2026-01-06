package com.java.InterviewPrep.InterviewQnAs;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

class Emploeee {
	private int Id;
	private String name;
	private Double Salary;

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getSalary() {
		return Salary;
	}

	public void setSalary(Double salary) {
		Salary = salary;
	}

	@Override
	public int hashCode() {
		return Objects.hash(Id, Salary, name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Emploeee other = (Emploeee) obj;
		return Id == other.Id && Objects.equals(Salary, other.Salary) && Objects.equals(name, other.name);
	}

	public Emploeee(int id, String name, Double salary) {
		super();
		this.Id = id;
		this.name = name;
		this.Salary = salary;
	}
}

public class EmployseeSorting {

	public static void main(String[] args) {

		List<Emploeee> emplList = Arrays.asList(new Emploeee(1, "Family", 5000.00), new Emploeee(2, "Vachu", 10000.00),
				new Emploeee(3, "Pranu", 15000.00), new Emploeee(4, "Jagha", 25000.00),
				new Emploeee(5, "Kyathi", 22000.00), new Emploeee(6, "Amma", 25000.00));

		emplList.stream().sorted((e1, e2) -> e1.getName().compareToIgnoreCase(e2.getName()))
				.forEach((s) -> System.out.println(s.getName())); // sorted by Name
		emplList.stream().sorted(Comparator.comparing(Emploeee::getId))
				.forEach(e -> System.out.println(e.getId() + " " + e.getName())); // sorted by Id
		emplList.stream().sorted(Comparator.comparingDouble(emp -> emp.getSalary()))
				.forEach(e -> System.out.println(e.getSalary() + " " + e.getName())); // sorted by Salary
		List<Double> doubleSalaryList = emplList.stream().map(emp -> emp.getSalary() * 2).collect(Collectors.toList());

		emplList.stream().sorted((e1, e2) -> e1.getName().compareToIgnoreCase(e2.getName()))
				.sorted(Comparator.comparing(Emploeee::getSalary))
//				.forEach(System.out::println);
				.forEach(e -> System.out.println(e.getName() + " " + e.getSalary()));
//        	.collect(Collectors.toList());
//        System.out.println("collectByNameAndSalary :" + collectByNameAndSalary);

//		System.out.println("DoubleSalaryList :" + doubleSalaryList);

//		emplList.stream().sorted(Comparator.comparing(emp -> emp))
//		.collect(Collectors.toList());
//				//.forEach(e -> System.out.println(e.getSalary() + " " + e.getName()));
//		
//		System.out.println(listEmp);
	}
}
