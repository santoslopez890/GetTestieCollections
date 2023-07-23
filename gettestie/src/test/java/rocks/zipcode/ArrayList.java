package rocks.zipcode;

import org.junit.Test;

import static org.junit.Assert.*;

public class ArrayList {
    private java.util.ArrayList<Integer> arrayList;

    @org.junit.Before
    public void setUp() throws Exception {

        arrayList = new java.util.ArrayList<>();

    }

    @org.junit.After
    public void tearDown() throws Exception {

    }
    @Test
    public void testAddArrayList() {
        assertTrue(arrayList.isEmpty());

        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);

        assertEquals(3, arrayList.size());
    }
    @Test
    public void testGet() {
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);

        assertEquals(1, arrayList.get(0).intValue());
        assertEquals(2, arrayList.get(1).intValue());
        assertEquals(3, arrayList.get(2).intValue());

        // Test invalid index
        try {
            arrayList.get(3);
            fail("Expected an IndexOutOfBoundsException to be thrown");
        } catch (IndexOutOfBoundsException e) {
            // Expected exception
        }
    }
    @Test
    public void testRemove() {
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);

        assertTrue(arrayList.remove(Integer.valueOf(1)));
        assertFalse(arrayList.remove(Integer.valueOf(4))); // Element not present

        assertEquals(2, arrayList.size());
    }
    @Test
    public void testSize() {
        assertEquals(0, arrayList.size());

        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);

        assertEquals(3, arrayList.size());

        arrayList.remove(Integer.valueOf(1));
        assertEquals(2, arrayList.size());
    }
    @Test
    public void testContains() {
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);

        assertTrue(arrayList.contains(1));
        assertFalse(arrayList.contains(4));
    }
}
