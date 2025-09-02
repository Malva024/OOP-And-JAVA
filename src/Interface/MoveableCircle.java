package Interface;

import Abstraction.Movable.MoveablePoint;

public class MoveableCircle extends MoveablePoint {
    public int Radius;

    public MoveableCircle(int x, int y, int xSpeed, int ySpeed, int radius) {
        super(x, y, xSpeed, ySpeed);
        Radius = radius;
    }

    @Override
    public void moveRight() {
        System.out.println("Moving Right");

    }

    @Override
    public void moveLeft() {
        System.out.println("Moving Left");
    }

    @Override
    public void moveDown() {
        System.out.println("Moving Down");
    }

    @Override
    public void moveUp() {
        System.out.println("Moving Up");

    }

    @Override
    public String toString() {
        return super.toString()+" MoveableCircle{" +
                " Radius=" + Radius +
                '}';
    }
}
