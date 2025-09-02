package Bank;

public class Bank {
    private Account[] accounts;
    private int count = 0;

    public Bank(int size) {
        accounts = new Account[size];
    }

    public void addAccount(Account account) {
        if (count < accounts.length) {
            accounts[count] = account;
            count++;
        } else {
            System.out.println("Bank account list is full.");
        }
    }

    public void removeAccount(Account account) {
        boolean found = false;
        for (int i = 0; i < count; i++) {
            if (accounts[i] == account) {
                // Shift elements to the left
                for (int j = i; j < count - 1; j++) {
                    accounts[j] = accounts[j + 1];
                }
                accounts[count - 1] = null; // Clear last element
                count--;
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Account not found.");
        }
    }

    public void displayAccounts() {
        System.out.println("...............INFO...........");
        for (int i = 0; i < count; i++) {
            System.out.println("Account " + (i + 1) + ": " + accounts[i]);
        }
    }



}
