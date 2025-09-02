package DiscountSystem;

import java.util.Date;

public class Main {
    public static void main(String[] args) {

        Customer t = new Customer("Alice");
        t.setMember(true);
        t.setMemberType("Gold");


        Visit c = new Visit(t, new Date());
        c.setProductExpense(1000);
        c.setServiceExpense(50);

        System.out.println(c.toString());


        Discount d = new Discount();
        double discountproduct = d.getProductDiscountRate(t.getMemberType());
        double discountservice = d.getServiceDiscountRate(t.getMemberType());
        System.out.println(c.getTotal());



    }
}
