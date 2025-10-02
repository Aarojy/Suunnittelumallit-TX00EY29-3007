package Bridge;

public class SmartTv extends Tv {
    private boolean on = false;
    private int volume = 30;
    private int channel = 1;

    public SmartTv() {
        super();
    }

    @Override
    public void printStatus() {
        System.out.println("------------------------------------");
        System.out.println("| I'm SMART TV set.");
        System.out.println("| I'm " + (on ? "enabled" : "disabled"));
        System.out.println("| Current volume is " + volume + "%");
        System.out.println("| Current channel is " + channel);
        System.out.println("------------------------------------\n");
    }

    public void browseInternet(String url) {
        System.out.println("Browsing: " + url + " on SmartTV");
    }
}
