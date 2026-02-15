package IIB;

public class Car {
    String carName;
    String carModel;
    int carPrice;

    {
        carName="Unknown";
        carModel="Unknown";
        carPrice=0;
        System.out.println("IIB Block");
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
