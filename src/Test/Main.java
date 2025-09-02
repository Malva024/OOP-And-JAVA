package Test;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner s= new Scanner(System.in);

        Car c = new Car("Maclaren","750s",2019);
        Customer c1 = new Customer("Nemo", "Nemo house", 19);
        Calculation cc= new Calculation(5,c1,c);
        System.out.println(cc.toString());

        Bank b= new Bank("Islamic", "Islamic city",3);
        b.AddAccount (new AccountHolder("Nemo", "Nemo House"), new Acounts(1000));
        b.AddAccount (new AccountHolder("Memo", "Memo House"), new Acounts(2000));
        b.AddAccount (new AccountHolder("Temo", "Temo House"), new Acounts(3000));
        b.displayAccounts();


    }



}
