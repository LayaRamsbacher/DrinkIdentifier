package at.fhj.msd;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

// there's some Bugs included, try to debug the code and fix the Bugs
// there are different Bugs, wrong implementation, typos, ...
// write Test-Cases (read Queue Interface for understanding methods) and use Debugging possibilies of your IDE

/**
 * Similar to the DoubleQueue Class
 * StringQueue is a implementation of the IQueue and provides functionality to store and handle String values in a queue.
 */
public class StringQueue implements IQueue {

    private final List<String> elements = new ArrayList<String>();
    private int maxSize = 5;

    /**
     * The Constructor of the StringQueue Class
     * It takes a maxSize Ineteger value as a Parameter (Default:5).
     * @param maxSize
     */
    public StringQueue(int maxSize) {
        this.maxSize = maxSize;
    }

    /**
     * The offer method is overriden and adds an String element to the queue if the maxSize of the queue is not exceeded. If it is exceeded it does not add
     * the value and returs false, otherwise it returns true
     * @param obj
     * @return if it added the value or not
     */
    @Override
    public boolean offer(String obj) {
        if (elements.size() != maxSize) {
            elements.add(obj);
        } else {
            return false;
        }
        return true;
    }

    /**
     * the poll method is overriden and returns the first element while also removing it from the queue, if the queue is empty, it returns null
     * @return the first element
     */
    @Override
  public String poll() {
    String element = peek();

    if (!elements.isEmpty()) {
      elements.remove(0);
    }

    return element;
  }

    /**
     * the remove method is overriden and similar to the poll method but throws an exepction if there is no element (if the list is empty)
     * @return the first elements
     * @throws NoSuchElementException
     */
    @Override
    public String remove() {
        String element = poll();
        if (element == null) {
            throw new NoSuchElementException("there's no element any more");
        }

        return element;
    }

    /**
     * the peek method is overriden and returns the first element without removing it from the queue, if the queue is empty, it returns null
     * @return the first element
     */
    @Override
    public String peek() {
        String element;
        if (!elements.isEmpty()) {
            element = elements.get(0);
        } else {
            element = null;
        }

        return element;
    }

    /**
     * the element method is overriden and returns the first element of the queue without removing it, if the queue is empty, it throws an exception
     * @return the first element
     * @throws NoSuchElementException
     */
    @Override
    public String element() {
        String element = peek();
        if (element == null) {
            throw new NoSuchElementException("there's no element any more");
        }
        return element;
    }

}
