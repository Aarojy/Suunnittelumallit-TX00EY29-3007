package Bridge;

public class Demo {
    public static void main(String[] args) {
        testDevice(new SmartTv());
        testDevice(new Radio());
    }

    public static void testDevice(Device device) {
        System.out.println("Tests with smart remote.");

        if (device instanceof SmartTv) {
            ((SmartTv) device).browseInternet("http://example.com");
        }

        SmartRemote smartRemote = new SmartRemote(device);
        smartRemote.power();
        smartRemote.voiceControl("Play music");
        device.printStatus();

    }
}