package com.rajeshchinta.JavaObserverPattern;

import org.junit.Test;

import com.rajeshchinta.observer.CurrentConditionsDisplay;
import com.rajeshchinta.observer.WeatherStatisticsDisplay;
import com.rajeshchinta.subject.WeatherData;

/**
 * Unit test for simple App.
 */
public class AppTest {

	@Test
	public void currentConditionsDisplayShowsCurrentConditions() {
		WeatherData weatherData = new WeatherData();
		CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay();
		weatherData.addObserver(currentConditionsDisplay);
		weatherData.setMeasurements(30, 40, 50);
		weatherData.deleteObserver(currentConditionsDisplay);
		weatherData.setMeasurements(10, 20, 30);
	}
	
	@Test
	public void weatherStatisticsDisplayShowsStats() {
		WeatherData weatherData = new WeatherData();
		WeatherStatisticsDisplay weatherStatisticsDisplay = new WeatherStatisticsDisplay();
		weatherData.addObserver(weatherStatisticsDisplay);
		weatherData.setMeasurements(30, 40, 50);
		weatherData.setMeasurements(10, 20, 30);
		weatherData.setMeasurements(20, 20, 30);
		weatherData.setMeasurements(40, 20, 30);
		weatherData.setMeasurements(-5, 20, 30);
	}

}
