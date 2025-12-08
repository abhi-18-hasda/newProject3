package learning.practices.src.LLD.behavioral.observer.WeatherStation;

import learning.practices.src.LLD.behavioral.observer.WeatherStation.observable.WeatherObservable;
import learning.practices.src.LLD.behavioral.observer.WeatherStation.observable.WeatherStation;
import learning.practices.src.LLD.behavioral.observer.WeatherStation.observer.CurrentConditionDisplay;
import learning.practices.src.LLD.behavioral.observer.WeatherStation.observer.ForcastDisplay;

public class WeatherStationApp {
    public static void main(String[] args) {
         System.out.println("###### State Design Pattern ######");
        // Create the weather station (observable/subject)
        WeatherObservable weatherStation = new WeatherStation();

        // Create displays (observers)
        CurrentConditionDisplay currentDisplay = new CurrentConditionDisplay(weatherStation);
        ForcastDisplay forecastDisplay = new ForcastDisplay(weatherStation);

        System.out.println("===>>> Initial Weather Update");
        weatherStation.setWeatherReading(80, 65, 30.4f);

        System.out.println("===>>> Second Weather Update");
        weatherStation.setWeatherReading(82, 70, 29.2f);

        // Remove forecast display
        weatherStation.removeObserver(forecastDisplay);

        System.out.println("===>>> Third Weather Update");
        weatherStation.setWeatherReading(70, 21, 29.2f);

    }
}
