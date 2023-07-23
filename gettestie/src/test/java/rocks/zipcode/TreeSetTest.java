package rocks.zipcode;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import java.util.TreeSet;

public class TreeSetTest {
    private TreeSet<Integer> treeSet;

    @Before
    public void setUp() {
        treeSet = new TreeSet<>();
    }

    @Test
    public void testAdd() {
        assertTrue(treeSet.isEmpty());

        treeSet.add(3);
        treeSet.add(1);
        treeSet.add(2);

        assertEquals(3, treeSet.size());
    }

    @Test
    public void testContains() {
        treeSet.add(3);
        treeSet.add(1);
        treeSet.add(2);

        assertTrue(treeSet.contains(1));
        assertFalse(treeSet.contains(4));
    }

    @Test
    public void testRemove() {
        treeSet.add(3);
        treeSet.add(1);
        treeSet.add(2);

        assertTrue(treeSet.contains(1));
        treeSet.remove(1);
        assertFalse(treeSet.contains(1));
        assertEquals(2, treeSet.size());
    }

    @Test
    public void testSize() {
        assertEquals(0, treeSet.size());

        treeSet.add(3);
        treeSet.add(1);
        treeSet.add(2);

        assertEquals(3, treeSet.size());

        treeSet.remove(1);
        assertEquals(2, treeSet.size());
    }

    @Test
    public void testFirstAndLast() {
        treeSet.add(3);
        treeSet.add(1);
        treeSet.add(2);

        assertEquals(1, treeSet.first().intValue());
        assertEquals(3, treeSet.last().intValue());
    }
}

