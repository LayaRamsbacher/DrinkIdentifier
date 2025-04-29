package at.fhj.msd;

import java.util.NoSuchElementException;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class StringQueueTest {

    private StringQueue queue;
    private StringQueue queueWithZero;

    @BeforeEach
    public void setUp() {
        // Setup for two different queue objects, one with maxSize 4 and one with maxSize 0.
        queue = new StringQueue(4); // queue object, with maxSize 4
        queueWithZero = new StringQueue(0); // queue object, with maxSize 0
    }

    @Test 
    @DisplayName("Testing constructor")
    void testConstructor() {
        
        // Throws --> IllegalArgumentException: Queue size must be greater than 0
        assertThrows(IllegalArgumentException.class, () -> new StringQueue(-1));
        
    }

    /**
     * Tests the offer() method with the String: "Hello".
     * Expected result: true when added to a non-full queue, false for a full queue (maxSize = 0).
     */
    @Test
    @DisplayName("Testing offer() with String: 'Hello'")
    void testOffer() {
        // Expected --> true: Element can be added to the queue
        assertEquals(true, queue.offer("Hello"));

        // Expected --> false: The queue is full, so element cannot be added
        assertEquals(false, queueWithZero.offer("Hello"));
    }

    /**
     * Tests the poll() method.
     * Expected result: The first element should be returned, or null if the queue is empty.
     */
    @Test
    @DisplayName("Testing poll()")
    void testPoll() {
        // Add "Hello" to the queue
        queue.offer("Hello");
        
        // Expected --> "Hello": The first element is returned and removed
        assertEquals("Hello", queue.poll());

        // Expected --> "null": The queue is empty, so poll returns null
        assertEquals(null, queueWithZero.poll());
    }

    /**
     * Tests the remove() method.
     * Expected result: The first element is returned, or throws NoSuchElementException if the queue is empty.
     */
    @Test
    @DisplayName("Testing remove()")
    void testRemove() {
        // Add "Hello" to the queue
        queue.offer("Hello");

        // Expected --> "Hello": The first element is returned and removed
        assertEquals("Hello", queue.remove());

        // Throws --> NoSuchElementException: Queue is empty, so trying to remove will throw an exception
        assertThrows(NoSuchElementException.class, () -> queueWithZero.remove());
    }

    /**
     * Tests the peek() method.
     * Expected result: The first element is returned, or null if the queue is empty.
     */
    @Test
    @DisplayName("Testing peek()")
    void testPeek() {
        // Add "Hello" to the queue
        queue.offer("Hello");

        // Expected --> "Hello": The first element is returned without removing it
        assertEquals("Hello", queue.peek());

        // Expected --> "null": The queue is empty, so peek returns null
        assertEquals(null, queueWithZero.peek());
    }

    /**
     * Tests the element() method.
     * Expected result: The first element is returned, or throws NoSuchElementException if the queue is empty.
     */
    @Test
    @DisplayName("Testing element()")
    void testElement() {
        // Add "Hello" to the queue
        queue.offer("Hello");

        // Expected --> "Hello": The first element is returned without removing it
        assertEquals("Hello", queue.element());

        // Throws --> NoSuchElementException: Queue is empty, so trying to access element will throw an exception
        assertThrows(NoSuchElementException.class, () -> queueWithZero.element());
    }
}
