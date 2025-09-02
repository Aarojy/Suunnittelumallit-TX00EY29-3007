package Observer;

public class WeatherBroadcaster extends Observer {
    String message;

    public WeatherBroadcaster(String message) {
        this.message = message;
    }

    @Override
    public void update() {
        System.out.println(message + observable.toString());
    }
}
