package at.fhj.msd;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

public class DoubleQueue implements IDoubleQueue {

    private final List<Double> elements = new ArrayList<Double>();
    private int maxSize = 5;

    public DoubleQueue(int maxSize) {
        this.maxSize = maxSize;
    }

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
