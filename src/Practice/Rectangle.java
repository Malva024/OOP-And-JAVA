package Practice;

public class Rectangle {
    private float length;
    private float width;

    public Rectangle()
    {
        length = 1.0F;
        width = 1.0F;
    }
    public Rectangle (float length, float width)
    {
        this.length = length;
        this.width = width;
    }
    public float getLength()
    {
        return length;
    }

    public void setlength(float length)
    {
        this.length = length;
    }

    public float getWidth()
    {
        return width;
    }
    public void setwidth(float width)
    {
        this.width = width;
    }
    public double getArea()
    {
        return length*width;
    }

    public double getPerimeter()
    {
        return 2*length + 2*width;
    }

    public String toString()
    {
        return "Rectangle[Length: "+length+" Width: "+width+"]";
    }

}
