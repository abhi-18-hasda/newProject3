package learning.practices.src.LLD.behavioral.observer.WeatherStation.observable;

import learning.practices.src.LLD.behavioral.observer.WeatherStation.observer.WeatherObserver;

public interface WeatherObservable {
    void addObserver(WeatherObserver observer);
    void removeObserver(WeatherObserver observer);
    void notifyObserver();
    void setWeatherReading(float temperature, float humidity, float pressure);
}
