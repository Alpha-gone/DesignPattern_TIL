package observer.displays;

import observer.observers.Observer;
import observer.subjects.WeatherData;

public class ForecastDisplay implements Observer, DisplayElement {
    private float currentPressure;
    private float lastPressure;
    private WeatherData weatherData;

    public ForecastDisplay(WeatherData weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);

        currentPressure = 29.2f;
    }

    @Override
    public void update(float temperature, float humidity, float pressure) {
        lastPressure = currentPressure;
        currentPressure = pressure;

        display();
    }

    @Override
    public void update() {
        lastPressure = currentPressure;
        currentPressure = weatherData.getPressure();

        display();
    }

    @Override
    public void display() {
        System.out.print("기상 예보:");

        switch (Float.compare(currentPressure, lastPressure)){
            case 1:
                System.out.println("날씨가 좋아지고 있습니다!");
                break;

            case 0:
                System.out.println("지금과 비슷할 것 같습니다.");
                break;

            case -1:
                System.out.println("쌀살하며 비가 올 것 같습니다.");
        }
    }
}
