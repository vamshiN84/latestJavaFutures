package com.java.latest;

import java.util.ArrayList;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;


public class FunctionlInterfaceExamples {
	public static void main(String[] args) {
		//Function is SAM which is apply purpose is to read input parameter perform actions and return results
		//single statement Functions 
		Function< String, Integer> function = s->s.length();
		System.out.println(function.apply("Vamshi Krishna Neela"));
		Function< String, String> f1 = s->s.toUpperCase();
		System.out.println(function.apply("Vamshi Krishna Neela"));
		System.out.println(f1.apply("Vamshi Krishna Neela"));
		Function<Integer, Integer> f6= j->j*j;
		Function<Integer, Integer> f7= j->j+j;
		System.out.println("compose"+f6.compose(f7).apply(5));
		System.out.println("andthen"+f6.andThen(f7).apply(5));
		//Function<String, String> f2 = s->s.re
		String s1 ="vamshi";
		StringBuffer sb = new StringBuffer();
		sb.append(s1);
		System.out.println(sb);
		System.out.println(sb.reverse());
		Function< Employee, String> f = e->{
			double sal =e.getSalary();
			String position = "";
			if (e.getSalary() < 200000) {
				position = "Junior Developer";
			} else if (e.getSalary() < 300000) {
				position = "middle Developer";
			} else if (e.getSalary() < 300000) {
				position = "Sr Developer";
			} else {
				position = "Application Designer";
			}
					return position;
		};
		Predicate<Employee> p = e1->e1.getSalary()>300000;
		
		Employee[] e = { new Employee(1,"Vamshi",100000),
		                 new Employee(2, "Viplav", 200000),
		                 new Employee(3, "jagan", 300000),
		                 new Employee(4, "Sastry", 400000)
		
		};
		Consumer<Employee> emp=e1-> {
			if(p.test(e1)) {
			System.out.println("eName"+ e1.geteName());
			System.out.println("eSalary"+ e1.getSalary());
			System.out.println("employee Position "+f.apply(e1));
			}
		};
		for (Employee e1 :e) {
			if(p.test(e1)) {
			emp.accept(e1);
			}
		}
		BiFunction<Integer, String, Employee> em = (eno,eName)->new Employee(eno,eName);
		ArrayList<Employee> employees = new ArrayList<Employee>();
		employees.add(em.apply(1, "Neela"));
		employees.add(em.apply(2, "Neela"));
		employees.add(em.apply(3, "Neela"));
		for (Employee e2:employees) {
			System.out.println("employee "+e2.getEno());
			System.out.println("employee "+e2.geteName());
		}
	
	}

}
