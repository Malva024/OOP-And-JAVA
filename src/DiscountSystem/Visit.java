package DiscountSystem;

import java.time.LocalDateTime;
import java.util.Date;

public class Visit {
    private Customer customer;
    private Date date;
    private double ServiceExpense;
    private double ProductExpense;

    public Visit(Customer customer,Date date) {
        this.customer = customer;
        this.date= date;
    }

    public double getServiceExpense() {return ServiceExpense;}

    public void setServiceExpense(double serviceExpense) {this.ServiceExpense = serviceExpense;}

    public double getProductExpense() {return ProductExpense;}

    public void setProductExpense(double productExpense) {this.ProductExpense = productExpense;}

    public double getTotal()
    { double service = Discount.getServiceDiscountRate(customer.getMemberType());
        double Product = Discount.getProductDiscountRate(customer.getMemberType());
        return (getProductExpense()* Product) +(getServiceExpense()*service);}

    @Override
    public String toString() {
        return "Visit{"+ this.customer+
                ", date=" + this.date +
                ", ServiceExpense=" + getServiceExpense() +
                ", ProductExpense=" + getProductExpense() +
                '}';
    }
}
