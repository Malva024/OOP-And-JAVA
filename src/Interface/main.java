package Interface;

public class main {

    public static void main(String[] args) {
        MovablePoint p = new MovablePoint(10, 11,3,5);
        System.out.println(p.toString());

        MoveableCircle c = new MoveableCircle(1,2,3,4,12);
        System.out.println(c.toString());

        Circle o = new Circle(2);
        System.out.println(o.toString());
        System.out.println(o.getArea());
        System.out.println(o.getPerimeter());


        ResizableCircle x = new ResizableCircle(o.radius);
        System.out.println(x.toString());
        x.resize(10);
        System.out.println(x.toString());
        System.out.println(x.getArea());
        System.out.println(x.getPerimeter());



    }
}
