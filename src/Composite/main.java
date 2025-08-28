package Composite;

public class main {
    public  static void main(String[] args) {
        Employee emp1 = new Employee("John", 50000);
        Employee emp2 = new Employee("Jane", 60000);
        Employee emp3 = new Employee("Mike", 80000);
        Employee emp4 = new Employee("Steve", 41200);
        Employee emp5 = new Employee("Mary", 90000);

        Department dept1 = new Department("Company");
        Department dept2 = new Department("HR");
        Department dept3 = new Department("IT");
        Department dept4 = new Department("Maintenance");
        Department dept5 = new Department("Development");

        dept1.addSubEntity(emp5);
        dept1.addSubEntity(dept2);
        dept1.addSubEntity(dept3);
        dept3.addSubEntity(dept4);
        dept3.addSubEntity(dept5);

        dept2.addSubEntity(emp4);
        dept4.addSubEntity(emp1);
        dept5.addSubEntity(emp2);
        dept5.addSubEntity(emp3);

        System.out.println(dept1.totalSalary());
        System.out.println(dept3.totalSalary());

        System.out.println();
        System.out.println(dept1.showXML());
        System.out.println();

        dept3.removeDepartment();

        Department dept6 = new Department("Cybersecurity");
        dept3.addSubEntity(dept6);

        Employee emp6 = new Employee("Bob", 300);
        Employee emp7 = new Employee("Henry", 200);
        dept6.addSubEntity(emp6);
        dept6.addSubEntity(emp7);

        System.out.println(dept1.showXML());
    }
}
