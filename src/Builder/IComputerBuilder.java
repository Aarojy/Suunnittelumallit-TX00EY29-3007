package Builder;

public interface IComputerBuilder {
    void buildProcessor();
    void buildRAM();
    void buildStorage();
    void buildGraphicsCard();
    void buildOS();
    Computer getComputer();
}
