package Test;

public class AccountHolder {

    private String Name;
    private String Address;

    public AccountHolder(String name, String address) {
        setName(name);
        setAddress(address);
    }

    public String getName() {return Name;}

    public void setName(String name) {if(!name.isEmpty() && !name.trim().isEmpty()){this.Name = name;} else {System.out.println("invalid");}}

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        {if(!address.isEmpty() && !address.trim().isEmpty()){this.Address = address;}else {System.out.println("invalid");}}}


}
