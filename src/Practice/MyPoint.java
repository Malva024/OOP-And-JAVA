package Practice;

public class MyPoint {
    private int X;
    private int Y;


    public MyPoint()
    {
        X=0;
        Y=0;
    }

    public MyPoint(int x, int y)
    {
        setX(X);
        setY(Y);
    }

    public int getX() {return X;}

    public void setX(int x) {this.X = x;}

    public int getY(){return Y;}

    public void setY(int Y){this.Y = Y;}

    public void setXY(int X ,int Y)
    {
        this.X=X;
        this.Y=Y;
    }
    public int[] getXY()
    {return new int[]{X,Y};}

    public String toString() {
        return "MyPoint[X: "+getX()+"Y: "+getY()+"XY: "+getXY()+"]";
    }

    public double distance(int X, int Y)
    {
        int xDiff = this.X - X;
        int yDiff = this.Y - Y;

        return (xDiff*xDiff + yDiff*yDiff);
    }

    public double distance(MyPoint other)
    {
        int xDiff = this.X - other.X;
        int yDiff = this.Y - other.Y;

        return (xDiff*xDiff + yDiff*yDiff);
    }
    public double distance()
    {
        int xDiff = this.X;
        int yDiff = this.Y;

        return (xDiff*xDiff + yDiff*yDiff);
    }



}
