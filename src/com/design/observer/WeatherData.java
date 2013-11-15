package com.design.observer;

import java.util.ArrayList;
import java.util.List;

public class WeatherData implements Publisher {

	List<Observer> observers;
	
	private float temperature;
	
	private float pressure;
	
	private float humidity;
	
	public WeatherData() {
		
		observers = new ArrayList<Observer>();
	}

	@Override
	public void registerObserver(Observer ob) {
		observers.add(ob);
	}

	@Override
	public void removeObserver(Observer ob) {
		if(!observers.isEmpty())
			observers.remove(ob);
	}

	@Override
	public void notifyObserver() {
		if (!observers.isEmpty()) {
			for (Observer ob : observers) {
				ob.update(temperature, pressure, humidity);
			}
		}
	}
	
	public void setMeasurements(float temp, float pressure, float humidity) {
		this.temperature = temp;
		this.pressure = pressure;
		this.humidity = humidity;
		notifyObserver();
	}

}
