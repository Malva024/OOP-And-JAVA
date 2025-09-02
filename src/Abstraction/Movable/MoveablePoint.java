package Abstraction.Movable;

public class MoveablePoint extends Movable{
    private int x,y, xSpeed, ySpeed;

    public MoveablePoint(int x, int y, int xSpeed, int ySpeed ){}

    @Override
    public String toString() {
        return "MoveablePoint{" +
                "x=" + this.x +
                ", y=" + this.y +
                ", xSpeed=" + this.xSpeed +
                ", ySpeed=" + this.ySpeed +
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
