package Bank;

public class Main {
    public static void main(String[] args) {

        Bank b1 = new Bank(3);
        b1.addAccount(new Account("1A","1111",100));
        b1.addAccount(new Account("2A","2222",200));
        b1.addAccount(new Account("3A","3333",100));
        b1.displayAccounts();
    }
}
