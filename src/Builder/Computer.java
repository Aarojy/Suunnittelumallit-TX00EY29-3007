package Builder;

public class Computer {
    String Processor;
    int RAM_GB;
    int Storage_GB;
    String GraphicsCard;
    String OS;

    void setProcessor(String processor) {
        this.Processor = processor;
    }

    void setRAM(int ram) {
        this.RAM_GB = ram;
    }

    void  setStorage(int storage) {
        this.Storage_GB = storage;
    }

    void setGraphicsCard(String graphicsCard) {
        this.GraphicsCard = graphicsCard;
    }

    void setOS(String os) {
        this.OS = os;
    }

    void showSpecs() {
        System.out.println("Processor: " + Processor);
        System.out.println("RAM: " + RAM_GB + " GB");
        System.out.println("Storage: " + Storage_GB + " GB");
        System.out.println("Graphics Card: " + GraphicsCard);
        System.out.println("Operating System: " + OS);
    }
}
