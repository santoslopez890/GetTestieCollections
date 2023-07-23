package rocks.zipcode;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class HashSet {
    private java.util.HashSet<Person> testHashSet;
    @org.junit.Before
    public void setUp() throws Exception {
        testHashSet = new java.util.HashSet<>();


    }

    @org.junit.After
    public void tearDown() throws Exception {

    }

    @Test
    public void testAdd() {
        Person james=new Person("james",43);
        assertTrue(testHashSet.isEmpty());
        assertTrue(testHashSet.add(james));
        assertFalse(testHashSet.isEmpty());
        assertEquals(1, testHashSet.size());
    }
    @Test
    public void testRemove() {
        Person james=new Person("james",43);
        testHashSet.add(james);
        assertFalse(testHashSet.isEmpty());
        assertTrue(testHashSet.remove(james));
        assertTrue(testHashSet.isEmpty());
    }
    @Test
    public void testRemoveNonExistent() {
        Person james=new Person("james",43);
        testHashSet.add(james);
        assertFalse(testHashSet.remove(new Person ("someone",67))); // Trying to remove an element not present in the set should return false
        assertEquals(1, testHashSet.size()); // The size should remain unchanged
    }
    @Test
    public void testContains() {
        Person james=new Person("james",43);
        testHashSet.add(james);
        assertTrue(testHashSet.contains(james));
    }
}
