package Lamda;

public class LambdaAsMethodParameter {
    public static void main(String[] args) {
        Shape rectangle = () -> System.out.println("Drawing Rectangle");
        drawShape(rectangle);
        Shape circle = () -> System.out.println("Drawing Circle");
        drawShape(circle);
        Shape triangle = () -> System.out.println("Drawing Triangle");
        drawShape(triangle);
//        drawShape(() -> System.out.println("Drawing Rectangle"));
//        drawShape(() -> System.out.println("Drawing Circle"));
//        drawShape(() -> System.out.println("Drawing Triangle"));
    }

    public static void drawShape(Shape shape) {
        shape.draw();
    }
}
