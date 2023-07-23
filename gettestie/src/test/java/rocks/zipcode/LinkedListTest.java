package rocks.zipcode;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import java.util.LinkedList;

public class LinkedListTest {
    private LinkedList<Integer> linkedList;

    @Before
    public void setUp() {
        linkedList = new LinkedList<>();
    }

    @Test
    public void testAdd() {
        assertTrue(linkedList.isEmpty());

        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);

        assertEquals(3, linkedList.size());
    }

    @Test
    public void testGet() {
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);

        assertEquals(1, linkedList.get(0).intValue());
        assertEquals(2, linkedList.get(1).intValue());
        assertEquals(3, linkedList.get(2).intValue());

        // Test invalid index
        try {
            linkedList.get(3);
            fail("Expected an IndexOutOfBoundsException to be thrown");
        } catch (IndexOutOfBoundsException e) {
            // Expected exception
        }
    }

    @Test
    public void testRemove() {
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);

        assertTrue(linkedList.remove(Integer.valueOf(1)));
        assertFalse(linkedList.remove(Integer.valueOf(4))); // Element not present

        assertEquals(2, linkedList.size());
    }

    @Test
    public void testSize() {
        assertEquals(0, linkedList.size());

        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);

        assertEquals(3, linkedList.size());

        linkedList.remove(Integer.valueOf(1));
        assertEquals(2, linkedList.size());
    }

    @Test
    public void testContains() {
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);

        assertTrue(linkedList.contains(1));
        assertFalse(linkedList.contains(4));
    }
}

