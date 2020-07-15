package com.java.latest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class ExampleBasicsJavaFutures {
	public static void main(String[] args) {
		Function<Integer, Integer> f = i->i*i;
		Function<Integer, Integer> f1 = i->i+i;
		//predicate is an Interface it is having only 1 single abstract method test and other methods and,negate,or,isEquals,not
		Predicate<Integer> f2 = i->i%2==0;
		System.out.println(f2.test(4));
		ArrayList<Employee> employees = new ArrayList<Employee>();
		employees.add(new Employee(1, "Neela",100000d));
		employees.add(new Employee(2, "Krishna",120000d));
		employees.add(new Employee(3, "Vamshi",140000d));
		Collections.sort(employees, (e1, e2) -> e1.geteName().compareTo(e2.geteName()));
		System.out.println(employees);
		Collections.sort(employees, (p1, p2) -> p1.getEno()<p2.getEno()?-1:p1.getEno()<p1.getEno()?1:0);
		System.out.println(employees);
		//Predicate<Employee> p = e->e.getSalary()>10000 & e.geteName().equals("vamshi");
		//System.out.println(p.test(e));
		String[] s = {"vamshii","neela","srinivas","srinivas"};
		Predicate<String> p1=str->str.length()%2==0;
		for(String s1 :s) {
			if(p1.test(s1)) {
				System.out.println(s1);
			}
		}
		Predicate<Employee> p3 = e->e.getSalary()>50000;
		for(Employee e1:employees) {
			if(p3.test(e1)) {
				
				System.out.println("these are employees are having "+e1.geteName()+" salary "+e1.getSalary());
			}
			int[] x = {10,20,35,56,90,89};
			Predicate<Integer> p4 = i->i%2==0;
			Predicate<Integer> p5 =i->i>40;
			for (int i :x) {
				if(p4.negate().test(i)) {
					System.out.println(i);
				}
			}
			
		}
		 List<String> mylist = Arrays.asList("Hello","World");
	        mylist.stream().forEach(System.out::println);
	 }
}
