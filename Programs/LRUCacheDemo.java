
import java.util.*;

class LRUCache extends LinkedHashMap<Integer, Integer> {

    private final int capacity;

    LRUCache(int capacity) {

        super(capacity, 0.75f, true);

        this.capacity = capacity;
    }

    public int getValue(int key) {

        return super.getOrDefault(key, -1);
    }

    public void putValue(int key, int value) {

        super.put(key, value);
    }

    @Override
    protected boolean removeEldestEntry(
        Map.Entry<Integer, Integer> eldest
    ) {

        return size() > capacity;
    }
}


public class LRUCacheDemo {

    public static void main(String[] args) {

        LRUCache cache = new LRUCache(3);

        cache.putValue(10, 100);
        cache.putValue(20, 200);
        cache.putValue(30, 300);

        System.out.println(cache);

        cache.getValue(10);

        System.out.println("After accessing 10: " + cache);

        cache.putValue(40, 400);

        System.out.println("After inserting 40: " + cache);

        System.out.println("Value of 10: " + cache.getValue(10));

        System.out.println("Value of 20: " + cache.getValue(20));
    }
}
