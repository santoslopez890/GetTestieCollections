package rocks.zipcode;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import java.util.ArrayDeque;

public class ArrayDequeTest {
    private ArrayDeque<Integer> arrayDeque;

    @Before
    public void setUp() {
        arrayDeque = new ArrayDeque<>();
    }

    @Test
    public void testAdd() {
        assertTrue(arrayDeque.isEmpty());

        arrayDeque.addFirst(1);
        arrayDeque.addLast(2);
        arrayDeque.addLast(3);

        assertEquals(3, arrayDeque.size());
    }

    @Test
    public void testPeek() {
        arrayDeque.addFirst(1);
        arrayDeque.addLast(2);
        arrayDeque.addLast(3);

        assertEquals(1, arrayDeque.peekFirst().intValue());
        assertEquals(3, arrayDeque.peekLast().intValue());

        arrayDeque.clear();
        assertNull(arrayDeque.peekFirst());
        assertNull(arrayDeque.peekLast());
    }

    @Test
    public void testRemove() {
        arrayDeque.addFirst(1);
        arrayDeque.addLast(2);
        arrayDeque.addLast(3);

        assertEquals(1, arrayDeque.removeFirst().intValue());
        assertEquals(2, arrayDeque.removeFirst().intValue());
        assertEquals(3, arrayDeque.removeLast().intValue());

        assertTrue(arrayDeque.isEmpty());
    }

    @Test
    public void testSize() {
        assertEquals(0, arrayDeque.size());

        arrayDeque.addFirst(1);
        arrayDeque.addLast(2);
        arrayDeque.addLast(3);

        assertEquals(3, arrayDeque.size());

        arrayDeque.removeFirst();
        assertEquals(2, arrayDeque.size());
    }

    @Test
    public void testContains() {
        arrayDeque.addFirst(1);
        arrayDeque.addLast(2);
        arrayDeque.addLast(3);

        assertTrue(arrayDeque.contains(1));
        assertFalse(arrayDeque.contains(4));
    }
}

