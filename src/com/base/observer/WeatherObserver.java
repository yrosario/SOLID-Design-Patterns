package com.base.observer;

public class WeatherObserver implements Observer {

	private int pressure;
	private int temperatrue;
	private int humidity;
	private Subject subject;

	public WeatherObserver(Subject subject) {
		this.subject = subject;
		this.subject.subscribe(this);
	}

	@Override
	public void update(int pressure, int temperatrue, int humidity) {
		this.pressure = pressure;
		this.temperatrue = temperatrue;
		this.humidity = humidity;

		showDate();
	}

	private void showDate() {
		System.out
				.println("Pressure: " + this.pressure + " Temperature: " + this.temperatrue + " Humidity: " + humidity);

	}

}
