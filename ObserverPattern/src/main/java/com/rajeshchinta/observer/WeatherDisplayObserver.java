package com.rajeshchinta.observer;

public interface WeatherDisplayObserver {
	public String updateWeatherInfo(float temperature, float humidity, float pressure);
	public void deRegister();
}
