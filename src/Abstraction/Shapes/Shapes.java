package Abstraction.Shapes;

public abstract class Shapes {
    protected String Color;
    protected boolean Filled;

    public Shapes(){ this.Color ="Red"; this.Filled =true;}

    public Shapes(String Color, boolean Filled){setColor(Color); setFilled(Filled);}

    public String getColor() {return Color;}

    public void setColor(String Color) {if(!Color.isEmpty() && !Color.trim().isEmpty()){this.Color = Color;}}

    public boolean isFilled() {return Filled;}

    public void setFilled(boolean Filled) {Filled = Filled;}

    public abstract double getArea();
    public abstract double getPerimeter();

    @Override
    public String toString() {
        return "Shapes{" +
                "Color='" + getColor() + '\'' +
                ", Filled=" + isFilled()+
                '}';
    }
}
