package Assignment;

public class Car {

    String brand;
    String model;
    int year;
    double price;

    public Car(String brand, String model, int year, double price)
    {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.price = price;
    }

    void Start()
    {
        System.out.println("Band: "+brand+" Model: "+model+ " is Starting");
    }

    void accelerate()
    {
        System.out.println("Band: "+brand+" Model: "+model+ "is accelerating");
    }


}
