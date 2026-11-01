
// Parent class
class Employee {

    private int salary = 30000;
    int age = 21;
    protected String department = "CSE";
    public String name = "Sai";

    // Private member can be accessed inside its own class
    void displayPrivateSalary() {
        System.out.println("Private Salary: " + salary);
    }
}

// Child class in the same package
class Developer extends Employee {

    void displayDetails() {

        // Private members cannot be accessed directly
        // System.out.println(salary);

        // Default member: accessible in the same package
        System.out.println("Age: " + age);

        // Protected member: accessible in child class
        System.out.println("Department: " + department);

        // Public member: accessible everywhere
        System.out.println("Name: " + name);
    }
}

public class AccessModifiersDemo {

    public static void main(String[] args) {

        Employee emp = new Employee();

        // Accessing private member through its own class method
        emp.displayPrivateSalary();

        // Default access
        System.out.println("Age: " + emp.age);

        // Protected access (same package)
        System.out.println("Department: " + emp.department);

        // Public access
        System.out.println("Name: " + emp.name);

        System.out.println("-------------------");

        Developer dev = new Developer();
        dev.displayDetails();
    }
}
