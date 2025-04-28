package at.fhj.msd;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

public class DoubleQueue implements IDoubleQueue {

    private final List<Double> elements = new ArrayList<Double>();
    private int maxSize = 5;


    /**
     * Constructor for DoubleQueue
     * DoubleQueue implements the Interface IDoubleQueue which has methods declared for a Queue.
     * This Class provides functionality to store and handle Double values in a queue.
     * @param maxSize
     */
    public DoubleQueue(int maxSize) {
        this.maxSize = maxSize;
    }

    /**
     * @param obj
     * The  offer method is overridden and adds an double (obj) to the elements and retruns a boolean value if 
     * the method worked. The Method adds an item if the Method is
     * 
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

    @Override
    public Double poll() {
      Double element = peek();
  
      if (!elements.isEmpty()) {
        elements.remove(0);
      }
  
      return element;
    }

    @Override
    public Double remove() {
        Double element = poll();
        if (element == null) {
            throw new NoSuchElementException("there's no element any more");
        }

        return element;
    }

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

    @Override
    public Double element() {
        Double element = peek();
        if (element == null) {
            throw new NoSuchElementException("there's no element any more");
        }
        return element;
    }
    
}
