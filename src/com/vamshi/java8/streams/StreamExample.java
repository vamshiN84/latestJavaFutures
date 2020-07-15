package com.vamshi.java8.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import com.vamshi.java8.streams.pojo.Employee;

public class StreamExample {
	public static void main(String[] args) {
		List<Employee> employees = Arrays.asList(new Employee("vamshi",1),
				new Employee("neela",2),
				new Employee("krishna",3));
		List<Employee> emp = employees.stream().limit(2).collect(Collectors.toList());
		System.out.println(emp);
	}

}
