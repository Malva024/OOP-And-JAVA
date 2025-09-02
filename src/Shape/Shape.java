package Shape;

public abstract class Shape {
    protected String Color;
    protected boolean filled;

    public Shape() {
        Color = "red";
        this.filled = true;
    }

    public Shape(String color, boolean filled) {
        Color = color;
        this.filled = filled;
    }

    public String getColor() {return Color;}

    public void setColor(String color) {if(color.isEmpty() && color.trim().isEmpty()){ Color = color;} else{System.out.println("Invalid");}}

    public boolean isFilled() {return filled;}

    public void setFilled(boolean filled) {this.filled = filled;}

    public abstract double getArea();
    public abstract double getPerimeter();

    @Override
    public String toString() {
        return "Shape{" +
                " Color ='" + getColor() + '\'' +
                " filled =" + isFilled() +
                " Area = "+getArea()+
                " Perimeter = "+getPerimeter()+
                '}';
    }
}
