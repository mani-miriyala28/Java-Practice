package Lamda;

public class Lambda {
    public static void main(String[] args) {
        Shape rectangle=() -> System.out.println("Drawing Rectangle");
        rectangle.draw();
        Shape circle=() -> System.out.println("Drawing Circle");
        circle.draw();
        Shape triangle=() -> System.out.println("Drawing Triangle");
        triangle.draw();
    }
}
