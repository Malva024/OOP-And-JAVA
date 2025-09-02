package Test;

public class Customer {
    private String Name;
    private String Address;
    private int Age;

    public Customer(String name, String address, int age) {
        setName(name);
        setAddress(address);
        setAge(age);
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {if(!name.isEmpty() && !name.trim().isEmpty()){this.Name = name;} else {System.out.println("invalid");}}

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        {if(!address.isEmpty() && !address.trim().isEmpty()){this.Address = address;}else {System.out.println("invalid");}}}

    public int getAge() {return Age;}

    public void setAge(int age) {
        if(age>0){this.Age = age;}else {System.out.println("invalid");}}

}
