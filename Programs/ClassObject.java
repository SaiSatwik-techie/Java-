
class Student {
    String name;
    int rollNo;
    double marks;
}

public class ClassObject {
    public static void main(String[] args) {

        Student s1 = new Student();

        s1.name = "Satwik";
        s1.rollNo = 101;
        s1.marks = 89.5;

        Student s2 = new Student();

        s2.name = "Rahul";
        s2.rollNo = 102;
        s2.marks = 92.5;

        System.out.println("Student 1 Details:");
        System.out.println(s1.name);
        System.out.println(s1.rollNo);
        System.out.println(s1.marks);

        System.out.println("\nStudent 2 Details:");
        System.out.println(s2.name);
        System.out.println(s2.rollNo);
        System.out.println(s2.marks);
    }
}
