package rocks.zipcode;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import java.util.Vector;

public class VectorTest {
    private Vector<Integer> vector;

    @Before
    public void setUp() {
        vector = new Vector<>();
    }

    @Test
    public void testAdd() {
        assertTrue(vector.isEmpty());

        vector.add(1);
        vector.add(2);
        vector.add(3);

        assertEquals(3, vector.size());
    }

    @Test
    public void testGet() {
        vector.add(1);
        vector.add(2);
        vector.add(3);

        assertEquals(1, vector.get(0).intValue());
        assertEquals(2, vector.get(1).intValue());
        assertEquals(3, vector.get(2).intValue());

        // Test invalid index
        try {
            vector.get(3);
            fail("Expected an ArrayIndexOutOfBoundsException to be thrown");
        } catch (ArrayIndexOutOfBoundsException e) {
            // Expected exception
        }
    }

    @Test
    public void testRemove() {
        vector.add(1);
        vector.add(2);
        vector.add(3);

        assertTrue(vector.remove(Integer.valueOf(1)));
        assertFalse(vector.remove(Integer.valueOf(4))); // Element not present

        assertEquals(2, vector.size());
    }

    @Test
    public void testSize() {
        assertEquals(0, vector.size());

        vector.add(1);
        vector.add(2);
        vector.add(3);

        assertEquals(3, vector.size());

        vector.remove(Integer.valueOf(1));
        assertEquals(2, vector.size());
    }

    @Test
    public void testContains() {
        vector.add(1);
        vector.add(2);
        vector.add(3);

        assertTrue(vector.contains(1));
        assertFalse(vector.contains(4));
    }
}

