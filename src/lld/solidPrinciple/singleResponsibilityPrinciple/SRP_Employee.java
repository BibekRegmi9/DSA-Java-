package lld.solidPrinciple.singleResponsibilityPrinciple;

public class SRP_Employee {
    private String name;
    private double salary;

    public SRP_Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }
}


// Responsible for database operations
class EmployeeRepository {
    public void save(SRP_Employee employee) {
        System.out.println("Saving " + employee.getName() + " to the database...");
    }
}

// Responsible for report generation
class EmployeeReport {
    public String generate(SRP_Employee employee) {
        return "Employee Report: Name - " + employee.getName() + ", Salary - " + employee.getSalary();
    }
}
