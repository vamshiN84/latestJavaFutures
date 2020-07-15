package com.java.latest;

interface interef1{
	default void m1() {
		System.out.println("this is interef1 call ");
	}
}
interface interef2{
	default void m1() {
		System.out.println("this is interef2 call ");
	}
}
public class MultipleInheitenceInterface implements interef1,interef2{
	public void m1() {
		System.out.println("this is my calss methiod");
		interef1.super.m1();
		interef2.super.m1();

	}
	public static void main(String[] args) {
		MultipleInheitenceInterface multipleInheitenceInterface = new MultipleInheitenceInterface();
		multipleInheitenceInterface.m1();
	}

}
