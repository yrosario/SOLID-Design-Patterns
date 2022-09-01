package com.base.builderpattern.exercise;

public class Student {

	private String name;
	private String university;
	private int age;

	public Student(Builder builder) {
		this.name = builder.name;
		this.university = builder.univeristy;
		this.age = builder.age;
	}
	
	@Override
	public String toString() {
		return "Student [name=" + name + ", university=" + university + ", age=" + age + "]";
	}

	public static class Builder {

		private final String name;
		private final String univeristy;
		private int age;

		public Builder(String name, String university) {
			this.name = name;
			this.univeristy = university;
		}

		public Builder setAge(int age) {
			this.age = age;
			return this;
		}

		public Student build() {
			return new Student(this);
		}
	}

}
