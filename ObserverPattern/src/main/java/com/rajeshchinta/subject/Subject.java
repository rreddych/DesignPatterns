package com.rajeshchinta.subject;

import com.rajeshchinta.observer.WeatherDisplayObserver;

public interface Subject {
	public void registerObserver(WeatherDisplayObserver wd);
	public void removeObserver(WeatherDisplayObserver wd);
	public void notifyObservers();
}
