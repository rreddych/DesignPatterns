package com.rajeshchinta.observer;

import com.rajeshchinta.ObserverPattern.Constants;
import com.rajeshchinta.subject.Subject;

public class ForecastDisplay implements WeatherDisplayObserver, DisplayElement{
	private Subject weatherData;
	public ForecastDisplay(Subject weatherData) {
		this.weatherData = weatherData;
		this.weatherData.registerObserver(this);
	}
	
	float temperature;
	float humidity;
	float oldPressure = 0, newPressure = 0;
	String forecastMessage = "";

	public String getForecastMessage() {
		return forecastMessage;
	}

	@Override
	public String updateWeatherInfo(float temperature, float humidity, float pressure) {
		this.temperature = temperature;
		this.humidity = humidity;
		this.newPressure = pressure;
		if(this.oldPressure < this.newPressure) {
			this.forecastMessage = Constants.FORECAST_NORAIN_MESSAGE;
		}else {
			this.forecastMessage = Constants.FORECAST_LIKELYRAIN_MESSAGE;
		}
		
		this.oldPressure = this.newPressure;
		
		this.Display();
		return Constants.FORECAST_UPDATED;
	}

	@Override
	public void Display() {
		System.out.println(Constants.FORECAST_NORAIN_MESSAGE);
		
	}
	
	public void deRegister() {
		weatherData.removeObserver(this);
	}

}
