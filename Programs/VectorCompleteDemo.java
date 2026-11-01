
import java.util.*;

public class VectorCompleteDemo {

    public static void main(String[] args) {

        // 1. CREATING VECTORS

        Vector<Integer> numbers = new Vector<>();

        Vector<Integer> v1 = new Vector<>(10);

        Vector<Integer> v2 = new Vector<>(10, 5);

        Vector<Integer> v3 = new Vector<>(
            Arrays.asList(100, 200, 300)
        );

        Vector<Integer> v4 = new Vector<>(v3);

        System.out.println("Initial Vector: " + numbers);


        // 2. ADDING ELEMENTS

        numbers.add(10);
        numbers.add(20);
        numbers.add(30);

        System.out.println("\nAfter add: " + numbers);


        // 3. ADDING ELEMENT AT SPECIFIC INDEX

        numbers.add(1, 15);

        System.out.println("After add(index): " + numbers);


        // 4. ADDING ELEMENTS USING addElement()

        numbers.addElement(40);

        System.out.println("After addElement: " + numbers);


        // 5. ADDING MULTIPLE ELEMENTS

        numbers.addAll(Arrays.asList(50, 60, 70));

        System.out.println("After addAll: " + numbers);


        // 6. INSERTING ELEMENT USING insertElementAt()

        numbers.insertElementAt(25, 3);

        System.out.println("After insertElementAt: " + numbers);


        // 7. ACCESSING ELEMENTS

        System.out.println("\nElement at index 0: " + numbers.get(0));

        System.out.println("Element at index 2: " + numbers.elementAt(2));

        System.out.println("First element: " + numbers.firstElement());

        System.out.println("Last element: " + numbers.lastElement());


        // 8. GETTING SIZE AND CAPACITY

        System.out.println("\nSize: " + numbers.size());

        System.out.println("Capacity: " + numbers.capacity());


        // 9. UPDATING ELEMENTS

        numbers.set(0, 100);

        System.out.println("\nAfter set: " + numbers);


        // 10. REPLACING ELEMENT USING setElementAt()

        numbers.setElementAt(200, 1);

        System.out.println("After setElementAt: " + numbers);


        // 11. SEARCHING ELEMENTS

        System.out.println("\nContains 30: " + numbers.contains(30));

        System.out.println("Index of 30: " + numbers.indexOf(30));

        System.out.println("Last index of 30: " + numbers.lastIndexOf(30));

        System.out.println("Index of 999: " + numbers.indexOf(999));


        // 12. CHECKING WHETHER VECTOR IS EMPTY

        System.out.println("\nIs empty: " + numbers.isEmpty());


        // 13. TRAVERSING USING NORMAL FOR LOOP

        System.out.println("\nUsing for loop:");

        for (int i = 0; i < numbers.size(); i++) {
            System.out.println(numbers.get(i));
        }


        // 14. TRAVERSING USING ENHANCED FOR LOOP

        System.out.println("\nUsing enhanced for:");

        for (int num : numbers) {
            System.out.println(num);
        }


        // 15. TRAVERSING USING ENUMERATION

        System.out.println("\nUsing Enumeration:");

        Enumeration<Integer> e = numbers.elements();

        while (e.hasMoreElements()) {
            System.out.println(e.nextElement());
        }


        // 16. TRAVERSING USING ITERATOR

        System.out.println("\nUsing Iterator:");

        Iterator<Integer> it = numbers.iterator();

        while (it.hasNext()) {
            System.out.println(it.next());
        }


        // 17. TRAVERSING USING LISTITERATOR

        System.out.println("\nUsing ListIterator:");

        ListIterator<Integer> listIt = numbers.listIterator();

        while (listIt.hasNext()) {
            System.out.println(listIt.next());
        }


        // 18. REMOVING ELEMENT BY INDEX

        numbers.remove(0);

        System.out.println("\nAfter remove(index): " + numbers);


        // 19. REMOVING ELEMENT BY VALUE

        numbers.remove(Integer.valueOf(30));

        System.out.println("After remove(value): " + numbers);


        // 20. REMOVING USING removeElement()

        numbers.removeElement(40);

        System.out.println("After removeElement: " + numbers);


        // 21. REMOVING FIRST AND LAST ELEMENTS

        numbers.removeElementAt(0);

        System.out.println("After removeElementAt: " + numbers);


        // 22. REMOVING FIRST AND LAST ELEMENT

        numbers.remove(0);

        numbers.remove(numbers.size() - 1);

        System.out.println("After removing first and last: " + numbers);


        // 23. REMOVING MULTIPLE ELEMENTS

        numbers.addAll(Arrays.asList(10, 20, 30, 40, 50));

        numbers.removeAll(Arrays.asList(20, 40));

        System.out.println("\nAfter removeAll: " + numbers);


        // 24. RETAINING COMMON ELEMENTS

        numbers.retainAll(Arrays.asList(10, 50));

        System.out.println("After retainAll: " + numbers);


        // 25. SORTING

        Vector<Integer> sorting = new Vector<>(
            Arrays.asList(50, 10, 40, 20, 30)
        );

        Collections.sort(sorting);

        System.out.println("\nAscending order: " + sorting);

        Collections.sort(sorting, Collections.reverseOrder());

        System.out.println("Descending order: " + sorting);


        // 26. REVERSING

        Collections.reverse(sorting);

        System.out.println("After reverse: " + sorting);


        // 27. MAXIMUM AND MINIMUM

        System.out.println("\nMaximum: " + Collections.max(sorting));

        System.out.println("Minimum: " + Collections.min(sorting));


        // 28. SWAPPING ELEMENTS

        Collections.swap(sorting, 0, 2);

        System.out.println("After swap: " + sorting);


        // 29. FREQUENCY

        Vector<Integer> duplicate = new Vector<>(
            Arrays.asList(10, 20, 10, 30, 10, 20)
        );

        System.out.println("\nFrequency of 10: " +
            Collections.frequency(duplicate, 10));


        // 30. SUBLIST

        List<Integer> sub = duplicate.subList(1, 4);

        System.out.println("Sublist: " + sub);


        // 31. CONVERTING VECTOR TO ARRAY

        Object[] arr = duplicate.toArray();

        System.out.println("\nArray: " + Arrays.toString(arr));


        // 32. CONVERTING ARRAY TO VECTOR

        Integer[] values = {100, 200, 300};

        Vector<Integer> fromArray = new Vector<>(
            Arrays.asList(values)
        );

        System.out.println("From array: " + fromArray);


        // 33. CAPACITY MANAGEMENT

        Vector<Integer> capacityDemo = new Vector<>(5);

        capacityDemo.add(10);
        capacityDemo.add(20);
        capacityDemo.add(30);

        System.out.println("\nBefore ensureCapacity: " +
            capacityDemo.capacity());

        capacityDemo.ensureCapacity(20);

        System.out.println("After ensureCapacity: " +
            capacityDemo.capacity());

        capacityDemo.trimToSize();

        System.out.println("After trimToSize: " +
            capacityDemo.capacity());


        // 34. SETTING SIZE

        capacityDemo.setSize(5);

        System.out.println("\nAfter setSize(5): " + capacityDemo);


        // 35. CLONING VECTOR

        Vector<Integer> cloned = (Vector<Integer>) duplicate.clone();

        System.out.println("\nCloned Vector: " + cloned);


        // 36. CLEARING VECTOR

        duplicate.clear();

        System.out.println("\nAfter clear: " + duplicate);

        System.out.println("Is empty: " + duplicate.isEmpty());

    }
}
