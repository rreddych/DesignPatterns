package com.rajeshchinta.subject;


import java.util.Observable;

public class WeatherData extends Observable{
	float temperature;
	float humidity;
	float pressure;
	
	public void setMeasurements(float temperature, float humidity, float pressure) {
		this.temperature = temperature;
		this.humidity = humidity;
		this.pressure = pressure;
		this.setChanged();
		WeatherDataVO weatherDataVO = new WeatherDataVO();
		weatherDataVO.setTemperature(temperature);
		weatherDataVO.setHumidity(humidity);
		weatherDataVO.setPressure(pressure);
		this.notifyObservers(weatherDataVO);
	}
}
