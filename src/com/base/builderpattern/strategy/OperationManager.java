package com.base.builderpattern.strategy;

public class OperationManager {

	private Strategy strategy;
	
	public void setStategy(Strategy strategy) {
		this.strategy = strategy;
	}
	
	public void execute(int num1, int num2) {
		this.strategy.execute(num1, num2);
	}
}
