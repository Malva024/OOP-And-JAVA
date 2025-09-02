package Test;

public class Acounts{
    private double Balance;

    public Acounts(double balance) {
        setBalance(balance);
    }


    public Acounts()
    {this.Balance = 1000;}

    public double getBalance() {return Balance;}

    public void setBalance(double balance) {
        if(balance>0){Balance = balance;} else {System.out.println("Invalid");}}

    public double withDraw(double amount)
    {if(amount>getBalance()){ return getBalance()-amount;} else{return 0;}}

    public double deposit(double amount)
    {if(amount>0){ return getBalance()+amount;} else{return 0;}}



}

