package com.base.factory2;

public class PetroFactory implements AbstractFactory {

	@Override
	public Car getCar(String type) {
		if(type.equals("TOYOTA")) {
			return new PetroToyota();
		}else if(type.equals("FORD")) {
			return new PetroFord();
		}
		
		return null;
	}

}
