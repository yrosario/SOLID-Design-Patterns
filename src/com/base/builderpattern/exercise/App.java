package com.base.builderpattern.exercise;

public class App {

	public static void main(String[] args) {
		
		Student student = new Student.Builder("John", "Suffolk University").setAge(45).build();
		
		System.out.println(student.toString());

	}

}
