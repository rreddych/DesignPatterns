package com.rajeshchinta.observer;

import com.rajeshchinta.ObserverPattern.Constants;
import com.rajeshchinta.subject.Subject;

public class CurrentConditionsDisplay implements WeatherDisplayObserver, DisplayElement{
	private Subject weatherData;
	public CurrentConditionsDisplay(Subject weatherData) {
		this.weatherData = weatherData;
		this.weatherData.registerObserver(this);
	}
	
	float temperature;
	float humidity;
	float pressure;

	@Override
	public String updateWeatherInfo(float temperature, float humidity, float pressure) {
		this.temperature = temperature;
		this.humidity = humidity;
		this.pressure = pressure;
		this.Display();
		return Constants.CURRENT_CONDITIONS_UPDATED;
	}

	@Override
	public void Display() {
		String currentConditions = String.format(Constants.CURRENT_CONDITIONS_FORMAT, this.temperature, this.humidity, this.pressure);
		System.out.println(currentConditions);
	}
	
	public void deRegister() {
		weatherData.removeObserver(this);
	}
}
