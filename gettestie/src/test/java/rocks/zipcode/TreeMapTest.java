package rocks.zipcode;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import java.util.TreeMap;

public class TreeMapTest {
    private TreeMap<String, Integer> treeMap;

    @Before
    public void setUp() {
        treeMap = new TreeMap<>();
    }

    @Test
    public void testPutAndGet() {
        treeMap.put("apple", 10);
        treeMap.put("banana", 20);
        treeMap.put("cherry", 30);

        assertEquals(10, treeMap.get("apple").intValue());
        assertEquals(20, treeMap.get("banana").intValue());
        assertEquals(30, treeMap.get("cherry").intValue());

        assertNull(treeMap.get("grape")); // Key not present
    }

    @Test
    public void testRemove() {
        treeMap.put("apple", 10);
        treeMap.put("banana", 20);

        assertTrue(treeMap.containsKey("apple"));
        treeMap.remove("apple");
        assertFalse(treeMap.containsKey("apple"));
    }

    @Test
    public void testSize() {
        assertEquals(0, treeMap.size());

        treeMap.put("apple", 10);
        treeMap.put("banana", 20);
        treeMap.put("cherry", 30);

        assertEquals(3, treeMap.size());

        treeMap.remove("apple");
        assertEquals(2, treeMap.size());
    }

    @Test
    public void testContainsKey() {
        treeMap.put("apple", 10);
        treeMap.put("banana", 20);
        treeMap.put("cherry", 30);

        assertTrue(treeMap.containsKey("apple"));
        assertFalse(treeMap.containsKey("grape"));
    }

    @Test
    public void testContainsValue() {
        treeMap.put("apple", 10);
        treeMap.put("banana", 20);
        treeMap.put("cherry", 30);

        assertTrue(treeMap.containsValue(10));
        assertFalse(treeMap.containsValue(40));
    }
}

