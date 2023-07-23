package rocks.zipcode;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorTest {
    private List<String> list;

    @Before
    public void setUp() {
        list = new ArrayList<>();
        list.add("apple");
        list.add("banana");
        list.add("cherry");
    }

    @Test
    public void testIteratorHasNext() {
        Iterator<String> iterator = list.iterator();

        assertTrue(iterator.hasNext()); // The list is not empty, so it should have a next element.
    }

    @Test
    public void testIteratorNext() {
        Iterator<String> iterator = list.iterator();

        assertEquals("apple", iterator.next());
        assertEquals("banana", iterator.next());
        assertEquals("cherry", iterator.next());
    }

    @Test
    public void testIteratorRemove() {
        Iterator<String> iterator = list.iterator();

        iterator.next(); // Move to the first element ("apple")
        iterator.remove(); // Remove "apple"

        assertEquals(2, list.size());
        assertFalse(list.contains("apple"));
        assertTrue(list.contains("banana"));
        assertTrue(list.contains("cherry"));
    }
}
