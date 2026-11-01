
import java.util.*;

class Student {

    int id;
    String name;
    int marks;

    Student(int id, String name, int marks) {
        this.id = id;
        this.name = name;
        this.marks = marks;
    }

    @Override
    public String toString() {
        return id + " " + name + " " + marks;
    }
}

public class ComparatorDemo {

    public static void main(String[] args) {

        ArrayList<Student> students = new ArrayList<>();

        students.add(new Student(103, "Rahul", 85));
        students.add(new Student(101, "Sai", 95));
        students.add(new Student(105, "Priya", 72));
        students.add(new Student(102, "Arun", 90));

        // 1. Sort by marks ascending
        Comparator<Student> byMarks =
            (s1, s2) -> Integer.compare(s1.marks, s2.marks);

        Collections.sort(students, byMarks);

        System.out.println("Sorted by Marks:");
        students.forEach(System.out::println);

        // 2. Sort by marks descending
        Comparator<Student> byMarksDescending =
            (s1, s2) -> Integer.compare(s2.marks, s1.marks);

        students.sort(byMarksDescending);

        System.out.println("\nSorted by Marks Descending:");
        students.forEach(System.out::println);

        // 3. Sort alphabetically by name
        Comparator<Student> byName =
            (s1, s2) -> s1.name.compareTo(s2.name);

        students.sort(byName);

        System.out.println("\nSorted by Name:");
        students.forEach(System.out::println);

        // 4. Sort by ID
        Comparator<Student> byId =
            (s1, s2) -> Integer.compare(s1.id, s2.id);

        students.sort(byId);

        System.out.println("\nSorted by ID:");
        students.forEach(System.out::println);
    }
}
