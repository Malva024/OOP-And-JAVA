package Assignment;

public class BankAccount {

    private String Account_holder_Name;
    private double Balance = 0;

//    public
//


    public String getAccount_holder_Name() {return Account_holder_Name;}
    public double getBalance(){ return Balance;}

    public void setAccount_holder_Name(String Account_holder_Name)
    {this.Account_holder_Name = Account_holder_Name;}

    public void setBalance(double Balance)
    {
        if(Balance<=0)
        {
            System.out.println("Error");
        }else{
            this.Balance = Balance;}
    }

    public void withdrawAmount(double amount)
    {
        if(amount>=0  && amount<Balance)
        {
            Balance -= amount;
            System.out.println("Amount is withdraw");
        }
        else
        {
            System.out.println("Insufficient Balance");}
    }
    public double depositAmount(double amount)
    {
        if(amount>0)
        {
            Balance +=  amount;
            System.out.println("Amount is deposit");
            return Balance;
        }
        else{
            System.out.println("Insufficient Balance");
             return 0;}
        }

}



