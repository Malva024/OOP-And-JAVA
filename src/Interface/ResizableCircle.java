package Interface;

public class ResizableCircle extends Circle implements Resizeable {
    public ResizableCircle(double radius) {super(radius);}

    @Override
    public String toString() {return "ResizeableCircle [Circle [radius=" +super.radius+"]]";}

    @Override
    public void resize(double percentage) {
        super.radius *= percentage/100;
    }
}
