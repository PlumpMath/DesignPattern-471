package com.design.observer;

public class SmartPhoneDisplay implements Display, Observer {

	private float temp;
	private float pressure;
	private float humidity;
	private Publisher publisher;

	public SmartPhoneDisplay(Publisher publisher) {
		this.publisher = publisher;
		this.publisher.registerObserver(this);
	}
	@Override
	public void update(float temp, float pressure, float humidity) {
		this.temp = temp;
		this.pressure = pressure;
		this.humidity = humidity;
		display();
	}

	@Override
	public void display() {
		System.out.println("Values are "+ temp + pressure + humidity);
	}

}
