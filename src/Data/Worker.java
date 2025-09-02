package Data;

public class Worker implements Person, Iworker{
    private String Name;
    private String Sirname;
    private double Salary;

    @Override
    public double getSalary() {return Salary;}

    @Override
    public void setSalary(double Salary) {this.Salary =Salary;}

    @Override
    public String getName() {return Name;}

    @Override
    public void setName(String Name) {this.Name=Name;}

    @Override
    public String getSirname() {return Sirname;}

    @Override
    public void setSirname(String Sirname) {this.Sirname=Sirname;}
}
