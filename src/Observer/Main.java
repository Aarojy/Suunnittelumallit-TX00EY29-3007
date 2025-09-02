package Observer;

public class Main {
    public static void main(String[] args) {
        WeatherStation weatherStation = new WeatherStation();

        Thread weatherThread = new Thread(weatherStation);
        weatherThread.start();

        WeatherBroadcaster broadcaster1 = new WeatherBroadcaster("Temperature is now: ");
        WeatherBroadcaster broadcaster2 = new WeatherBroadcaster("Lämpötila on nyt: ");

        weatherStation.addObserver(broadcaster1);
        weatherStation.addObserver(broadcaster2);

        try {
            Thread.sleep(20000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println("\nRemoving broadcaster 2");
        weatherStation.removeObserver(broadcaster2);
        System.out.println();

    }
}
