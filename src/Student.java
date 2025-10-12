public class Student {
    String firstName;
    String lastName;
    int age;

    char gender;
    public Student() {
        this.firstName = "Unknown";
        this.lastName = "Unknown";
        this.age = 18;
        this.gender = 'M';
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
