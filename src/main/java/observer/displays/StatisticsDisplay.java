package observer.displays;

import observer.observers.Observer;
import observer.subjects.WeatherData;

import java.util.StringJoiner;

public class StatisticsDisplay implements Observer, DisplayElement {
    private float maxTemp;
    private float minTemp;
    private float tempSum;
    private int updateCount;
    private WeatherData weatherData;

    public StatisticsDisplay(WeatherData weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);

        maxTemp = 0;
        minTemp = 300;
        tempSum = 0;
        updateCount = 0;
    }

    @Override
    public void update(float temperature, float humidity, float pressure) {
        tempSum += temperature;
        updateCount++;

        maxTemp = Math.max(temperature, maxTemp);
        minTemp = Math.min(temperature, minTemp);

        display();

    }

    @Override
    public void update() {
        float temperature = weatherData.getTemperature();

        tempSum += temperature;
        updateCount++;

        maxTemp = Math.max(temperature, maxTemp);
        minTemp = Math.min(temperature, minTemp);

        display();
    }

    @Override
    public void display() {
        StringJoiner joiner = new StringJoiner("/");
        joiner.add(Float.toString(tempSum/updateCount));
        joiner.add(Float.toString(maxTemp));
        joiner.add(Float.toString(minTemp));

        System.out.println("평균/최고/최저 온도 = " + joiner);
    }
}
