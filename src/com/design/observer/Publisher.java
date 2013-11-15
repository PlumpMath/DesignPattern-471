package com.design.observer;

public interface Publisher {
	
	public void registerObserver(Observer ob);
	
	public void removeObserver(Observer ob);
	
	public void notifyObserver();
	
}
