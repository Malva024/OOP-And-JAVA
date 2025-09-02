package Customer;

public class Main {
    public static void main(String[] args) {

        Customer c = new Customer("Nemo", "Nemo house", "23445");
        c.price(100);
        c.displayInfo();

        VipCustomer v = new VipCustomer("Memo", "Memo house", "09877543",40);
        v.displayInfo();
        v.price(100);
    }
}
