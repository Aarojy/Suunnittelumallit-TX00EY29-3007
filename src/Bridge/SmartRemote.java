package Bridge;

public class SmartRemote extends AdvancedRemote {
    public SmartRemote(Device device) {
        super(device);
    }

    public void voiceControl(String command) {
        System.out.println("Voice command received: " + command);
    }
}
