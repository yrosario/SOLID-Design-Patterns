package com.base.builderpattern.strategy;

public class AppStrategy {
	
	public static void main(String[] args) {
		
		
		OperationManager opManager = new OperationManager();
		opManager.setStategy(new Substraction());
		opManager.execute(50, 20);
	}

}
