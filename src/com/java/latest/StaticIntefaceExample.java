package com.java.latest;

interface interef5{
	public static void m1() {
		System.out.println("this is interef1 call ");
	}
}

public class StaticIntefaceExample implements interef5{
	public static void main(String[] args) {
		StaticIntefaceExample multipleInheritenceClassExample = new StaticIntefaceExample();
		interef5.m1();
	}
	

}
