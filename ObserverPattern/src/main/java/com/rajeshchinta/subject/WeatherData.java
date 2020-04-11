package com.rajeshchinta.subject;


import java.util.ArrayList;

import com.rajeshchinta.observer.WeatherDisplayObserver;

public class WeatherData implements Subject{
	ArrayList<WeatherDisplayObserver> displayList = new ArrayList<WeatherDisplayObserver>();
	float temperature;
	float humidity;
	float pressure;
	
	@Override
	public void registerObserver(WeatherDisplayObserver wd) {
		displayList.add(wd);
	}

	@Override
	public void removeObserver(WeatherDisplayObserver wd) {
		int index = displayList.indexOf(wd);
		displayList.remove(index);
	}

	@Override
	public void notifyObservers() {
		 measurementsChanged();
	}
	
	public void measurementsChanged() {
		//System.out.println("WeatherData: Sending notification to observers");
		
		for (WeatherDisplayObserver wd : displayList) {
			wd.updateWeatherInfo(this.temperature, this.humidity, this.pressure);
		}
		//System.out.println("WeatherData: Finished sending notification to observers");
	}
	
	public void setMeasurements(float temperature, float humidity, float pressure) {
		this.temperature = temperature;
		this.humidity = humidity;
		this.pressure = pressure;
		this.measurementsChanged();
	}
}
