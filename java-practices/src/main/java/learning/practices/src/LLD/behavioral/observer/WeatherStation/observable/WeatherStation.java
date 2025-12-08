package learning.practices.src.LLD.behavioral.observer.WeatherStation.observable;

import java.util.ArrayList;
import java.util.List;

import learning.practices.src.LLD.behavioral.observer.WeatherStation.observer.WeatherObserver;

public class WeatherStation implements WeatherObservable{

    private final List<WeatherObserver> observers;
    private float temperature;
    private float humidity;
    private float pressure;

    public WeatherStation(){
        observers = new ArrayList<>();
    }
	@Override
	public void addObserver(WeatherObserver observer) {
		observers.add(observer);
        System.out.println("[+] Observer registered: " + observer.getClass().getSimpleName());
	}

	@Override
	public void removeObserver(WeatherObserver observer) {
		observers.remove(observer);
        System.out.println("[-] Observer removed: " + observer.getClass().getSimpleName());
	}

	@Override
	public void notifyObserver() {
		for(WeatherObserver weatherObserver: observers){
            weatherObserver.update();
        }
	}

    // Getters for observers to access weather data
    public float getTemperature() {
        return temperature;
    }

    public float getHumidity() {
        return humidity;
    }

    public float getPressure() {
        return pressure;
    }

    @Override
    public String toString() {
        return "WeatherStation{" +
                "temperature=" + temperature +
                ", humidity=" + humidity +
                ", pressure=" + pressure +
                '}';
    }
	@Override
	public void setWeatherReading(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        notifyObserver();
    }
}
