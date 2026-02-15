package ConstructorChaining;

public class Employee {
    String firstName;
    String lastName;
    int age;
    char gender;
    public Employee() {
//        this.firstName="Unknown";
//        this.lastName="Unknown";
//        this.age=25;
//        this.gender='M';
        this("Mani Babu","Miriyala",25,'M');
        System.out.println("Default Constructor Called");
    }

    public Employee(String firstName, String lastName, int age, char gender){
        this.firstName=firstName;
        this.lastName=lastName;
        this.age=age;
        this.gender=gender;
        System.out.println("Overloaded Constructor Called");
    }

    public String getLastName() {
        return lastName;
    }

    public char getGender() {
        return gender;
    }
    public int getAge() {
        return age;
    }
    public String getFirstName() {
        return firstName;
    }
}
