
import java.util.*;

public class LinkedHashSetCompleteDemo {

    public static void main(String[] args) {

        // 1. CREATING LINKEDHASHSETS

        LinkedHashSet<Integer> numbers = new LinkedHashSet<>();

        LinkedHashSet<Integer> set1 = new LinkedHashSet<>(20);

        LinkedHashSet<Integer> set2 =
            new LinkedHashSet<>(20, 0.75f);

        LinkedHashSet<Integer> set3 = new LinkedHashSet<>(
            Arrays.asList(100, 200, 300)
        );

        System.out.println("Initial Set: " + numbers);


        // 2. ADDING ELEMENTS

        numbers.add(30);
        numbers.add(10);
        numbers.add(20);
        numbers.add(40);

        System.out.println("\nAfter adding: " + numbers);


        // 3. ADDING DUPLICATE ELEMENTS

        System.out.println("\nAdding 10 again: " + numbers.add(10));

        System.out.println("Adding 50: " + numbers.add(50));

        System.out.println("After duplicate insertion: " + numbers);


        // 4. ADDING MULTIPLE ELEMENTS

        numbers.addAll(Arrays.asList(60, 70, 80, 20));

        System.out.println("\nAfter addAll(): " + numbers);


        // 5. CHECKING ELEMENT EXISTENCE

        System.out.println("\nContains 30: " + numbers.contains(30));

        System.out.println("Contains 100: " + numbers.contains(100));


        // 6. CHECKING SIZE AND EMPTY STATUS

        System.out.println("\nSize: " + numbers.size());

        System.out.println("Is empty: " + numbers.isEmpty());


        // 7. TRAVERSING USING ENHANCED FOR LOOP

        System.out.println("\nUsing enhanced for loop:");

        for (int num : numbers) {
            System.out.println(num);
        }


        // 8. TRAVERSING USING ITERATOR

        System.out.println("\nUsing Iterator:");

        Iterator<Integer> it = numbers.iterator();

        while (it.hasNext()) {
            System.out.println(it.next());
        }


        // 9. REMOVING ELEMENTS

        numbers.remove(20);

        System.out.println("\nAfter removing 20: " + numbers);


        // 10. REMOVING MULTIPLE ELEMENTS

        numbers.removeAll(Arrays.asList(40, 60));

        System.out.println("After removeAll(): " + numbers);


        // 11. RETAINING COMMON ELEMENTS

        numbers.retainAll(Arrays.asList(30, 50, 70));

        System.out.println("After retainAll(): " + numbers);


        // 12. REMOVING USING ITERATOR

        LinkedHashSet<Integer> iteratorSet =
            new LinkedHashSet<>(Arrays.asList(10, 20, 30, 40, 50));

        Iterator<Integer> iterator = iteratorSet.iterator();

        while (iterator.hasNext()) {

            int value = iterator.next();

            if (value % 2 == 0) {
                iterator.remove();
            }
        }

        System.out.println("\nAfter removing even numbers: " + iteratorSet);


        // 13. REMOVING USING removeIf()

        LinkedHashSet<Integer> removeIfSet =
            new LinkedHashSet<>(Arrays.asList(1, 2, 3, 4, 5, 6));

        removeIfSet.removeIf(num -> num > 3);

        System.out.println("After removeIf(): " + removeIfSet);


        // 14. UNION OF TWO SETS

        LinkedHashSet<Integer> A =
            new LinkedHashSet<>(Arrays.asList(10, 20, 30, 40));

        LinkedHashSet<Integer> B =
            new LinkedHashSet<>(Arrays.asList(30, 40, 50, 60));

        LinkedHashSet<Integer> union = new LinkedHashSet<>(A);

        union.addAll(B);

        System.out.println("\nUnion: " + union);


        // 15. INTERSECTION OF TWO SETS

        LinkedHashSet<Integer> intersection = new LinkedHashSet<>(A);

        intersection.retainAll(B);

        System.out.println("Intersection: " + intersection);


        // 16. DIFFERENCE OF TWO SETS

        LinkedHashSet<Integer> difference = new LinkedHashSet<>(A);

        difference.removeAll(B);

        System.out.println("Difference (A - B): " + difference);


        // 17. CHECKING SET RELATIONSHIPS

        System.out.println("\nA contains all elements of B: " +
            A.containsAll(B));

        System.out.println("A equals B: " + A.equals(B));


        // 18. CONVERTING LINKEDHASHSET TO ARRAY

        Object[] arr = A.toArray();

        System.out.println("\nArray: " + Arrays.toString(arr));


        // 19. CONVERTING ARRAY TO LINKEDHASHSET

        Integer[] values = {100, 200, 300, 100, 200};

        LinkedHashSet<Integer> fromArray =
            new LinkedHashSet<>(Arrays.asList(values));

        System.out.println("From array: " + fromArray);


        // 20. CONVERTING TO ARRAYLIST

        ArrayList<Integer> list = new ArrayList<>(A);

        System.out.println("\nArrayList: " + list);


        // 21. SORTING WITHOUT CHANGING ORIGINAL SET

        ArrayList<Integer> sortedList = new ArrayList<>(A);

        Collections.sort(sortedList);

        System.out.println("Sorted elements: " + sortedList);

        System.out.println("Original LinkedHashSet: " + A);


        // 22. LINKEDHASHSET WITH STRINGS

        LinkedHashSet<String> languages = new LinkedHashSet<>();

        languages.add("Java");
        languages.add("Python");
        languages.add("C");
        languages.add("Java");

        System.out.println("\nLanguages: " + languages);


        // 23. CASE-SENSITIVE STRINGS

        languages.add("java");

        System.out.println("After adding lowercase java: " + languages);


        // 24. LINKEDHASHSET WITH NULL

        LinkedHashSet<Integer> nullSet = new LinkedHashSet<>();

        nullSet.add(null);
        nullSet.add(10);
        nullSet.add(null);

        System.out.println("\nSet with null: " + nullSet);


        // 25. COPYING LINKEDHASHSET

        LinkedHashSet<Integer> original =
            new LinkedHashSet<>(Arrays.asList(1, 2, 3));

        LinkedHashSet<Integer> copied =
            new LinkedHashSet<>(original);

        System.out.println("\nOriginal: " + original);

        System.out.println("Copied: " + copied);


        // 26. LINKEDHASHSET WITH CUSTOM OBJECTS

        LinkedHashSet<Student> students = new LinkedHashSet<>();

        students.add(new Student(101, "Sai"));
        students.add(new Student(102, "Ravi"));
        students.add(new Student(101, "Sai Duplicate"));

        System.out.println("\nStudents:");

        for (Student student : students) {
            System.out.println(student);
        }

        System.out.println("Total students: " + students.size());


        // 27. CLEARING LINKEDHASHSET

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
    public boolean equals(Object obj) {

        if (this == obj) {
            return true;
        }

        if (!(obj instanceof Student)) {
            return false;
        }

        Student other = (Student) obj;

        return this.id == other.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return id + " - " + name;
    }
}
