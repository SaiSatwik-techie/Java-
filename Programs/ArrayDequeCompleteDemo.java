
import java.util.*;

public class ArrayDequeCompleteDemo {

    public static void main(String[] args) {

        // 1. CREATING ARRAYDEQUE

        ArrayDeque<Integer> deque = new ArrayDeque<>();

        ArrayDeque<Integer> d1 = new ArrayDeque<>(20);

        ArrayDeque<Integer> d2 = new ArrayDeque<>(
            Arrays.asList(10, 20, 30)
        );

        System.out.println("Initial Deque: " + deque);


        // 2. INSERTING ELEMENTS AT THE END

        deque.add(10);
        deque.add(20);
        deque.add(30);

        System.out.println("\nAfter add(): " + deque);


        // 3. INSERTING AT FRONT AND REAR

        deque.addFirst(5);
        deque.addLast(40);

        System.out.println("After addFirst/addLast: " + deque);


        // 4. OFFER OPERATIONS

        deque.offerFirst(1);
        deque.offerLast(50);

        System.out.println("After offer operations: " + deque);


        // 5. ACCESSING FIRST AND LAST ELEMENTS

        System.out.println("\nFirst element: " + deque.getFirst());

        System.out.println("Last element: " + deque.getLast());


        // 6. PEEK OPERATIONS

        System.out.println("\npeek(): " + deque.peek());

        System.out.println("peekFirst(): " + deque.peekFirst());

        System.out.println("peekLast(): " + deque.peekLast());


        // 7. CHECKING SIZE AND EMPTY STATUS

        System.out.println("\nSize: " + deque.size());

        System.out.println("Is empty: " + deque.isEmpty());


        // 8. SEARCHING ELEMENTS

        System.out.println("\nContains 20: " + deque.contains(20));

        System.out.println("Contains 100: " + deque.contains(100));


        // 9. TRAVERSING USING FOR-EACH

        System.out.println("\nForward Traversal:");

        for (int num : deque) {
            System.out.println(num);
        }


        // 10. TRAVERSING USING DESCENDING ITERATOR

        System.out.println("\nReverse Traversal:");

        Iterator<Integer> reverse = deque.descendingIterator();

        while (reverse.hasNext()) {
            System.out.println(reverse.next());
        }


        // 11. TRAVERSING USING ITERATOR

        System.out.println("\nUsing Iterator:");

        Iterator<Integer> it = deque.iterator();

        while (it.hasNext()) {
            System.out.println(it.next());
        }


        // 12. REMOVING FIRST AND LAST ELEMENTS

        deque.removeFirst();

        System.out.println("\nAfter removeFirst(): " + deque);

        deque.removeLast();

        System.out.println("After removeLast(): " + deque);


        // 13. POLL OPERATIONS

        System.out.println("\nRemoved first: " + deque.pollFirst());

        System.out.println("Removed last: " + deque.pollLast());

        System.out.println("After poll operations: " + deque);


        // 14. REMOVE SPECIFIC ELEMENT

        deque.remove(20);

        System.out.println("\nAfter remove(20): " + deque);


        // 15. REMOVE FIRST/LAST OCCURRENCE

        deque.addAll(Arrays.asList(10, 20, 10, 30, 10));

        System.out.println("\nBefore occurrence removal: " + deque);

        deque.removeFirstOccurrence(10);

        System.out.println("After removeFirstOccurrence: " + deque);

        deque.removeLastOccurrence(10);

        System.out.println("After removeLastOccurrence: " + deque);


        // 16. ADDING MULTIPLE ELEMENTS

        deque.addAll(Arrays.asList(100, 200, 300));

        System.out.println("\nAfter addAll(): " + deque);


        // 17. REMOVE ALL MATCHING ELEMENTS

        deque.removeAll(Arrays.asList(100, 300));

        System.out.println("After removeAll(): " + deque);


        // 18. RETAIN COMMON ELEMENTS

        deque.retainAll(Arrays.asList(20, 200));

        System.out.println("After retainAll(): " + deque);


        // 19. CLEARING DEQUE

        deque.clear();

        System.out.println("\nAfter clear(): " + deque);

        System.out.println("Is empty: " + deque.isEmpty());


        // 20. USING ARRAYDEQUE AS A STACK

        Deque<Integer> stack = new ArrayDeque<>();

        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println("\nStack: " + stack);

        System.out.println("Stack top: " + stack.peek());

        System.out.println("Stack pop: " + stack.pop());

        System.out.println("After pop: " + stack);


        // 21. USING ARRAYDEQUE AS A QUEUE

        Deque<Integer> queue = new ArrayDeque<>();

        queue.offer(100);
        queue.offer(200);
        queue.offer(300);

        System.out.println("\nQueue: " + queue);

        System.out.println("Queue front: " + queue.peek());

        System.out.println("Queue remove: " + queue.poll());

        System.out.println("After poll: " + queue);


        // 22. USING ARRAYDEQUE AS A DOUBLE-ENDED QUEUE

        Deque<Integer> doubleEnded = new ArrayDeque<>();

        doubleEnded.offerFirst(10);
        doubleEnded.offerLast(20);
        doubleEnded.offerFirst(5);
        doubleEnded.offerLast(30);

        System.out.println("\nDouble-ended Queue: " + doubleEnded);

        System.out.println("Remove front: " + doubleEnded.pollFirst());

        System.out.println("Remove rear: " + doubleEnded.pollLast());

        System.out.println("Final Deque: " + doubleEnded);


        // 23. CLONING ARRAYDEQUE

        ArrayDeque<Integer> original = new ArrayDeque<>(
            Arrays.asList(1, 2, 3)
        );

        ArrayDeque<Integer> cloned = original.clone();

        System.out.println("\nOriginal: " + original);

        System.out.println("Cloned: " + cloned);

    }
}
