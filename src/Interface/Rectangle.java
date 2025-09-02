package Interface;

public class Rectangle implements GeometricObject{
    private double Width;
    private double Length;

    public Rectangle(double width, double length) {
        Width = width;
        Length = length;
    }

    @Override
    public double getPerimeter() {
        return 2*(Length + Width);
    }

    @Override
    public double getArea() {
        return Length * Width;
    }
}
