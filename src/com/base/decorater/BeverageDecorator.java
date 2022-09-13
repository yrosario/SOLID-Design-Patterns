package com.base.decorater;

public abstract class BeverageDecorator implements Beverage{
	
	protected Beverage beverage;
	
	public BeverageDecorator(Beverage beverage) {
		this.beverage = beverage;
	}
	
	@Override
	public int getCost() {
		return 0;
	}
	
	@Override
	public String getDescription() {
		return this.beverage.getDescription();
	}
}
