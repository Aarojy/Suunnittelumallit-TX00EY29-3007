package Builder;

public class GamingComputerBuilder implements IComputerBuilder{
    private Computer computer;

    public GamingComputerBuilder() {
        this.computer = new Computer();
    }

    @Override
    public void buildProcessor() {
        computer.setProcessor("intel Core I9-14900k");
    }

    @Override
    public void buildRAM() {
        computer.setRAM(64);
    }

    @Override
    public void buildStorage() {
        computer.setStorage(1024);
    }

    @Override
    public void buildGraphicsCard() {
        computer.setGraphicsCard("NVIDIA GeForce RTX 5090");
    }

    @Override
    public void buildOS() {
        computer.setOS("Windows 11 Pro");
    }

    @Override
    public Computer getComputer() {
        return computer;
    }
}
