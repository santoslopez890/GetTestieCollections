package rocks.zipcode;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import java.util.PriorityQueue;

public class PriorityQueueTest {
    private PriorityQueue<Integer> priorityQueue;

    @Before
    public void setUp() {
        priorityQueue = new PriorityQueue<>();
    }

    @Test
    public void testAdd() {
        assertTrue(priorityQueue.isEmpty());

        priorityQueue.add(3);
        priorityQueue.add(1);
        priorityQueue.add(2);

        assertEquals(3, priorityQueue.size());
    }

    @Test
    public void testPeek() {
        priorityQueue.add(3);
        priorityQueue.add(1);
        priorityQueue.add(2);

        assertEquals(1, priorityQueue.peek().intValue());

        priorityQueue.clear();
        assertNull(priorityQueue.peek());
    }

    @Test
    public void testPoll() {
        priorityQueue.add(3);
        priorityQueue.add(1);
        priorityQueue.add(2);

        assertEquals(1, priorityQueue.poll().intValue());
        assertEquals(2, priorityQueue.poll().intValue());
        assertEquals(3, priorityQueue.poll().intValue());

        assertTrue(priorityQueue.isEmpty());
    }

    @Test
    public void testSize() {
        assertEquals(0, priorityQueue.size());

        priorityQueue.add(3);
        priorityQueue.add(1);
        priorityQueue.add(2);

        assertEquals(3, priorityQueue.size());

        priorityQueue.poll();
        assertEquals(2, priorityQueue.size());
    }
}
