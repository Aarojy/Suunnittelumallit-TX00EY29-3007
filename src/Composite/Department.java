package Composite;

import java.util.ArrayList;

public class Department extends  OrganizationEntity {
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_RESET = "\u001B[0m";

    private String name;
    private ArrayList<OrganizationEntity> subEntities = new ArrayList<OrganizationEntity>();

    public Department(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void removeDepartment() {
        for (OrganizationEntity entity : subEntities) {
            if (entity instanceof Department) {
                ((Department) entity).removeDepartment();
            }
        }
        subEntities.clear();
    }

    public void addSubEntity(OrganizationEntity entity) {
        subEntities.add(entity);
    }

    public ArrayList<OrganizationEntity> getSubEntities() {
        return subEntities;
    }

    public String showXML() {
        String xml = ANSI_YELLOW + "<"+name+">\n" + ANSI_RESET;
        for (OrganizationEntity entity : subEntities) {
            if (entity instanceof Department) {
                xml += ((Department) entity).showXML(1);
            }
            else if (entity instanceof Employee) {
                xml += ANSI_GREEN + "\t<"+ ((Employee) entity).getName() + ">\n" + ANSI_RESET;
            }
        }
        xml += ANSI_YELLOW + "</"+name+">\n" + ANSI_RESET;

        return xml;
    }

    public String showXML(int level) {
        String xml = ANSI_YELLOW + "\t".repeat(level) + "<"+name+">\n" + ANSI_RESET;
        for (OrganizationEntity entity : subEntities) {
            if (entity instanceof Department) {
                xml += ((Department) entity).showXML(level+1);
            }
            else if (entity instanceof Employee) {
                xml += ANSI_GREEN + "\t".repeat(level+1) + "<"+ ((Employee) entity).getName() + ">\n" + ANSI_RESET;
            }
        }
        xml += ANSI_YELLOW + "\t".repeat(level) + "</"+name+">\n" + ANSI_RESET;

        return xml;
    }

    public int getTotalSalary() {
        double totalSalary = 0;
        for (OrganizationEntity entity : subEntities) {
            if (entity instanceof Employee) {
                totalSalary += ((Employee) entity).getSalary();
            } else if (entity instanceof Department) {
                totalSalary += ((Department) entity).getTotalSalary();
            }
        }
        return (int) totalSalary;
    }

    public String totalSalary() {
        return "Department: " + name + ", Total Salary: " + getTotalSalary();
    }

}
