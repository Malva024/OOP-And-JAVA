package Practice;

public class Employee {

    private int Id;
    private String First_Name;
    private String Last_Name;
    private int Salary;


    public Employee(int Id, String First_name, String Last_Name,int Salary)
    {
        this.Id =Id;
        this.First_Name = First_name;
        this.Last_Name = Last_Name;
        this.Salary = Salary;
    }
    public int Id()
    {return Id;}

    public String getFirst_Name()
    { return First_Name;}

    public String getLast_Name()
    { return Last_Name;}

    public String getName()
    { return First_Name+" "+Last_Name;}

    public int Salary()
    { return Salary;}

    public void setSalary(int salary)
    { this.Salary = salary;}

    public int getAnnualSalary()
    { return Salary*12;}

    public int raiseSalary(int percentage )
    {
        Salary += Salary * percentage / 100;
        return Salary;
    }

    public String toString()
    {
        return "Employee[Id:"+Id+" Name: "+First_Name+" "+Last_Name+" Salary:"+Salary+"]";
    }

}
