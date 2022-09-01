package com.base.factory2;

public class FactoryProducer {

	public static AbstractFactory getFactory(String factory) {
		
		if(factory.equals("PETRO")) {
			return new PetroFactory();
		}else if(factory.equals("ELECTRIC")) {
			return new ElectricCarFactory();
		}
		
		return null;
	}
}
