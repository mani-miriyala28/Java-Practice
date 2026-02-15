package Static_Methods;

public class ArithmeticMain {
    public static void main(String[] args) {
        ArithmeticOperations arithmetic = new ArithmeticOperations();
        int sum = arithmetic.sum(5, 10);
        int addition = ArithmeticOperations.addition(10, 5);


        System.out.println("Sum: " + sum);

    }
}