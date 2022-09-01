package com.base.builderpattern;

public class App {

	public static void main(String[] args) {
		

		Person person = new Person.Builder("John Smith","jsmith@gmail.com").setAge(32)
				.setAddress("23 Apple Street").build();;

		System.out.println(person.toString());
	}

}
