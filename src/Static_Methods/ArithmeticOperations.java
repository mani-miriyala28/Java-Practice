package Static_Methods;

public class ArithmeticOperations {

    double piValue=3.14;
    static final double PI_VALUE=3.14;

    //instance method for addition
    public int sum(int a, int b) {
        //accessing instance variable inside instance method
        System.out.println("Instance PI Value inside instance method: " + piValue);

        //accessing static variable inside instance method
        System.out.println("Static PI Value inside instance method: " + PI_VALUE);

        //accessing instance method inside instance method
        System.out.println("Subtraction: " + subtraction(20, 10));

        //accessing static method inside instance method
//        System.out.println("Addition: " + addition(20, 10));
        return a + b;
    }

//    static method for addition
//    we cant do this bcoz with same method signature there is already a method
//    public static int sum(int a, int b) {
//        return a + b;
//    }

    //static method for addition with different method name
    public static int addition(int a, int b) {
        //accessing static variable inside static method
        System.out.println("Static PI Value inside static method: " + PI_VALUE);

        //we cant access instance variable inside static method directly
//        System.out.println("Instance PI Value inside static method: " + piValue); //

        //we cant access instance method inside static method directly
        //with obj reference we can access instance variable and method
        ArithmeticOperations ari=new ArithmeticOperations();
        System.out.println("Instance PI Value inside static method: " + ari.piValue);
        System.out.println("Sum: " + ari.sum(20, 10));

        return a + b;
    }

    public int subtraction(int a, int b) {
        return a - b;
    }

    public static void main(String[] args) {

        //accessing static members inside static method
        System.out.println("PI Value: " + PI_VALUE);
        System.out.println("Addition: " + addition(10, 20));

        //accessing instance members inside static method
        ArithmeticOperations operations = new ArithmeticOperations();
        System.out.println("Instance PI Value: " + operations.piValue);
        System.out.println("Sum: " + operations.sum(10, 20));

        //subtractions
        System.out.println("Subtraction: " + operations.subtraction(20, 10));
    }


}
