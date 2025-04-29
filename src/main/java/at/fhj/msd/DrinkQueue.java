package at.fhj.msd;

import java.util.LinkedList;
import java.util.NoSuchElementException;

/**
 * This class implements a queue for drinks. It uses a linked list to store the drinks and has a maximum size.
 * The queue allows adding drinks, removing drinks, and checking the first drink in the queue depending on the method called.
 */
public class DrinkQueue {

    
    private LinkedList<Drink> elements;
    int maxSize = 5;

    /**
     * The Constructor for the DrinkQueue class.
     * the parameter maxSize sets the maximum size of the queue.
     * The default size is 5.
     * @param maxSize the maximum size of the queue
     */
    public DrinkQueue(int maxSize) {
        elements = new LinkedList<>();
        this.maxSize = maxSize;
    }

    /**
     * The offer method adds a drink to the queue.
     * If the queue is full, it returns false.
     *  @param obj the drink to be added to the queue
     *  @return true if the drink was added, false if the queue is full (the drink was not added)
     */
    public boolean offer(Drink obj) {
        if (elements.size() >= this.maxSize) {                  //fixed an issue where 4 coulf fit into a maxsize of 3
            return false;
        } else {
            elements.add(obj);
            return true;
        }
    }

    /**
     * The poll Method removes the first drink from the queue and returns it.
     * If the queue is empty, it returns null.
     * @return the first drink in the queue or null if the queue is empty
     */
    public Drink poll() {
        if (elements.isEmpty()) {
            return null;
        }
        elements.remove(0);
        return elements.get(0);
    }

    /**
     * The remove method is similar to the poll method, but it throws an exception if the queue is empty.
     * @return the first drink in the queue
     * @throws NoSuchElementException if the queue is empty
     * @see poll()
     */
    public Drink remove() {

        Drink drink = poll();
        if (drink == null) {
            throw new NoSuchElementException("there's no element any more");
        }

        return drink;

    }

    /**
     * The peek method returns the first drink in the queue without removing it.
     * If the queue is empty, it returns null.
     * @return the first drink in the queue or null if the queue is empty
     */
    public Drink peek() {
        if (!elements.isEmpty()) {
            return null;
        } else {
            return elements.get(0);
        }

    }

    /*

    this might be better?

    public Drink peek() {
        if (elements.isEmpty()) {
            return null;
        }
        return elements.peek();
    }
     */

     /**
      * The element method is similar to the peek method, but it throws an exception if the queue is empty.
      * @return the first drink in the queue
      * @throws NoSuchElementException if the queue is empty
      * @see peek()
      */
    public Drink element() {
        Drink drink = peek();
        if (drink == null) {
            throw new NoSuchElementException("there's no element any more");
        }
        return drink;
    }

}
