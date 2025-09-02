package EmployeeSalaryCalculator;

public class Main {

    public static void main(String[] args) {

        Employee [] e = new Employee[2];
        e[0] = new Manager("Nemo",1111,2000);
        e[1] = new Intern("Memo",2222,5000);

        for(int i=0; i<e.length;i++)
        {
            e[i].displayInfo();
        }


    }
}
