package lld.solidPrinciple.singleResponsibilityPrinciple;

//A class should have only one reason to change, meaning it should only have one job or responsibility.
class Employee {
    private String name;
    private double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public void saveToDatabase() {
        System.out.println("Saving employee data to the database...");
    }

    public String generateReport() {
        return "Employee Report: Name - " + name + ", Salary - " + salary;
    }
}

//Problems:
//The Employee class has multiple responsibilities:
//It represents employee data.
//It handles database operations.
//It generates reports.