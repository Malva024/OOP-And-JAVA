package VehicalManagement;

public class Truck extends Vehical{
    public Truck (){super();}

    public Truck (double speed, double fuellevel) {
        super(speed, fuellevel);
    }

    @Override
    public void Start() {
        System.out.println("Truck  is starting");
    }

    @Override
    public void Stop() {
        System.out.println("Truck  is stopped");
    }
}
