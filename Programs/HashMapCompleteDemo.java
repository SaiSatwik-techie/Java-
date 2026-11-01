
import java.util.*;

public class HashMapCompleteDemo {

    public static void main(String[] args) {

        // 1. CREATING HASHMAP

        HashMap<Integer, String> students = new HashMap<>();

        HashMap<Integer, String> map1 = new HashMap<>(20);

        HashMap<Integer, String> map2 =
            new HashMap<>(20, 0.75f);

        HashMap<Integer, String> map3 =
            new HashMap<>(Map.of(1, "Java", 2, "Python"));

        System.out.println("Initial Map: " + students);


        // 2. ADDING KEY-VALUE PAIRS

        students.put(101, "Sai");
        students.put(102, "Ravi");
        students.put(103, "Kiran");

        System.out.println("\nAfter put(): " + students);


        // 3. DUPLICATE KEY

        students.put(101, "Satwik");

        System.out.println("\nAfter updating key 101: " + students);


        // 4. ADDING MULTIPLE ELEMENTS

        students.putAll(Map.of(
            104, "Arun",
            105, "Rahul"
        ));

        System.out.println("\nAfter putAll(): " + students);


        // 5. GETTING VALUES

        System.out.println("\nValue of key 101: " + students.get(101));

        System.out.println("Value of key 999: " + students.get(999));


        // 6. GET OR DEFAULT

        System.out.println("\nGet key 102: " +
            students.getOrDefault(102, "Not Found"));

        System.out.println("Get key 999: " +
            students.getOrDefault(999, "Not Found"));


        // 7. CHECKING KEY AND VALUE

        System.out.println("\nContains key 103: " +
            students.containsKey(103));

        System.out.println("Contains value Ravi: " +
            students.containsValue("Ravi"));


        // 8. SIZE AND EMPTY CHECK

        System.out.println("\nSize: " + students.size());

        System.out.println("Is empty: " + students.isEmpty());


        // 9. REPLACING VALUES

        students.replace(102, "Ravi Kumar");

        System.out.println("\nAfter replace(): " + students);


        // 10. CONDITIONAL REPLACE

        students.replace(103, "Kiran", "Kiran Kumar");

        System.out.println("After conditional replace: " + students);


        // 11. PUT IF ABSENT

        students.putIfAbsent(106, "Suresh");

        students.putIfAbsent(101, "New Student");

        System.out.println("\nAfter putIfAbsent(): " + students);


        // 12. REMOVING ELEMENTS

        students.remove(104);

        System.out.println("\nAfter removing key 104: " + students);


        // 13. CONDITIONAL REMOVE

        students.remove(105, "Rahul");

        System.out.println("After conditional remove: " + students);


        // 14. TRAVERSING USING ENTRYSET

        System.out.println("\nUsing entrySet():");

        for (Map.Entry<Integer, String> entry : students.entrySet()) {

            System.out.println(
                entry.getKey() + " = " + entry.getValue()
            );
        }


        // 15. TRAVERSING USING KEYSET

        System.out.println("\nUsing keySet():");

        for (Integer key : students.keySet()) {
            System.out.println(key);
        }


        // 16. TRAVERSING USING VALUES

        System.out.println("\nUsing values():");

        for (String value : students.values()) {
            System.out.println(value);
        }


        // 17. FOR EACH METHOD

        System.out.println("\nUsing forEach():");

        students.forEach((key, value) ->
            System.out.println(key + " = " + value)
        );


        // 18. COMPUTE IF ABSENT

        students.computeIfAbsent(107, key -> "Student " + key);

        System.out.println("\nAfter computeIfAbsent(): " + students);


        // 19. COMPUTE IF PRESENT

        students.computeIfPresent(101,
            (key, value) -> value + " Updated");

        System.out.println("\nAfter computeIfPresent(): " + students);


        // 20. COMPUTE

        students.compute(102,
            (key, value) -> value == null ? "New" : value + " Added");

        System.out.println("\nAfter compute(): " + students);


        // 21. MERGE

        HashMap<String, Integer> scores = new HashMap<>();

        scores.put("Sai", 80);

        scores.merge("Sai", 10, Integer::sum);

        scores.merge("Ravi", 70, Integer::sum);

        System.out.println("\nScores after merge(): " + scores);


        // 22. GETTING A VALUE WITH GET OR DEFAULT

        System.out.println("\nSai's score: " +
            scores.getOrDefault("Sai", 0));

        System.out.println("Kiran's score: " +
            scores.getOrDefault("Kiran", 0));


        // 23. ITERATOR

        System.out.println("\nUsing Iterator:");

        Iterator<Map.Entry<Integer, String>> iterator =
            students.entrySet().iterator();

        while (iterator.hasNext()) {

            Map.Entry<Integer, String> entry = iterator.next();

            System.out.println(entry.getKey() + " : " + entry.getValue());
        }


        // 24. REMOVE USING ITERATOR

        iterator = students.entrySet().iterator();

        while (iterator.hasNext()) {

            Map.Entry<Integer, String> entry = iterator.next();

            if (entry.getKey() == 107) {
                iterator.remove();
            }
        }

        System.out.println("\nAfter iterator removal: " + students);


        // 25. NULL KEY AND NULL VALUES

        HashMap<Integer, String> nullMap = new HashMap<>();

        nullMap.put(null, "Unknown");
        nullMap.put(1, null);
        nullMap.put(2, null);

        System.out.println("\nNull key/value map: " + nullMap);


        // 26. COPYING HASHMAP

        HashMap<Integer, String> copied =
            new HashMap<>(students);

        System.out.println("\nCopied Map: " + copied);


        // 27. CONVERTING TO OTHER COLLECTIONS

        ArrayList<Integer> keys =
            new ArrayList<>(students.keySet());

        ArrayList<String> values =
            new ArrayList<>(students.values());

        System.out.println("\nKeys: " + keys);

        System.out.println("Values: " + values);


        // 28. CLEARING HASHMAP

        students.clear();

        System.out.println("\nAfter clear(): " + students);

        System.out.println("Is empty: " + students.isEmpty());

    }
}
