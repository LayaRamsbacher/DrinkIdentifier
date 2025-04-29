package at.fhj.msd;

import java.util.LinkedList;
import java.util.NoSuchElementException;

public class DrinkQueue {

    private LinkedList<Drink> elements;
    int maxSize = 5;

    public DrinkQueue(int maxSize) {
        elements = new LinkedList<>();
        this.maxSize = maxSize;
    }

    public boolean offer(Drink obj) {
        if (elements.size() >= this.maxSize) {                  //fixed an issue where 4 coulf fit into a maxsize of 3
            return false;
        } else {
            elements.add(obj);
            return true;
        }
    }

    public Drink poll() {
        if (elements.isEmpty()) {
            return null;
        }
        return elements.remove(0);
    }

    public Drink remove() {

        Drink drink = poll();
        if (drink == null) {
            throw new NoSuchElementException("there's no element any more");
        }

        return drink;

    }

    public Drink peek() {
        if (elements.isEmpty()) {
            return null;
        }
        return elements.get(0);
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

    public Drink element() {
        Drink drink = peek();
        if (drink == null) {
            throw new NoSuchElementException("there's no element any more");
        }
        return drink;
    }

}
