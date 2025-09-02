package Shape;

public class Square extends Rectangle{

    public Square(double side) {super(side, side);}

    public Square(String color, boolean filled, double side) {super(color, filled, side, side);}

    public double getside(){ return super.getWidth();}
    public void setside(double side){super.setWidth(side);}

    @Override
    public void setLength(double side) {super.setLength(side);}

    @Override
    public void setWidth(double side) {super.setWidth(side);}

    @Override
    public String toString() {
        return super.toString();
    }
}
