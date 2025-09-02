package Interface;

interface Moveable
{
    public void moveUp();
    public void moveDown();
    public void moveLeft();
    public void moveRight();
}

public class MovablePoint implements Moveable{

    private int x , y, xspeed,yspeed;

    public MovablePoint(int x, int y, int xspeed, int yspeed) {
        this.x = x;
        this.y = y;
        this.xspeed = xspeed;
        this.yspeed = yspeed;
    }

    @Override
    public String toString() {
        return "MovablePoint{" +
                "x=" + x +
                ", y=" + y +
                ", xspeed=" + xspeed +
                ", yspeed=" + yspeed +
                '}';
    }

    @Override
    public void moveUp() {System.out.println("Moving Up");}

    @Override
    public void moveDown() {System.out.println("Moving Down");}

    @Override
    public void moveLeft() {System.out.println("Moving Left");}

    @Override
    public void moveRight() {System.out.println("Moving Right");}
}
