package Bank;

public class Account{
    private String Account_no;
    private String Pin;
    private double Balance;

    public Account(String account_no, String pin, double balance) {
        this.setAccount_no(account_no);
        this.setPin(pin);
        this.setBalance(balance);
    }


    public String getAccount_no() {return Account_no;}

    public void setAccount_no(String account_no) {this.Account_no = account_no;}

    public String getPin() {return Pin;}

    public void setPin(String pin) {this.Pin = pin;}

    public double getBalance() {return Balance;}

    public void setBalance(double balance) {this.Balance = balance;}


    public void WithDraw(double amount) {
        if(this.getBalance() > amount)
        {Balance -= amount; }
        else {System.out.println("Invalid amount");}
    }

    public void deposit(double amount) {
        if(amount > 0)
        {Balance += amount; }
        else {System.out.println("Invalid amount");}
    }

    @Override
    public String toString() {
        return "Account{" +
                "Account_no='" + getAccount_no() + '\'' +
                ", Balance=" + getBalance()+
                '}';
    }
}
