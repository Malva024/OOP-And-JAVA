package VehicalManagement;

public class Car extends  Vehical{

    public Car(){super();}

    public Car(double speed, double fuellevel) {
        super(speed, fuellevel);
    }

    @Override
    public void Start() {
        System.out.println("Car is starting");
    }

    @Override
    public void Stop() {
        System.out.println("Car is stopped");
    }
}
