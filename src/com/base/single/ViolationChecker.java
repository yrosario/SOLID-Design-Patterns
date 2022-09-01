package com.base.single;

public class ViolationChecker {
	
	//
	public static boolean isValid(Pair pair) {
		
		String first = pair.getFirst();
		String second = pair.getSecond();
		
		try {
			Integer.parseInt(first);
		}catch(NumberFormatException nfe) {
			return false;
		}
		
		try {
			Integer.parseInt(second);
		}catch(NumberFormatException nfe) {
			return false;
		}
		
		return true;
	}

}
