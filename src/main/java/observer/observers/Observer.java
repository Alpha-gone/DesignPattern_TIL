package observer.observers;

public interface Observer {
    void update(float temperature, float humidity, float pressure);
    void update();
}
