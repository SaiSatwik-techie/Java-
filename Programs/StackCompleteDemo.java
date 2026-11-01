
import java.util.*;

public class StackCompleteDemo {

    public static void main(String[] args) {

        // 1. CREATING STACK

        Stack<Integer> stack = new Stack<>();

        System.out.println("Initial Stack: " + stack);


        // 2. PUSH - INSERT ELEMENTS

        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);

        System.out.println("\nAfter push: " + stack);


        // 3. PEEK - ACCESS TOP ELEMENT

        System.out.println("\nTop element: " + stack.peek());


        // 4. POP - REMOVE TOP ELEMENT

        System.out.println("Removed element: " + stack.pop());

        System.out.println("After pop: " + stack);


        // 5. CHECKING SIZE

        System.out.println("\nStack size: " + stack.size());


        // 6. CHECKING WHETHER STACK IS EMPTY

        System.out.println("Is empty: " + stack.empty());


        // 7. SEARCHING ELEMENTS

        System.out.println("\nPosition of 20: " + stack.search(20));

        System.out.println("Position of 100: " + stack.search(100));


        // 8. CHECKING ELEMENT EXISTENCE

        System.out.println("\nContains 30: " + stack.contains(30));


        // 9. TRAVERSING STACK

        System.out.println("\nTraversing Stack:");

        for (int num : stack) {
            System.out.println(num);
        }


        // 10. ACCESSING ELEMENTS USING INDEX

        System.out.println("\nElement at index 0: " + stack.get(0));

        System.out.println("Element at index 2: " + stack.get(2));


        // 11. UPDATING ELEMENTS

        stack.set(1, 200);

        System.out.println("\nAfter updating: " + stack);


        // 12. INSERTING AT SPECIFIC INDEX

        stack.add(1, 150);

        System.out.println("After inserting at index 1: " + stack);


        // 13. REMOVING ELEMENTS

        stack.remove(1);

        System.out.println("After removing index 1: " + stack);

        stack.remove(Integer.valueOf(30));

        System.out.println("After removing value 30: " + stack);


        // 14. ITERATING USING ITERATOR

        System.out.println("\nUsing Iterator:");

        Iterator<Integer> it = stack.iterator();

        while (it.hasNext()) {
            System.out.println(it.next());
        }


        // 15. DISPLAYING STACK IN REVERSE ORDER

        System.out.println("\nReverse Traversal:");

        for (int i = stack.size() - 1; i >= 0; i--) {
            System.out.println(stack.get(i));
        }


        // 16. SEARCHING MAXIMUM AND MINIMUM

        System.out.println("\nMaximum: " + Collections.max(stack));

        System.out.println("Minimum: " + Collections.min(stack));


        // 17. SORTING STACK

        Collections.sort(stack);

        System.out.println("\nSorted Stack: " + stack);


        // 18. REVERSING STACK

        Collections.reverse(stack);

        System.out.println("Reversed Stack: " + stack);


        // 19. CLEARING STACK

        stack.clear();

        System.out.println("\nAfter clear: " + stack);

        System.out.println("Is empty: " + stack.empty());


        // 20. STACK USING DEQUE - RECOMMENDED APPROACH

        Deque<Integer> dequeStack = new ArrayDeque<>();

        dequeStack.push(100);
        dequeStack.push(200);
        dequeStack.push(300);

        System.out.println("\nDeque Stack: " + dequeStack);

        System.out.println("Top: " + dequeStack.peek());

        System.out.println("Popped: " + dequeStack.pop());

        System.out.println("After pop: " + dequeStack);


        // 21. CHECKING EMPTY STACK SAFELY

        if (!dequeStack.isEmpty()) {
            System.out.println("\nTop element: " + dequeStack.peek());
        } else {
            System.out.println("\nStack is empty");
        }

    }
}


/* My recommendation: Don't just learn the built-in Stack class. 
Learn to implement a stack manually using an array and linked list. 
Interviewers often test whether you understand the data structure rather than just knowing its library methods. */