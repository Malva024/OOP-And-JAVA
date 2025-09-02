package Practice;

public class Chicken {
    private String Name;
    private int Age;

    public Chicken(String Name , int Age )
    {
        this.Name = Name;
        this.Age = Age;
    }
    public String getName()
    {return Name;}

    public int getAge()
    {return Age;}

    public void setName(String Name)
    {
        if(!Name.isEmpty() && !Name.trim().isEmpty())
        {this.Name = Name;}
        else
        {System.out.println("Name can not me empty");}
    }

    public void setAge(int Age)
    { if(Age > 0 && Age <=15)
       {this.Age = Age;}
       else
        {System.out.println("Invalid Age");}
    }

    public double eggsPerday()
    {
        if(this.getAge()<=6)
        {return 2;}
        else if (this.getAge() >6 && this.getAge() <=12)
        {return 1;}
        else
        {return 0.75;}
    }

    public void produtionPerday()
    {
        if(!getName().isEmpty() && !getName().trim().isEmpty() && getAge()>=1)
        {
            System.out.println("Chicken Name: " +getName()+ " Chicken age: " +getAge()+ " Eggs per Day: " +eggsPerday());
        }

    }




}
