public class Employee {
    String firstName;
    String lastName;
    int age;
    char gender;

    public Employee() {
        this.firstName = "Unknown";
        this.lastName = "Unknown";
        this.age = 25;
        this.gender ='M';
        System.out.println("Default Constructor Called");
    }
    public String getFirstName() {
        return firstName;
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
}
