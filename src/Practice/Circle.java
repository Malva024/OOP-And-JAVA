
package Practice;

public class Circle {
    private double Radius;
    private String Color;

    public Circle()
    {
        Radius = 1.0;
        Color ="Red";
    }

    public Circle(double Radius, String Color)
    {
        this.Radius = Radius;
        this.Color = Color;
    }

    public String getColor()
    {return Color;}

    public void setColor(String Colour)
    { this.Color = Colour;}

    public double getRadius()
    {return Radius;}

    public void setRadius(double Radius)
    { this.Radius = Radius;}

    public double getArea()
    {return Radius * Radius * 3.142;}

    public String toString() {
        return "Radius:  " +Radius+" Color: "+Color+" ";
    }

}
