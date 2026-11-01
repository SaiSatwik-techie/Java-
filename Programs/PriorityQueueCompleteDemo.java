
import java.util.*;

public class PriorityQueueCompleteDemo {

    public static void main(String[] args) {

        // 1. CREATING A MIN-HEAP

        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        System.out.println("Initial Min-Heap: " + minHeap);


        // 2. ADDING ELEMENTS

        minHeap.add(40);
        minHeap.add(10);
        minHeap.add(30);
        minHeap.add(20);

        System.out.println("\nMin-Heap: " + minHeap);


        // 3. ADDING USING OFFER()

        minHeap.offer(5);

        System.out.println("After offer(): " + minHeap);


        // 4. ACCESSING HIGHEST-PRIORITY ELEMENT

        System.out.println("\nHead element: " + minHeap.peek());


        // 5. REMOVING HIGHEST-PRIORITY ELEMENT

        System.out.println("Removed element: " + minHeap.poll());

        System.out.println("After poll(): " + minHeap);


        // 6. REMOVING A SPECIFIC ELEMENT

        minHeap.remove(30);

        System.out.println("\nAfter removing 30: " + minHeap);


        // 7. SEARCHING ELEMENTS

        System.out.println("\nContains 20: " + minHeap.contains(20));

        System.out.println("Contains 100: " + minHeap.contains(100));


        // 8. SIZE AND EMPTY CHECK

        System.out.println("\nSize: " + minHeap.size());

        System.out.println("Is empty: " + minHeap.isEmpty());


        // 9. TRAVERSAL USING ENHANCED FOR LOOP

        System.out.println("\nPriorityQueue traversal:");

        for (int num : minHeap) {
            System.out.println(num);
        }


        // 10. REMOVING ALL ELEMENTS IN PRIORITY ORDER

        PriorityQueue<Integer> copy = new PriorityQueue<>(minHeap);

        System.out.println("\nElements in priority order:");

        while (!copy.isEmpty()) {
            System.out.println(copy.poll());
        }


        // 11. CREATING A MAX-HEAP

        PriorityQueue<Integer> maxHeap =
            new PriorityQueue<>(Collections.reverseOrder());

        maxHeap.add(10);
        maxHeap.add(50);
        maxHeap.add(20);
        maxHeap.add(40);
        maxHeap.add(30);

        System.out.println("\nMax-Heap: " + maxHeap);

        System.out.println("Maximum element: " + maxHeap.peek());

        System.out.println("Removed maximum: " + maxHeap.poll());


        // 12. MAX-HEAP USING CUSTOM COMPARATOR

        PriorityQueue<Integer> customMaxHeap =
            new PriorityQueue<>((a, b) -> Integer.compare(b, a));

        customMaxHeap.add(15);
        customMaxHeap.add(45);
        customMaxHeap.add(25);

        System.out.println("\nCustom Max-Heap: " + customMaxHeap);


        // 13. PRIORITYQUEUE WITH STRINGS

        PriorityQueue<String> names = new PriorityQueue<>();

        names.add("Ravi");
        names.add("Arun");
        names.add("Kiran");
        names.add("Balu");

        System.out.println("\nString PriorityQueue: " + names);

        System.out.println("First name by natural order: " + names.peek());


        // 14. PRIORITYQUEUE WITH REVERSE STRING ORDER

        PriorityQueue<String> reverseNames =
            new PriorityQueue<>(Collections.reverseOrder());

        reverseNames.add("Ravi");
        reverseNames.add("Arun");
        reverseNames.add("Kiran");
        reverseNames.add("Balu");

        System.out.println("\nReverse String PriorityQueue:");

        while (!reverseNames.isEmpty()) {
            System.out.println(reverseNames.poll());
        }


        // 15. PRIORITYQUEUE WITH CUSTOM OBJECTS

        PriorityQueue<Student> students = new PriorityQueue<>(
            Comparator.comparingInt(s -> s.marks)
        );

        students.add(new Student("Sai", 85));
        students.add(new Student("Ravi", 65));
        students.add(new Student("Arun", 95));
        students.add(new Student("Kiran", 75));

        System.out.println("\nStudents ordered by marks:");

        while (!students.isEmpty()) {
            Student s = students.poll();

            System.out.println(s.name + " - " + s.marks);
        }


        // 16. REMOVING ALL ELEMENTS

        minHeap.clear();

        System.out.println("\nAfter clear(): " + minHeap);

        System.out.println("Is empty: " + minHeap.isEmpty());


        // 17. PRACTICAL EXAMPLE: TOP 3 LARGEST ELEMENTS

        int[] numbers = {12, 45, 7, 89, 34, 67, 23};

        int k = 3;

        PriorityQueue<Integer> topK = new PriorityQueue<>();

        for (int num : numbers) {

            topK.offer(num);

            if (topK.size() > k) {
                topK.poll();
            }
        }

        System.out.println("\nTop " + k + " largest elements:");

        System.out.println(topK);

        System.out.println("Largest element: " + topK.peek());

    }
}


class Student {

    String name;
    int marks;

    Student(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }
}
