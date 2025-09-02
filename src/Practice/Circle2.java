package Practice;

public class Circle2 {
    private double Radius;

    public Circle2()
    {
        Radius = 1.0;
    }

    public Circle2(double Radius)
    {
        this.Radius = Radius;
    }

    public double getRadius()
    {
        return Radius;
    }

    public void setRadius(double Radius)
    {
        this.Radius = Radius;
    }

    public double getArea()
    {
        return Radius* Radius* Math.PI;
    }

    public double getCircumference()
    {
        return 2 * Math.PI * Radius;
    }

    public String toString()
    {
        return "Circle[Radius: "+Radius+"]";
    }
}
