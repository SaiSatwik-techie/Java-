
import java.util.*;

public class ArrayListCompleteDemo {

    public static void main(String[] args) {

        // 1. DIFFERENT WAYS OF CREATING ARRAYLISTS

        ArrayList<Integer> list1 = new ArrayList<>();

        ArrayList<Integer> list2 = new ArrayList<>(20);

        ArrayList<Integer> list3 = new ArrayList<>(
            Arrays.asList(10, 20, 30, 40, 50)
        );

        ArrayList<Integer> list4 = new ArrayList<>(list3);

        List<Integer> list5 = List.of(100, 200, 300);

        System.out.println("List 1: " + list1);
        System.out.println("List 2: " + list2);
        System.out.println("List 3: " + list3);
        System.out.println("List 4: " + list4);
        System.out.println("List 5: " + list5);


        // 2. ADDING ELEMENTS

        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(10);
        numbers.add(20);
        numbers.add(30);

        numbers.add(1, 15);

        System.out.println("\nAfter adding: " + numbers);


        // 3. ADDING MULTIPLE ELEMENTS

        numbers.addAll(Arrays.asList(40, 50, 60));

        System.out.println("After addAll: " + numbers);


        // 4. ACCESSING ELEMENTS

        System.out.println("\nFirst element: " + numbers.get(0));

        System.out.println("Last element: " +
            numbers.get(numbers.size() - 1));

        System.out.println("Size: " + numbers.size());


        // 5. UPDATING ELEMENTS

        numbers.set(1, 100);

        System.out.println("\nAfter updating: " + numbers);


        // 6. CHECKING ELEMENTS

        System.out.println("\nContains 30: " + numbers.contains(30));

        System.out.println("Index of 40: " + numbers.indexOf(40));

        System.out.println("Last index of 30: " +
            numbers.lastIndexOf(30));

        System.out.println("Is empty: " + numbers.isEmpty());


        // 7. TRAVERSING ARRAYLIST

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


        // 8. REMOVING ELEMENTS

        numbers.remove(0);

        System.out.println("\n\nAfter removing index 0: " + numbers);

        numbers.remove(Integer.valueOf(30));

        System.out.println("After removing value 30: " + numbers);


        // 9. REMOVING MULTIPLE ELEMENTS

        numbers.addAll(Arrays.asList(70, 80, 90));

        numbers.removeAll(Arrays.asList(40, 70));

        System.out.println("\nAfter removeAll: " + numbers);


        // 10. RETAINING COMMON ELEMENTS

        ArrayList<Integer> values = new ArrayList<>(
            Arrays.asList(10, 20, 30, 40, 50)
        );

        values.retainAll(Arrays.asList(20, 40, 60));

        System.out.println("\nAfter retainAll: " + values);


        // 11. SORTING

        ArrayList<Integer> sorting = new ArrayList<>(
            Arrays.asList(50, 10, 40, 20, 30)
        );

        Collections.sort(sorting);

        System.out.println("\nAscending order: " + sorting);

        Collections.sort(sorting, Collections.reverseOrder());

        System.out.println("Descending order: " + sorting);


        // 12. REVERSING

        Collections.reverse(sorting);

        System.out.println("After reversing: " + sorting);


        // 13. FINDING MAXIMUM AND MINIMUM

        System.out.println("\nMaximum: " + Collections.max(sorting));

        System.out.println("Minimum: " + Collections.min(sorting));


        // 14. SWAPPING ELEMENTS

        Collections.swap(sorting, 0, 2);

        System.out.println("\nAfter swapping: " + sorting);


        // 15. FREQUENCY OF AN ELEMENT

        ArrayList<Integer> duplicateList = new ArrayList<>(
            Arrays.asList(10, 20, 10, 30, 10, 20)
        );

        System.out.println("\nFrequency of 10: " +
            Collections.frequency(duplicateList, 10));


        // 16. COPYING AN ARRAYLIST

        ArrayList<Integer> original = new ArrayList<>(
            Arrays.asList(1, 2, 3, 4, 5)
        );

        ArrayList<Integer> copied = new ArrayList<>(original);

        System.out.println("\nOriginal: " + original);

        System.out.println("Copied: " + copied);


        // 17. SUBLIST

        List<Integer> sub = original.subList(1, 4);

        System.out.println("\nSublist: " + sub);


        // 18. CONVERTING ARRAYLIST TO ARRAY

        Integer[] array = original.toArray(new Integer[0]);

        System.out.println("\nConverted array: " +
            Arrays.toString(array));


        // 19. CONVERTING ARRAY TO ARRAYLIST

        Integer[] arr = {100, 200, 300};

        ArrayList<Integer> convertedList =
            new ArrayList<>(Arrays.asList(arr));

        System.out.println("Converted ArrayList: " + convertedList);


        // 20. ITERATOR REMOVAL

        Iterator<Integer> iterator = duplicateList.iterator();

        while (iterator.hasNext()) {

            if (iterator.next() == 10) {
                iterator.remove();
            }
        }

        System.out.println("\nAfter iterator removal: " + duplicateList);


        // 21. ENSURE CAPACITY AND TRIM TO SIZE

        ArrayList<Integer> capacityList = new ArrayList<>();

        capacityList.ensureCapacity(100);

        capacityList.add(10);
        capacityList.add(20);

        capacityList.trimToSize();

        System.out.println("\nCapacity list: " + capacityList);


        // 22. CLEARING ARRAYLIST

        copied.clear();

        System.out.println("\nAfter clear: " + copied);

        System.out.println("Is empty: " + copied.isEmpty());

    }
}
