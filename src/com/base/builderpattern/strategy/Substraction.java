package com.base.builderpattern.strategy;

public class Substraction implements Strategy {

	@Override
	public void execute(int num1, int num2) {
		int diff = num1 - num2;
		System.out.println(diff);
		
	}
	
}
