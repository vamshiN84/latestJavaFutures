package com.java.latest;

public class DefaultImplementationMethod implements Interef {
	@Override
	public void add(int a, int b) {
		
	}
	public int sub(int a,int b) {
		System.out.println(a+b);
		return a-b;
	}
	
	public static void main(String[] args) {
		Interef interef=(a,b)->System.out.println("hello"+(a+b));
		interef.add(10, 20);
		Interef interef1=(a,b)->System.out.println("hello"+(a-b));
		interef1.add(10, 20);
		DefaultImplementationMethod dMethod = new DefaultImplementationMethod();
		dMethod.sub(20, 30);
	}

}
