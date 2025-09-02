package Shape;

import Interface.Circle;

public class Rectangle extends Shape{
    protected double Width;
    protected double Length;

    public Rectangle(){this.Width =0.; this.Length =0.1;}
    public Rectangle(double width, double length) {this.setWidth(width); this.setLength(length);}

    public Rectangle(String color, boolean filled, double width, double length) {super(color, filled); this.setWidth(width); this.setLength(length);}

    public double getWidth() {return Width;}

    public void setWidth(double width) {if(Width <0 ){Width = width;}else{System.out.println("Invalid");}}

    public double getLength() {return Length;}

    public void setLength(double length) {if(Length<0){Length = length;}else{System.out.println("Invalid");}}

    @Override
    public double getArea() {
        return getWidth() * getLength();
    }

    @Override
    public double getPerimeter() {
        return 2*(getWidth() + getLength());
    }

    @Override
    public String toString() {
        return super.toString()+" Rectangle{" +
                "Width=" + getWidth() +
                ", Length=" + getLength() +
                '}';
    }
}
