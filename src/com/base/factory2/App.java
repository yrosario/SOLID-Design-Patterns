package com.base.factory2;

public class App {

	public static void main(String[] args) {
		

		AbstractFactory factory = FactoryProducer.getFactory("PETRO");
		factory.getCar("TOYOTA").assemble();
	
	}

}
