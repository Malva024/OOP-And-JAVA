package Practice;

public class Account {
    private String Id;
    private String Name;
    private int Balance;

    public Account(String Id, String Name)
    {
        this.Id = Id;
        this.Name = Name;
    }

    public Account(String Id, String Name, int Balance)
    {
        this.Id = Id;
        this.Name = Name;
        this.Balance = Balance;
    }

    public String getId()
    { return Id;}


    public String getName()
    {return Name;}

    public int getBalance()
    {return Balance;}

    public int credit(int amount)
    {
        Balance += amount;
        return Balance;
    }

    public int debit(int amount)
    {
        if (amount<=Balance)
        {Balance -= amount;}
        else
        {System.out.println("Amount can't exceed the balance");}
        return Balance;
    }

    public void transfer(int other_acount,int amount)
    {
        debit(amount);
        other_acount += amount;
        System.out.println("Amount is transfeered to given Account");

    }

    public String toString()
    {
        return "Account[Id: "+Id+" Name: "+Name+" Balance: "+Balance+"]";
    }



}
