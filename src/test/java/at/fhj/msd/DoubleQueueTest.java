package at.fhj.msd;

import java.util.NoSuchElementException;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class DoubleQueueTest {

    private DoubleQueue queue;
    private DoubleQueue queueWithZero;

    @BeforeEach
    public void setUp() {
        // Setup for two different queue objects, one with maxSize 4 and one with maxSize 0.
        queue = new DoubleQueue(4); // queue object, with maxSize 4
        queueWithZero = new DoubleQueue(0); // queue object, with maxSize 0
    }

    /**
     * Tests the offer() method with the Double: 10.0. Expected result: true
     * when added to a non-full queue, false for a full queue (maxSize = 0).
     */
    @Test
    @DisplayName("Testing offer() with Double: 10.0")
    void testOffer() {
        // Expected --> true: Element can be added to the queue
        assertEquals(true, queue.offer(10.0));

        // Expected --> false: The queue is full, so element cannot be added
        assertEquals(false, queueWithZero.offer(10.0));
    }

    /**
     * Tests the poll() method. Expected result: The first element should be
     * returned, or null if the queue is empty.
     */
    @Test
    @DisplayName("Testing poll()")
    void testPoll() {
        // Add 10.0 to the queue
        queue.offer(10.0);

        // Expected --> 10.0: The first element is returned and removed
        assertEquals(10.0, queue.poll());

        // Expected --> "null": The queue is empty, so poll returns null
        assertEquals(null, queueWithZero.poll());
    }

    /**
     * Tests the remove() method. Expected result: The first element is
     * returned, or throws NoSuchElementException if the queue is empty.
     */
    @Test
    @DisplayName("Testing remove()")
    void testRemove() {
        // Add 10.0 to the queue
        queue.offer(10.0);

        // Expected --> 10.0: The first element is returned and removed
        assertEquals(10.0, queue.remove());

        // Throws --> NoSuchElementException: Queue is empty, so trying to remove will throw an exception
        assertThrows(NoSuchElementException.class, () -> queueWithZero.remove());
    }

    /**
     * Tests the peek() method. Expected result: The first element is returned,
     * or null if the queue is empty.
     */
    @Test
    @DisplayName("Testing peek()")
    void testPeek() {
        // Add 10.0 to the queue
        queue.offer(10.0);

        // Expected --> 10.0: The first element is returned without removing it
        assertEquals(10.0, queue.peek());

        // Expected --> "null": The queue is empty, so peek returns null
        assertEquals(null, queueWithZero.peek());
    }

    /**
     * Tests the element() method. Expected result: The first element is
     * returned, or throws NoSuchElementException if the queue is empty.
     */
    @Test
    @DisplayName("Testing element()")
    void testElement() {
        // Add 10.0 to the queue
        queue.offer(10.0);

        // Expected --> 10.0: The first element is returned without removing it
        assertEquals(10.0, queue.element());

        // Throws --> NoSuchElementException: Queue is empty, so trying to access element will throw an exception
        assertThrows(NoSuchElementException.class, () -> queueWithZero.element());
    }

}
