package com.rajeshchinta.observer;

import com.rajeshchinta.ObserverPattern.Constants;
import com.rajeshchinta.subject.Subject;

public class WeatherStatisticsDisplay implements WeatherDisplayObserver, DisplayElement{
	private Subject weatherData;
	public WeatherStatisticsDisplay(Subject weatherData) {
		this.weatherData = weatherData;
		this.weatherData.registerObserver(this);
	}
	
	float temperature;
	float humidity;
	float pressure;
	float minTemp = 0, maxTemp = 0, avgTemp = 0, sumTemp = 0;
	public float getAvgTemp() {
		return avgTemp;
	}

	public float getMaxTemp() {
		return maxTemp;
	}

	public void setMaxTemp(float maxTemp) {
		this.maxTemp = maxTemp;
	}

	public float getMinTemp() {
		return minTemp;
	}

	public void setMinTemp(float minTemp) {
		this.minTemp = minTemp;
	}

	int numOfUpdates = 0;

	@Override
	public String updateWeatherInfo(float temperature, float humidity, float pressure) {
		this.numOfUpdates++;
		this.temperature = temperature;
		this.humidity = humidity;
		this.pressure = pressure;
		this.sumTemp = this.sumTemp + temperature;
		if(temperature > this.maxTemp) {
			this.maxTemp = temperature;
			
		}
		
		if(temperature < this.minTemp) {
			this.minTemp = temperature;
		}
		
		this.avgTemp = this.sumTemp/ this.numOfUpdates;
		
		this.Display();
		return Constants.WEATHER_STATS_UPDATED;
	}
	
	@Override
	public void Display() {
		String weatherStats = String.format(Constants.WEATHER_STATS_FORMAT, this.maxTemp, this.minTemp, this.avgTemp);
		System.out.println(weatherStats);
	}
	
	public void deRegister() {
		weatherData.removeObserver(this);
	}

}
