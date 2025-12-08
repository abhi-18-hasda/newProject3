package learning.practices.src.LLD.behavioral.observer.WeatherStation.observer;

import learning.practices.src.LLD.behavioral.observer.WeatherStation.observable.WeatherObservable;

public class ForcastDisplay implements WeatherObserver{

    private final WeatherObservable weatherStation;

    public ForcastDisplay(WeatherObservable observable){
        this.weatherStation = observable;
        observable.addObserver(this);
    }

	@Override
	public void update() {
		System.out.println("Updating weather data to do some analytics: " + weatherStation.toString());
        display();
	}

	private void display() {
		System.out.println("Forecast Details: Displaying information about Rain, " +
                "Temperature Trends, Significant Weather Events and other phenomemnon...");
	}
    
}
