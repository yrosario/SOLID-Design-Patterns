package com.base.decorater;

public class Milk extends BeverageDecorator{

	private Beverage beverage;
	
	public Milk(Beverage beverage) {
		super(beverage);
		this.beverage = beverage;
	}
	
	@Override
	public int getCost() {
		return this.beverage.getCost() + 1;
	}
	
	@Override
	public String getDescription() {
		return this.beverage.getDescription() + " sugar";
	}
	

}
