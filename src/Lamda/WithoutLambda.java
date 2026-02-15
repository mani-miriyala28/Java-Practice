package Lamda;

class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("Drawing Rectangle");
    }
}

class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("Drawing Circle");
    }
}

class Triangle implements Shape {
    @Override
    public void draw() {
        System.out.println("Drawing Triangle");
    }
}
public class WithoutLambda {
    public static void main(String[] args) {
        Shape rectangle = new Rectangle();
        rectangle.draw();

        Shape circle = new Circle();
        circle.draw();

        Shape triangle = new Triangle();
        triangle.draw();
    }

}
