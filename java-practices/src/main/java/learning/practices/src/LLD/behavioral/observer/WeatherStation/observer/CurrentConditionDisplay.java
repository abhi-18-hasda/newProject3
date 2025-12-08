package learning.practices.src.LLD.behavioral.observer.WeatherStation.observer;

import learning.practices.src.LLD.behavioral.observer.WeatherStation.observable.WeatherObservable;

public class CurrentConditionDisplay implements WeatherObserver{

    private final WeatherObservable weatherStation;

    public CurrentConditionDisplay(WeatherObservable observable){
        this.weatherStation = observable;
    }
	@Override
	public void update() {
		System.out.println("Saving weather data... ");
        display();
    }

    public void display() {
        System.out.println("Current Weather Conditions: " + weatherStation.toString());
    }

    
}
