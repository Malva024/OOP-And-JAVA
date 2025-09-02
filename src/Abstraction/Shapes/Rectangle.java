package Abstraction.Shapes;

public class Rectangle extends Shapes {

    protected double Length;
    protected double Width;

    public Rectangle() {this.Length = 0.1; this.Width = 0.1;}

    public Rectangle(double length, double width) {this.setLength(length); this.setWidth(width);}

    public Rectangle(String Color, boolean Filled, double length, double width) {super(Color, Filled); this.setLength(length); this.setWidth(width);}

    public double getLength() {return Length;}

    public void setLength(double Length) {if (Length >= 0) {Length = Length;} else {System.out.println("Invalid");}}
    public double getWidth() {return Width;}

    public void setWidth(double width) {if (Length >= 0) {Width = width;}else {System.out.println("Invalid");}}

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
        return super.toString()+" Rectangle{" +
                "Length=" + Length +
                ", Width=" + Width +
                '}';
    }
}



