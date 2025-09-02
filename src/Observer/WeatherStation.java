package Observer;

public class WeatherStation extends Observable implements Runnable {
    private final int minTemperature = -10;
    private final int maxTemperature = 30;
    private int temperature;

    public String toString() {
        return ""+temperature;
    }

    @Override
    public void run() {
        temperature = 15 + (int)(Math.random()*10);

        while (true) {
            try {
                Thread.sleep((int)(Math.random()*5)*1000+1000);

                double randNum = Math.random();

                if (randNum < 0.33 && temperature < maxTemperature) {
                    temperature += 1;
                } else if (randNum > 0.66 && temperature > minTemperature) {
                    temperature -= 1;
                }

                notifyObservers();

            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
