package com.base.builderpattern.strategy.exercise;

public class ImageManager {
	
	private Device device;
	
	public void setDevice(Device device) {
		this.device = device;
	}
	
	public void show() {
		device.showImage();
	}

}
