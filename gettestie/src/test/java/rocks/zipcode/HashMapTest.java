package rocks.zipcode;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import java.util.HashMap;

public class HashMapTest {
    private HashMap<String, Integer> hashMap;

    @Before
    public void setUp() {
        hashMap = new HashMap<>();
    }

    @Test
    public void testPutAndGet() {
        hashMap.put("apple", 10);
        hashMap.put("banana", 20);
        hashMap.put("cherry", 30);

        assertEquals(10, hashMap.get("apple").intValue());
        assertEquals(20, hashMap.get("banana").intValue());
        assertEquals(30, hashMap.get("cherry").intValue());

        assertNull(hashMap.get("grape")); // Key not present
    }

    @Test
    public void testRemove() {
        hashMap.put("apple", 10);
        hashMap.put("banana", 20);

        assertTrue(hashMap.containsKey("apple"));
        hashMap.remove("apple");
        assertFalse(hashMap.containsKey("apple"));
    }

    @Test
    public void testSize() {
        assertEquals(0, hashMap.size());

        hashMap.put("apple", 10);
        hashMap.put("banana", 20);

        assertEquals(2, hashMap.size());

        hashMap.remove("apple");
        assertEquals(1, hashMap.size());
    }

    @Test
    public void testContainsKey() {
        hashMap.put("apple", 10);
        hashMap.put("banana", 20);

        assertTrue(hashMap.containsKey("apple"));
        assertFalse(hashMap.containsKey("grape"));
    }

    @Test
    public void testContainsValue() {
        hashMap.put("apple", 10);
        hashMap.put("banana", 20);

        assertTrue(hashMap.containsValue(10));
        assertFalse(hashMap.containsValue(30));
    }
}

