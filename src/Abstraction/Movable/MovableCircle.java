package Abstraction.Movable;

public class MovableCircle extends Movable{

    private int Radius;
    private MoveablePoint Center;

    public MovableCircle(int x, int y, int xSpeed , int ySpeed , int Radius){}

    @Override
    public String toString() {
        return "MovableCircle{" +
                "Radius=" + this.Radius +
                ", Center=" + this.Center +
                '}';
    }

    @Override
    public void moveUp() {
        super.moveUp();
    }

    @Override
    public void moveDown() {
        super.moveDown();
    }

    @Override
    public void moveLeft() {
        super.moveLeft();
    }

    @Override
    public void moveRight() {
        super.moveRight();
    }
}
