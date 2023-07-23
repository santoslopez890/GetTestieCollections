package rocks.zipcode;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class PersonTest {
    private Person alice;
    private Person bob;
    private Person carol;

    @Before
    public void setUp() {
        alice = new Person("Alice", 25);
        bob = new Person("Bob", 30);
        carol = new Person("Carol", 22);
    }

    @Test
    public void testCompareTo() {
        // Alice is younger than Bob, so it should return a negative value.
        assertTrue(alice.compareTo(bob) < 0);

        // Carol is younger than Alice, so it should return a negative value.
        assertTrue(carol.compareTo(alice) < 0);

        // Bob is older than Alice, so it should return a positive value.
        assertTrue(bob.compareTo(alice) > 0);

        // Alice and Alice have the same age, so it should return 0.
        assertEquals(0, alice.compareTo(new Person("Alice", 25)));
    }

    // Sample Person class implementing Comparable interface
    private static class Person implements Comparable<Person> {
        private String name;
        private int age;

        public Person(String name, int age) {
            this.name = name;
            this.age = age;
        }

        // Getters and setters (not shown for brevity)

        @Override
        public int compareTo(Person other) {
            // Compare persons based on their age
            return Integer.compare(this.age, other.age);
        }
    }
}

