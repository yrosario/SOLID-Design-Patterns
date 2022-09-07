package com.base.builderpattern.strategy.exercise;

public class AppStrategyExercise {
	
	public static void main(String args[]) {
		
		ImageManager imgManager = new ImageManager();
		
		imgManager.setDevice(new TVRenderer());
		imgManager.show();
		
		imgManager.setDevice(new LaptopRenderer());
		imgManager.show();
		
		imgManager.setDevice(new SmartphoneRenderer());
		imgManager.show();
	}

}
