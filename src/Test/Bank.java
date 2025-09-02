package Test;

public class Bank {
    private String Name;
    private String Address;
    private AccountHolder [] holders;
    private Acounts[] accounts;
    private int count =0;

    public Bank(int size){accounts = new Acounts[size];holders = new AccountHolder[size];}

    public Bank(String name, String address, int size) {
        setName(name);
        setAddress(address);
        holders = new AccountHolder[size];
        accounts = new Acounts[size];
    }

    public String getName() {return Name;}
    public void setName(String name) {if(!name.isEmpty() && !name.trim().isEmpty()){this.Name = name;} else {System.out.println("invalid");}}
    public String getAddress() {return Address;}
    public void setAddress(String address) {{if(!address.isEmpty() && !address.trim().isEmpty()){this.Address = address;}else {System.out.println("invalid");}}}


    public void AddAccount(AccountHolder holder , Acounts acounts)
    {
        if(count < holders.length){holders[count] = holder; accounts[count] = acounts;   count++;}
        else{System.out.println("Bank account list is full.");}
    }


    public void displayAccounts() {
        System.out.println("...............INFO...........");
        for (int i = 0; i < accounts.length; i++) {
            System.out.println(i+1);
            System.out.println(holders[i]);
            System.out.println(accounts[i]);
            System.out.println(". . . . . . . . . . . . . . . ");
        }
    }

}


