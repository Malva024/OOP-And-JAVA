package Assignment;

public class EmployeeRecords {

    private String Name;
    private int Age;
    private double Salary;

    public EmployeeRecords(String Name , int Age , double Salary)
    {
        setName(Name);
        setAge(Age);
        setSalary(Salary);
    }

    public String getName(){return Name;}
    public int getAge(){return Age;}
    public double getSalary(){return Salary;}

    public void setName(String Name)
    {
        if(!Name.isEmpty() && !Name.trim().isEmpty())
        {
            this.Name =Name;
        }
        else
        {System.out.println("Name can not be empty");}
    }

    public void setAge(int Age)
    {
        if(Age<0)
        {System.out.println("Invalid age");}
        else
        {
            this.Age = Age;}
    }

    public void setSalary(double Salary)
    {
        if(Salary <0)
        {System.out.println("Invalid Salary");}
       else
        {
            this.Salary = Salary;
        }

    }



}
