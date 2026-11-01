
import java.util.*;

public class TreeSetCompleteDemo {

    public static void main(String[] args) {

        // 1. CREATING TREESET

        TreeSet<Integer> numbers = new TreeSet<>();

        TreeSet<Integer> set1 =
            new TreeSet<>(Arrays.asList(50, 20, 40, 10, 30));

        System.out.println("Initial Set: " + numbers);


        // 2. ADDING ELEMENTS

        numbers.add(40);
        numbers.add(10);
        numbers.add(30);
        numbers.add(20);

        System.out.println("\nAfter adding: " + numbers);


        // 3. DUPLICATE ELEMENTS

        System.out.println("\nAdding 20 again: " + numbers.add(20));

        System.out.println("After duplicate: " + numbers);


        // 4. ADDING MULTIPLE ELEMENTS

        numbers.addAll(Arrays.asList(60, 70, 50));

        System.out.println("\nAfter addAll(): " + numbers);


        // 5. BASIC METHODS

        System.out.println("\nContains 30: " + numbers.contains(30));

        System.out.println("Contains 100: " + numbers.contains(100));

        System.out.println("Size: " + numbers.size());

        System.out.println("Is empty: " + numbers.isEmpty());


        // 6. TRAVERSING IN ASCENDING ORDER

        System.out.println("\nAscending order:");

        for (int num : numbers) {
            System.out.println(num);
        }


        // 7. TRAVERSING IN DESCENDING ORDER

        System.out.println("\nDescending order:");

        Iterator<Integer> descending = numbers.descendingIterator();

        while (descending.hasNext()) {
            System.out.println(descending.next());
        }


        // 8. FIRST AND LAST ELEMENTS

        System.out.println("\nFirst element: " + numbers.first());

        System.out.println("Last element: " + numbers.last());


        // 9. REMOVING ELEMENTS

        numbers.remove(30);

        System.out.println("\nAfter removing 30: " + numbers);

        numbers.pollFirst();

        System.out.println("After pollFirst(): " + numbers);

        numbers.pollLast();

        System.out.println("After pollLast(): " + numbers);


        // 10. LOWER, FLOOR, CEILING, HIGHER

        TreeSet<Integer> values =
            new TreeSet<>(Arrays.asList(10, 20, 30, 40, 50));

        System.out.println("\nNavigation methods:");

        System.out.println("Lower than 30: " + values.lower(30));

        System.out.println("Floor of 30: " + values.floor(30));

        System.out.println("Ceiling of 30: " + values.ceiling(30));

        System.out.println("Higher than 30: " + values.higher(30));


        // 11. NAVIGATION WITH A MISSING VALUE

        System.out.println("\nFor value 35:");

        System.out.println("Lower: " + values.lower(35));

        System.out.println("Floor: " + values.floor(35));

        System.out.println("Ceiling: " + values.ceiling(35));

        System.out.println("Higher: " + values.higher(35));


        // 12. HEADSET

        System.out.println("\nHeadSet (< 30): " +
            values.headSet(30));

        System.out.println("HeadSet (inclusive): " +
            values.headSet(30, true));


        // 13. TAILSET

        System.out.println("\nTailSet (>= 30): " +
            values.tailSet(30));

        System.out.println("TailSet (exclusive): " +
            values.tailSet(30, false));


        // 14. SUBSET

        System.out.println("\nSubSet (20 to 40): " +
            values.subSet(20, 40));

        System.out.println("SubSet (inclusive bounds): " +
            values.subSet(20, true, 40, true));


        // 15. REVERSE ORDER TREESET

        TreeSet<Integer> reverseSet =
            new TreeSet<>(Collections.reverseOrder());

        reverseSet.addAll(Arrays.asList(10, 40, 20, 50, 30));

        System.out.println("\nReverse TreeSet: " + reverseSet);


        // 16. CUSTOM COMPARATOR - STRINGS BY LENGTH

        TreeSet<String> words = new TreeSet<>(
            Comparator.comparingInt(String::length)
        );

        words.add("Java");
        words.add("Python");
        words.add("C");
        words.add("JavaScript");

        System.out.println("\nWords by length: " + words);


        // 17. CUSTOM COMPARATOR - DESCENDING INTEGER ORDER

        TreeSet<Integer> descendingSet =
            new TreeSet<>((a, b) -> Integer.compare(b, a));

        descendingSet.addAll(Arrays.asList(10, 50, 20, 40, 30));

        System.out.println("\nCustom descending order: " + descendingSet);


        // 18. CONVERTING TO ARRAY

        Object[] arr = values.toArray();

        System.out.println("\nArray: " + Arrays.toString(arr));


        // 19. CONVERTING TO ARRAYLIST

        ArrayList<Integer> list = new ArrayList<>(values);

        System.out.println("ArrayList: " + list);


        // 20. UNION, INTERSECTION AND DIFFERENCE

        TreeSet<Integer> A =
            new TreeSet<>(Arrays.asList(10, 20, 30, 40));

        TreeSet<Integer> B =
            new TreeSet<>(Arrays.asList(30, 40, 50, 60));

        TreeSet<Integer> union = new TreeSet<>(A);
        union.addAll(B);

        TreeSet<Integer> intersection = new TreeSet<>(A);
        intersection.retainAll(B);

        TreeSet<Integer> difference = new TreeSet<>(A);
        difference.removeAll(B);

        System.out.println("\nUnion: " + union);

        System.out.println("Intersection: " + intersection);

        System.out.println("Difference (A - B): " + difference);


        // 21. CUSTOM OBJECTS

        TreeSet<Student> students = new TreeSet<>(
            Comparator.comparingInt(student -> student.id)
        );

        students.add(new Student(103, "Ravi"));
        students.add(new Student(101, "Sai"));
        students.add(new Student(102, "Kiran"));

        System.out.println("\nStudents sorted by ID:");

        for (Student student : students) {
            System.out.println(student);
        }


        // 22. CLEAR

        numbers.clear();

        System.out.println("\nAfter clear(): " + numbers);

        System.out.println("Is empty: " + numbers.isEmpty());

    }
}


class Student {

    int id;
    String name;

    Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return id + " - " + name;
    }
}
