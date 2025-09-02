package EmployeeSalaryCalculator;

public class Intern extends Employee {

    public Intern (String name, int id, double salary) {super(name, id,salary);}

    @Override
    public double CalculateSalary() {
        return getBasicSalary() + 0.05 * getBasicSalary();
    }

    @Override
    public void displayInfo() {
        System.out.println(
                "Intern \nName: "+super.getName()+
                        "Id:   "+super.getId()+
                        "Salary"+CalculateSalary()

        );
    }
}
