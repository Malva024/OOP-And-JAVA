public class Square extends Shapes{

    private double sides;

    public Square() {
        super();
        this.sides= 0.1;
    }

    public Square(String color, boolean filled, double sides) {
        super(color, filled);
        setSides(sides);
    }

    public double getSides() {return sides;}

    public void setSides(double sides) {this.sides = sides;}

    @Override
    public double CalculatePerimeter() {
        return getSides()*4;
    }

    @Override
    public String toString() {
        return super.toString()+
                "\nsides=" + getSides() +"";
    }
}
