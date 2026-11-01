
import java.util.*;

public class TreeMapCompleteDemo {

    public static void main(String[] args) {

        TreeMap<Integer, String> map = new TreeMap<>();

        // 1. Insertion
        map.put(103, "Rahul");
        map.put(101, "Sai");
        map.put(105, "Priya");
        map.put(102, "Arun");
        map.put(104, "Kiran");

        System.out.println("Original Map: " + map);

        // 2. Updating an existing key
        map.put(101, "Satwik");
        System.out.println("After Update: " + map);

        // 3. Accessing values
        System.out.println("Value at 103: " + map.get(103));
        System.out.println("Missing Key: " +
                map.getOrDefault(110, "Not Found"));

        // 4. Checking
        System.out.println("Contains Key 102: " +
                map.containsKey(102));
        System.out.println("Contains Value Sai: " +
                map.containsValue("Sai"));

        // 5. Size and empty check
        System.out.println("Size: " + map.size());
        System.out.println("Is Empty: " + map.isEmpty());

        // 6. First and last
        System.out.println("First Key: " + map.firstKey());
        System.out.println("Last Key: " + map.lastKey());
        System.out.println("First Entry: " + map.firstEntry());
        System.out.println("Last Entry: " + map.lastEntry());

        // 7. Navigation methods
        System.out.println("Lower Key of 103: " + map.lowerKey(103));
        System.out.println("Floor Key of 103: " + map.floorKey(103));
        System.out.println("Ceiling Key of 103: " + map.ceilingKey(103));
        System.out.println("Higher Key of 103: " + map.higherKey(103));

        System.out.println("Lower Entry: " + map.lowerEntry(103));
        System.out.println("Ceiling Entry: " + map.ceilingEntry(103));

        // 8. Range views
        System.out.println("Head Map: " + map.headMap(103));
        System.out.println("Tail Map: " + map.tailMap(103));
        System.out.println("Sub Map: " + map.subMap(102, 105));

        // 9. Descending order
        System.out.println("Descending Map: " + map.descendingMap());
        System.out.println("Descending Keys: " + map.descendingKeySet());

        // 10. Traversal using entrySet
        System.out.println("\nEntry Traversal:");

        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println(
                entry.getKey() + " : " + entry.getValue()
            );
        }

        // 11. Traversal using keySet
        System.out.println("\nKeys:");

        for (Integer key : map.keySet()) {
            System.out.println(key);
        }

        // 12. Traversal using values
        System.out.println("\nValues:");

        for (String value : map.values()) {
            System.out.println(value);
        }

        // 13. Conditional insertion
        map.putIfAbsent(106, "Ravi");

        // 14. Replace
        map.replace(102, "Arun Kumar");

        // 15. Remove
        map.remove(105);

        // 16. Remove smallest entry
        System.out.println("Removed First: " + map.pollFirstEntry());

        // 17. Remove largest entry
        System.out.println("Removed Last: " + map.pollLastEntry());

        // 18. Custom descending order
        TreeMap<Integer, String> descending =
                new TreeMap<>(Collections.reverseOrder());

        descending.putAll(map);

        System.out.println("Custom Descending: " + descending);

        // 19. Copy
        TreeMap<Integer, String> copy = new TreeMap<>(map);

        System.out.println("Copied Map: " + copy);

        // 20. Convert to ArrayList
        ArrayList<Integer> keys = new ArrayList<>(map.keySet());
        ArrayList<String> values = new ArrayList<>(map.values());

        System.out.println("Keys List: " + keys);
        System.out.println("Values List: " + values);

        // 21. Clear
        map.clear();

        System.out.println("After Clear: " + map);
    }
}
