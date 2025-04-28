package at.fhj.msd;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

/**
 * Similar to the StringQueue Class
 * DoubleQueue is a implementation of the IDoubleQueue and provides functionality to store and handle Double values in a queue.
 */
public class DoubleQueue implements IDoubleQueue {

    private final List<Double> elements = new ArrayList<Double>();
    private int maxSize = 5;

    /**
     * Constructor for the DoubleQueue 
     * It takes a maxSize Ineteger value as a Parameter (Default:5).
     *  @param int maxSize
     */
    public DoubleQueue(int maxSize) {
        this.maxSize = maxSize;
    }

    /**
     * The offer method is overriden and adds an double element to the queue if the maxSize of the queue is not exceeded. If it is exceeded it does not add
     * the value and returs false, otherwise it returns true
     *  @param Double obj
     *  @return if it added the value or not
     */
    @Override
    public boolean offer(Double obj) {
        if (elements.size() != maxSize) {
            elements.add(obj);
        } else {
            return false;
        }
        return true;
    }

    /**
     * the poll method is overriden and returns the first element while also removing it from the queue, if the queue is empty, it returns null
     *  @return the first element
     */
    @Override
    public Double poll() {
      Double element = peek();
  
      if (!elements.isEmpty()) {
        elements.remove(0);
      }
  
      return element;
    }

    /**
     * the remove method is overriden and similar to the poll method but throws an exepction if there is no element (if the list is empty)
     *  @return the first elements
     *  @throws NoSuchElementException
     */
    @Override
    public Double remove() {
        Double element = poll();
        if (element == null) {
            throw new NoSuchElementException("there's no element any more");
        }

        return element;
    }

    /**
     * the peek method is overriden and returns the first element of the List withou removing it and retruns null if the list is empty
     * @return the first element
     */
    @Override
    public Double peek() {
        Double element;
        if (!elements.isEmpty()) {
            element = elements.get(0);
        } else {
            element = null;
        }

        return element;
    }

    /** 
    * The element method is overriden and is the same method as the remove method for the poll method in the sense that
    * it throws an exeption if the List is empty
    * @return the first element
    * @throws NoSuchElementException
    */
    @Override
    public Double element() {
        Double element = peek();
        if (element == null) {
            throw new NoSuchElementException("there's no element any more");
        }
        return element;
    }
    
}
