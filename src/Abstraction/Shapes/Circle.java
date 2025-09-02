package Abstraction.Shapes;

public class Circle extends Shapes{

    protected double Radius;

    public Circle(){this.Radius =0.1;}

    public Circle(double Radius){ this.setRadius(Radius);}

    public Circle(String Color, boolean Filled, double Radius) {
        super(Color, Filled);setRadius(Radius);}

    public double getRadius() {return Radius;}

    public void setRadius(double Radius) {if(Radius >= 0){Radius = Radius;}}

    @Override
    public double getArea() {
        return 0;
    }

    @Override
    public double getPerimeter() {
        return 0;
    }

    @Override
    public String toString() {
        return super.toString()+" Circle{" +
                "Radius=" + getRadius() +
                '}';
    }
}
