package SIB;

public class CarMain {

    static{
        System.out.println("Static Block from same class");
    }
    public static void main(String[] args) {
        System.out.println("Main Method Invocation started");
        Car car = new Car();
        Car car1=new Car("Toyota","Camry",200000);

        System.out.println("car1 Details:"+car1.getCarModel());

    }
}
