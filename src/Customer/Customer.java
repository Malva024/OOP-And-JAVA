package Customer;

public class Customer {

    private String Name;
    private String Address;
    private String Phone;

    public Customer(String name, String address, String phone) {
        this.setName(name);
        this.setAddress(address);
        this.setPhone(phone);
    }

    public String getName() {return Name;}

    public void setName(String name) {Name = name;}

    public String getAddress() {return Address;}

    public void setAddress(String address) {Address = address;}

    public String getPhone() {return Phone;}

    public void setPhone(String phone) {Phone = phone;}

    public double price(double price)
    {return price;}

    public void displayInfo() {
        System.out.println("Customer.Customer{" +
                "Name='" + getName() + '\'' +
                ", Address='" + getAddress() + '\'' +
                ", Phone='" + getPhone() + '\'' +
                '}');
    }
}
