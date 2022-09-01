package com.base.single;

public class SingleResposibility {

	public static void main(String[] args) {
		
		//We can get the values
		Pair pair = InputProcessor.process();
		
		if(!ViolationChecker.isValid(pair)) {
			System.out.println("One of the input is invalid..");
			return;
		}
		
		
		int firstInteger = Integer.valueOf(pair.getFirst());
		int secondInteger = Integer.valueOf(pair.getSecond());
		
		int result = Operation.execute(firstInteger, secondInteger);
		
		System.out.println(result);
		
		

	}

}
