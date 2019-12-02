package inteface.default_method;

public class Test {
    public static void main(String[] args) {
        Shape shape = new Shape();
        shape.getName();

        shape.getShape();

        IShape.staticMethod();
    }
}
