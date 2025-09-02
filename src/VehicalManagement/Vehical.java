package VehicalManagement;

public abstract class Vehical {

    private double speed , fuellevel;

    public Vehical(){this.speed =10; this.fuellevel =50;}

    public Vehical(double speed, double fuellevel) {
        setSpeed(speed);
        setFuellevel(fuellevel);
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public double getFuellevel() {
        return fuellevel;
    }

    public void setFuellevel(double fuellevel) {
        this.fuellevel = fuellevel;
    }

    public abstract void Start();
    public abstract void Stop();


}
