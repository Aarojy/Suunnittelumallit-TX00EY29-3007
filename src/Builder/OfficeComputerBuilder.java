package Builder;

public class OfficeComputerBuilder implements IComputerBuilder {
    private Computer computer;

    public OfficeComputerBuilder() {
        this.computer = new Computer();
    }

    @Override
    public void buildProcessor() {
        computer.setProcessor("Intel Core I5-13400");
    }

    @Override
    public void buildRAM() {
        computer.setRAM(16);
    }

    @Override
    public void buildStorage() {
        computer.setStorage(512);
    }

    @Override
    public void buildGraphicsCard() {
        computer.setGraphicsCard("Integrated Graphics");
    }

    @Override
    public void buildOS() {
        computer.setOS("Windows 11 Home");
    }

    @Override
    public Computer getComputer() {
        return computer;
    }
}
