package EmployeeSalaryCalculator;

public class Manager extends Employee{

    public Manager(String name, int id, double salary) {super(name, id,salary);}

    @Override
    public double CalculateSalary() {
        return getBasicSalary() + 0.3 * getBasicSalary();
    }

    @Override
    public void displayInfo() {
        System.out.println(
                "Manager \n Name: "+super.getName()+
                "Id:   "+super.getId()+
                "Salary"+CalculateSalary()

        );
    }
}
