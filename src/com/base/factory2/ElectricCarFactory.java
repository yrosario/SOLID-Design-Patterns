package com.base.factory2;

public class ElectricCarFactory implements AbstractFactory {

	@Override
	public Car getCar(String type) {
		if(type.equals("TOYOTA")) {
			return new ElectricToyota();
		}else if(type.equals("FORD")) {
			return new ElectricFord();
		}
		
		return null;
		
	}

}
