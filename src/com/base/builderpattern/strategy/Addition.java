package com.base.builderpattern.strategy;

public class Addition implements Strategy {

	@Override
	public void execute(int num1, int num2) {
		int sum = num1 + num2;
		System.out.println(sum);
		
	}

}
