package Builder;

public class Main {
    public static void main(String[] args) {
        ComputerDirector director = new ComputerDirector(new GamingComputerBuilder());
        Computer gamingComputer = director.constructComputer();
        System.out.println("Gaming Computer Specs:");
        gamingComputer.showSpecs();

        System.out.println();

        director = new ComputerDirector(new OfficeComputerBuilder());
        Computer officeComputer = director.constructComputer();
        System.out.println("Office Computer Specs");
        officeComputer.showSpecs();
    }
}
