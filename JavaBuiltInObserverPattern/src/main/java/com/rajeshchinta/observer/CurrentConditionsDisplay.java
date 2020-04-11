package com.rajeshchinta.observer;

import java.util.Observable;
import java.util.Observer;

import com.rajeshchinta.JavaObserverPattern.Constants;
import com.rajeshchinta.subject.WeatherDataVO;

public class CurrentConditionsDisplay implements Observer {
	Observable observable;
	WeatherDataVO weatherDataVO;

	@Override
	public void update(Observable o, Object arg) {
		weatherDataVO = (WeatherDataVO) arg;
		this.observable = o;
		this.display();
	}
	
	public void display() {
		String currentConditions = String.format(Constants.CURRENT_CONDITIONS_FORMAT, 
				weatherDataVO.getTemperature(), weatherDataVO.getHumidity(), weatherDataVO.getPressure());
		System.out.println(currentConditions);
	}
	
}
