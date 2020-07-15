package com.java.latest;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class MethodReferenceExample {
	public static void m1() {
		for (int i = 0; i < 10; i++) {
			System.out.println("thi is child");
		}
	}
	public MethodReferenceExample() {
		System.out.println("calling this method");
	}
	public static void main(String[] args) {
		Runnable t = MethodReferenceExample::m1;
		Thread th = new Thread(t);
		th.start();
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(10);
		al.add(15);
		al.add(20);
		al.add(30);
		al.add(40);
		al.add(55);
		List<Integer> l = al.stream().filter(i->i%2==0).collect(Collectors.toList());
		List<Integer> l1 = al.stream().map(i->i*2).collect(Collectors.toList());
		System.out.println(l1);
		
	}

}
