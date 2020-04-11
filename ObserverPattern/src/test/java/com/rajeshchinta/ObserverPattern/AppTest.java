package com.rajeshchinta.ObserverPattern;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import com.rajeshchinta.observer.CurrentConditionsDisplay;
import com.rajeshchinta.observer.ForecastDisplay;
import com.rajeshchinta.observer.WeatherStatisticsDisplay;
import com.rajeshchinta.subject.WeatherData;



/**
 * Unit test for simple App.
 */
public class AppTest 
{
	
	public static final String FORECAST_LIKELYRAIN_MESSAGE = "Chances of rain!!";
	public static final String FORECAST_NORAIN_MESSAGE = "No chances of rain!!";
	@Test
    public void wetherDataNotifiesAllDisplayObserversUpOnAnUpdate()
    {
		WeatherData weatherData = new WeatherData();
		CurrentConditionsDisplay ccd = new CurrentConditionsDisplay(weatherData);
		WeatherStatisticsDisplay wsd = new WeatherStatisticsDisplay(weatherData);
		ForecastDisplay fd = new ForecastDisplay(weatherData);
		
		weatherData.setMeasurements(32, 134, 180);
		System.out.println("----------------");
		System.out.println("----------------");
		ccd.deRegister();
		wsd.deRegister();
		weatherData.setMeasurements(23, 123, 170);
    }
	
	@Test
    public void wetherStatisticsDisplayObserverDisplaysMinMaxAvgTemperatures()
    {
		WeatherData weatherData = new WeatherData();
		WeatherStatisticsDisplay weatherStatisticsDisplay = new WeatherStatisticsDisplay(weatherData);
		weatherStatisticsDisplay.setMinTemp(10);
		weatherStatisticsDisplay.setMaxTemp(35);
		
		weatherData.setMeasurements(5, 134, 180);
		assertTrue("Minimum temperature is not equal to 5", weatherStatisticsDisplay.getMinTemp() == 5);
		System.out.println("----------------");
		System.out.println("----------------");
		weatherData.setMeasurements(40, 123, 170);
		assertTrue("Maximu temperature is not equal to 40", weatherStatisticsDisplay.getMaxTemp() == 40);
		System.out.println("----------------");
		System.out.println("----------------");
		weatherData.setMeasurements(40, 123, 170);
		assertTrue("Maximu temperature is not equal to 40", weatherStatisticsDisplay.getMaxTemp() == 40);
    }
	
	@Test
    public void foreCastDisplayObserverDisplaysProperForecastMessage()
    {
		WeatherData weatherData = new WeatherData();
		ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);
		
		weatherData.setMeasurements(5, 134, 180);
		assertTrue("Incorret Forecast message", 
				forecastDisplay.getForecastMessage().equalsIgnoreCase(FORECAST_NORAIN_MESSAGE));
		System.out.println("----------------");
		System.out.println("----------------");
		weatherData.setMeasurements(40, 123, -5);
		assertTrue("Incorret Forecast message", 
				forecastDisplay.getForecastMessage().equalsIgnoreCase(FORECAST_LIKELYRAIN_MESSAGE));
		System.out.println("----------------");
		System.out.println("----------------");
    }
    	
}
