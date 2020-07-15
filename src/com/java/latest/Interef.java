package com.java.latest;

import java.math.BigDecimal;

@FunctionalInterface
public interface Interef {
		 void add(int a,int b);//abstract method
        default int sub(int a,int b) {//default method
        	return a-b;
        }
        BigDecimal big = new BigDecimal(100);
	}

