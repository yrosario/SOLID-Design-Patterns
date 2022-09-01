package com.base.factory;

public class App {

	public static void main(String[] args) {
		Animal animal = AnimalFactory.getAnimal(AnimalType.DOG);
		animal.eat();
		
		animal = AnimalFactory.getAnimal(AnimalType.TIGER);
		animal.eat();

	}

}
