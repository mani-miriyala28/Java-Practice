package ConstructorOverloading;

public class EmployeeMain {
    public static void main(String[] args) {
        Employee emp = new Employee();
        Employee emp1=new Employee("Mani Babu","Miriyala",24,'M');

        System.out.println("emp1 Details:"+emp1.getAge());

        System.out.println(emp.getFirstName());

    }
}
