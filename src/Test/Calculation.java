package Test;

public class Calculation {

    private double hours;
    private double price;
    Customer customer;
    Car car;

    public Calculation(double hours, Customer customer, Car car) {
        setHours(hours);
        this.price = 100;
        this.customer = customer;
        this.car = car;
    }

    public double Calculation()
    { return getHours()*this.price;}

    public double getHours() {return hours;}

    public void setHours(double hours) {this.hours = hours;}


    @Override
    public String toString() {
        return  "Name: "+customer.getName()+
                "\nAddress: "+customer.getAddress()+
                "\nAge:     "+customer.getAge()+
                "\nCar:     "+car.getName()+
                "\nModel:   "+car.getModel()+
                "\nYear:    "+car.getYear()+
                "\nHours:   "+getHours()+
                "\nPrice:   "+Calculation();
    }

}
