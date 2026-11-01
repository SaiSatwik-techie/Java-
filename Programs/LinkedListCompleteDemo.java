
import java.util.*;

public class LinkedListCompleteDemo {

    public static void main(String[] args) {

        // 1. DIFFERENT WAYS OF CREATING LINKEDLISTS

        LinkedList<Integer> list1 = new LinkedList<>();

        LinkedList<Integer> list2 = new LinkedList<>(
            Arrays.asList(10, 20, 30, 40, 50)
        );

        LinkedList<Integer> list3 = new LinkedList<>(list2);

        List<Integer> list4 = List.of(100, 200, 300);

        System.out.println("List 1: " + list1);
        System.out.println("List 2: " + list2);
        System.out.println("List 3: " + list3);
        System.out.println("List 4: " + list4);


        // 2. ADDING ELEMENTS

        LinkedList<Integer> numbers = new LinkedList<>();

        numbers.add(10);
        numbers.add(20);
        numbers.add(30);

        System.out.println("\nAfter add: " + numbers);


        // 3. ADDING ELEMENTS AT SPECIFIC POSITIONS

        numbers.addFirst(5);
        numbers.addLast(40);

        numbers.add(2, 15);

        System.out.println("After insertion: " + numbers);


        // 4. ADDING MULTIPLE ELEMENTS

        numbers.addAll(Arrays.asList(50, 60, 70));

        System.out.println("After addAll: " + numbers);


        // 5. ACCESSING ELEMENTS

        System.out.println("\nFirst element: " + numbers.getFirst());

        System.out.println("Last element: " + numbers.getLast());

        System.out.println("Element at index 2: " + numbers.get(2));

        System.out.println("Size: " + numbers.size());


        // 6. UPDATING ELEMENTS

        numbers.set(1, 100);

        System.out.println("\nAfter updating: " + numbers);


        // 7. CHECKING ELEMENTS

        System.out.println("\nContains 30: " + numbers.contains(30));

        System.out.println("Index of 40: " + numbers.indexOf(40));

        System.out.println("Last index of 30: " +
            numbers.lastIndexOf(30));

        System.out.println("Is empty: " + numbers.isEmpty());


        // 8. TRAVERSING LINKEDLIST

        System.out.println("\nTraditional for loop:");

        for (int i = 0; i < numbers.size(); i++) {
            System.out.print(numbers.get(i) + " ");
        }

        System.out.println("\nEnhanced for loop:");

        for (int num : numbers) {
            System.out.print(num + " ");
        }

        System.out.println("\nUsing Iterator:");

        Iterator<Integer> it = numbers.iterator();

        while (it.hasNext()) {
            System.out.print(it.next() + " ");
        }

        System.out.println("\nUsing Descending Iterator:");

        Iterator<Integer> reverseIt = numbers.descendingIterator();

        while (reverseIt.hasNext()) {
            System.out.print(reverseIt.next() + " ");
        }


        // 9. REMOVING ELEMENTS

        numbers.removeFirst();

        System.out.println("\n\nAfter removeFirst: " + numbers);

        numbers.removeLast();

        System.out.println("After removeLast: " + numbers);

        numbers.remove(1);

        System.out.println("After removing index 1: " + numbers);

        numbers.remove(Integer.valueOf(30));

        System.out.println("After removing value 30: " + numbers);


        // 10. REMOVING MULTIPLE ELEMENTS

        numbers.addAll(Arrays.asList(70, 80, 90));

        numbers.removeAll(Arrays.asList(40, 70));

        System.out.println("\nAfter removeAll: " + numbers);


        // 11. RETAINING COMMON ELEMENTS

        LinkedList<Integer> values = new LinkedList<>(
            Arrays.asList(10, 20, 30, 40, 50)
        );

        values.retainAll(Arrays.asList(20, 40, 60));

        System.out.println("\nAfter retainAll: " + values);


        // 12. SORTING

        LinkedList<Integer> sorting = new LinkedList<>(
            Arrays.asList(50, 10, 40, 20, 30)
        );

        Collections.sort(sorting);

        System.out.println("\nAscending: " + sorting);

        Collections.sort(sorting, Collections.reverseOrder());

        System.out.println("Descending: " + sorting);


        // 13. REVERSING

        Collections.reverse(sorting);

        System.out.println("After reversing: " + sorting);


        // 14. MAXIMUM AND MINIMUM

        System.out.println("\nMaximum: " + Collections.max(sorting));

        System.out.println("Minimum: " + Collections.min(sorting));


        // 15. SWAPPING ELEMENTS

        Collections.swap(sorting, 0, 2);

        System.out.println("\nAfter swapping: " + sorting);


        // 16. FREQUENCY OF ELEMENTS

        LinkedList<Integer> duplicateList = new LinkedList<>(
            Arrays.asList(10, 20, 10, 30, 10, 20)
        );

        System.out.println("\nFrequency of 10: " +
            Collections.frequency(duplicateList, 10));


        // 17. COPYING A LINKEDLIST

        LinkedList<Integer> original = new LinkedList<>(
            Arrays.asList(1, 2, 3, 4, 5)
        );

        LinkedList<Integer> copied = new LinkedList<>(original);

        System.out.println("\nOriginal: " + original);

        System.out.println("Copied: " + copied);


        // 18. SUBLIST

        List<Integer> sub = original.subList(1, 4);

        System.out.println("\nSublist: " + sub);


        // 19. CONVERTING LINKEDLIST TO ARRAY

        Integer[] array = original.toArray(new Integer[0]);

        System.out.println("\nConverted array: " +
            Arrays.toString(array));


        // 20. CONVERTING ARRAY TO LINKEDLIST

        Integer[] arr = {100, 200, 300};

        LinkedList<Integer> convertedList =
            new LinkedList<>(Arrays.asList(arr));

        System.out.println("Converted LinkedList: " + convertedList);


        // 21. ITERATOR REMOVAL

        Iterator<Integer> iterator = duplicateList.iterator();

        while (iterator.hasNext()) {

            if (iterator.next() == 10) {
                iterator.remove();
            }
        }

        System.out.println("\nAfter iterator removal: " + duplicateList);


        // 22. QUEUE OPERATIONS

        LinkedList<Integer> queue = new LinkedList<>();

        queue.offer(10);
        queue.offer(20);
        queue.offer(30);

        System.out.println("\nQueue: " + queue);

        System.out.println("Queue front: " + queue.peek());

        System.out.println("Removed front: " + queue.poll());

        System.out.println("Queue after poll: " + queue);


        // 23. DEQUE OPERATIONS

        LinkedList<Integer> deque = new LinkedList<>();

        deque.offerFirst(20);
        deque.offerFirst(10);
        deque.offerLast(30);
        deque.offerLast(40);

        System.out.println("\nDeque: " + deque);

        System.out.println("First: " + deque.peekFirst());

        System.out.println("Last: " + deque.peekLast());

        deque.pollFirst();
        deque.pollLast();

        System.out.println("After removing both ends: " + deque);


        // 24. STACK-LIKE OPERATIONS

        LinkedList<Integer> stack = new LinkedList<>();

        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println("\nStack: " + stack);

        System.out.println("Top element: " + stack.peek());

        System.out.println("Popped element: " + stack.pop());

        System.out.println("Stack after pop: " + stack);


        // 25. CLEARING LINKEDLIST

        copied.clear();

        System.out.println("\nAfter clear: " + copied);

        System.out.println("Is empty: " + copied.isEmpty());

    }
}
