package val;

import java.util.ArrayList;

public class Queue<E extends Number> {
    private ArrayList<E> list;

    // Constructor
    public Queue() {
        list = new ArrayList<E>();
    }

    // Get Size for navigation
    public int getSize() { return list.size(); }

    // Enqueue
    public void enqueue(E ele) {
        list.add(list.size(), ele); // Adds like @size w/ value ele
    }

    // Dequeue
    public E dequeue() {
        ArrayList<E> temp = new Arraylist<E>(list);
        E ele = list.get(0); // Snag user's desired index to be removed

        return ele; // Return removed element
    }

    // Peek
    public E peek() {
        return (E) list.get(0);
    }

    @Override
    public String toString() {
        return "Queue: " + list;
    }
}
