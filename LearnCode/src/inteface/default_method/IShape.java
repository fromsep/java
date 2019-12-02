package inteface.default_method;

public interface IShape {
    public void getName();

    // 默认方法
    public default void getShape() {
        System.out.println("Ishape getShape");
    }

    public static void staticMethod() {
        System.out.println("Ishape staticMethod");
    }
}
