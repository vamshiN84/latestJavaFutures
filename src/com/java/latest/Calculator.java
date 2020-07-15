package com.java.latest;

public class Calculator implements IntegerMath{
	  
    public int operateBinary(int a, int b, IntegerMath op) {
        return op.operation(a, b);
    }
 
    public static void main(String... args) {
    
        Calculator myApp = new Calculator();
        IntegerMath addition = (a, b) -> a + b;
        IntegerMath subtraction = (a, b) -> a - b;
        System.out.println("40 + 2 = " +
            myApp.operateBinary(40, 2, addition));
        System.out.println("20 - 10 = " +
            myApp.operateBinary(20, 10, subtraction));    
        
        IntegerMath addition1 = (a, b) -> a + b;
        addition1.operation(1, 2);
        
    }

	@Override
	public int operation(int a, int b) {
		return a+b;
	}
}