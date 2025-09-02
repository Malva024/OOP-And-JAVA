public abstract class Shapes {

    private String Color;
    private boolean Filled;

    public Shapes() {
        Color = "blue";
        Filled = true;
    }

    public Shapes(String color, boolean filled) {
        Color = color;
        Filled = filled;
    }

    public String getColor() {
        return Color;
    }

    public void setColor(String color) {
        Color = color;
    }

    public boolean isFilled() {
        return Filled;
    }

    public void setFilled(boolean filled) {
        Filled = filled;
    }

    public abstract double CalculatePerimeter();


    @Override
    public String toString() {
        return
                "\nColor='" + getColor() + '\'' +
                "\nFilled=" + isFilled() +
                "\nPerimeter"+CalculatePerimeter()+
                "";
    }
}
