
import java.util.*;

class Student implements Comparable<Student> {

    int id;
    String name;
    int marks;

    Student(int id, String name, int marks) {
        this.id = id;
        this.name = name;
        this.marks = marks;
    }

    // Natural ordering: ascending marks
    @Override
    public int compareTo(Student other) {
        return Integer.compare(this.marks, other.marks);
    }

    @Override
    public String toString() {
        return id + " " + name + " " + marks;
    }
}

public class ComparableDemo {

    public static void main(String[] args) {

        ArrayList<Student> students = new ArrayList<>();

        students.add(new Student(103, "Rahul", 85));
        students.add(new Student(101, "Sai", 95));
        students.add(new Student(105, "Priya", 72));
        students.add(new Student(102, "Arun", 90));

        System.out.println("Before Sorting:");
        System.out.println(students);

        Collections.sort(students);

        System.out.println("\nAfter Sorting by Marks:");
        for (Student s : students) {
            System.out.println(s);
        }
    }
}
