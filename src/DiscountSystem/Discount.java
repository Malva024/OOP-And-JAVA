package DiscountSystem;

public class Discount {
    private static double ServiceDiscountPremium =0.2;
    private static double ServiceDiscountGold =0.15;
    private static double ServiceDiscountSilver =0.1;
    private static double productDiscountPremium =0.2;
    private static double productDiscountGold =0.15;
    private static double productDiscountSilver =0.1;

    public static double getProductDiscountRate(String type) {
        if(type.equalsIgnoreCase("premium"))
        {return productDiscountPremium;}
        else if(type.equalsIgnoreCase("Gold"))
        {return productDiscountGold;}
        else if(type.equalsIgnoreCase("silver"))
        {return productDiscountSilver;}
        else{System.out.println("Invalid type");
        return 0;}
    }

    public static double getServiceDiscountRate(String type) {
        if(type.equalsIgnoreCase("premium"))
        {return  ServiceDiscountPremium;}
        else if(type.equalsIgnoreCase("Gold"))
        {return  ServiceDiscountGold;}
        else if(type.equalsIgnoreCase("sliver"))
        {return  ServiceDiscountSilver;}
        else{System.out.println("Invalid type");
            return 0;}
    }


}
