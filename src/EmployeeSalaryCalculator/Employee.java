package EmployeeSalaryCalculator;

public abstract class Employee {

    private String Name;
    private int id;
    private double BasicSalary;

    public Employee(String name, int id, double basicSalary) {
        setName(name);
        setId(id);
        setBasicSalary(basicSalary);
    }

    public String getName() {return Name;}

    public void setName(String name) {Name = name;}

    public int getId() {return id;}

    public void setId(int id) {this.id = id;}

    public double getBasicSalary() {
        return BasicSalary;
    }

    public void setBasicSalary(double basicSalary) {
        BasicSalary = basicSalary;
    }

    public abstract double CalculateSalary();
    public abstract void displayInfo();

}
