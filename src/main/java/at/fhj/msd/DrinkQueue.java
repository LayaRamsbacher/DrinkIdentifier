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
        if (elements.size() > this.maxSize) {
            return false;
        } else {
            elements.add(obj);
            return true;
        }
    }

    public Drink poll() {
        return null;
    }

    public Drink remove() {

        Drink drink = poll();
        if (drink == null) {
            throw new NoSuchElementException("there's no element any more");
        }

        return drink;

    }

    public Drink peek() {
        if (!elements.isEmpty()) {
            return null;
        } else {
            return elements.get(0);
        }

    }

    public Drink element() {
        Drink drink = peek();
        if (drink == null) {
            throw new NoSuchElementException("there's no element any more");
        }
        return drink;
    }

}
