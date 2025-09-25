package Builder;

public class ComputerDirector {
    private IComputerBuilder computerBuilder;

    public ComputerDirector(IComputerBuilder computerBuilder) {
        this.computerBuilder = computerBuilder;
    }

    public Computer constructComputer() {
        computerBuilder.buildProcessor();
        computerBuilder.buildRAM();
        computerBuilder.buildStorage();
        computerBuilder.buildGraphicsCard();
        computerBuilder.buildOS();
        return computerBuilder.getComputer();
    }
}
