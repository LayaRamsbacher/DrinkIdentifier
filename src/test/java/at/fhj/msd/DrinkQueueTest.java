package at.fhj.msd;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.NoSuchElementException;

import static org.junit.jupiter.api.Assertions.*;

class DrinkQueueTest {

    private DrinkQueue queue;
    private Drink drink1;
    private Drink drink2;

    @BeforeEach
    void setUp() {
        queue = new DrinkQueue(2);
        drink1 = new SimpleDrink("Water", new Liquid("Water", 0.5, 0));
        drink2 = new SimpleDrink("Juice", new Liquid("Juice", 0.3, 0));
    }

    @Test
    void testOfferWithinCapacity() {
        assertTrue(queue.offer(drink1));
        assertTrue(queue.offer(drink2));
    }

    @Test
    void testOfferExceedsCapacity() {
        queue.offer(drink1);
        queue.offer(drink2);
        assertFalse(queue.offer(new SimpleDrink("Soda", new Liquid("Soda", 0.2, 0))));
    }

    @Test
    void testPollFromEmptyQueue() {
        assertNull(queue.poll());
    }

    @Test
    void testPollFromNonEmptyQueue() {
        queue.offer(drink1);
        assertEquals(drink1, queue.poll());
    }

    @Test
    void testRemoveFromEmptyQueue() {
        assertThrows(NoSuchElementException.class, () -> queue.remove());
    }

    @Test
    void testRemoveFromNonEmptyQueue() {
        queue.offer(drink1);
        assertEquals(drink1, queue.remove());
    }

    @Test
    void testPeekFromEmptyQueue() {
        assertNull(queue.peek());
    }

    @Test
    void testPeekFromNonEmptyQueue() {
        queue.offer(drink1);
        assertEquals(drink1, queue.peek());
    }

    @Test
    void testElementFromEmptyQueue() {
        assertThrows(NoSuchElementException.class, () -> queue.element());
    }

    @Test
    void testElementFromNonEmptyQueue() {
        queue.offer(drink1);
        assertEquals(drink1, queue.element());
    }
}
