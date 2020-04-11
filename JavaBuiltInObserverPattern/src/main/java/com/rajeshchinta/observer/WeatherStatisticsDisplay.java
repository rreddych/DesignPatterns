package com.rajeshchinta.observer;

import java.util.Observable;
import java.util.Observer;

import com.rajeshchinta.JavaObserverPattern.Constants;
import com.rajeshchinta.subject.WeatherDataVO;

public class WeatherStatisticsDisplay implements Observer {
	Observable observable;
	WeatherDataVO weatherDataVO;
	float minTemp = 0, maxTemp = 0, avgTemp = 0, sumTemp = 0;
	int numOfUpdates = 0;

	@Override
	public void update(Observable o, Object arg) {
		weatherDataVO = (WeatherDataVO) arg;
		this.observable = o;
		this.numOfUpdates++;
		float currentTemp = this.weatherDataVO.getTemperature();
		this.sumTemp = this.sumTemp + currentTemp;
		if(currentTemp > this.maxTemp) {
			this.maxTemp = currentTemp;
			
		}
		
		if(currentTemp < this.minTemp) {
			this.minTemp = currentTemp;
		}
		
		this.avgTemp = this.sumTemp/ this.numOfUpdates;
		
		this.display();
		
	}
	
	public void display() {
		String weatherStats = String.format(Constants.WEATHER_STATS_FORMAT, this.maxTemp, this.minTemp, this.avgTemp);
		System.out.println(weatherStats);
	}

}
