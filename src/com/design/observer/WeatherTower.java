package com.design.observer;

public class WeatherTower {
	
	public static void main(String[] args) {
		
		WeatherData weatherData = new WeatherData();
		Display display = new SmartPhoneDisplay(weatherData);
		weatherData.setMeasurements(10, 20, 30);
	}

}
