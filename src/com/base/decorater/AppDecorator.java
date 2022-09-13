package com.base.decorater;

public class AppDecorator {

	public static void main(String[] args) {
		
		Beverage beverage = new Sugar(new Milk(new PlainBeverage()));
		
		System.out.println(beverage.getDescription());
		System.out.println(beverage.getCost());
		

	}

}
