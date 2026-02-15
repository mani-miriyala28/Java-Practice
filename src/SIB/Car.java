package SIB;

public class Car {
    String carName;
    String carModel;
    int carPrice;
    static final int NO_Of_WHEELS;

    static {
        System.out.println("SIB Block console");
    }

    static{
        NO_Of_WHEELS=4;
        System.out.println("SIB Block");
    }

    public Car(){
        System.out.println("Default Constructor");
    }

    public Car(String carName, String carModel, int carPrice){
        this.carName=carName;
        this.carModel=carModel;
        this.carPrice=carPrice;
        System.out.println("Parameterized Constructor");
    }

    public String getCarName() {
        return carName;
    }

    public String getCarModel() {
        return carModel;
    }

    public int getCarPrice() {
        return carPrice;
    }
}
