package Customer;

public class VipCustomer extends Customer{
    private double discount;

    public VipCustomer(String name, String address, String phone, double discount) {
        super(name, address, phone);
        this.setDiscount(discount);
    }

    public double getDiscount() {return discount;}

    public void setDiscount(double discount) {this.discount = discount;}

    @Override
    public double price(double price) {return (discount/100) * super.price(price);}

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Discount: "+getDiscount());
    }
}
