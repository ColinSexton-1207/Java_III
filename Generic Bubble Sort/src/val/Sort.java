package val;

import java.util.Comparator;

public class Sort<E extends Comparable<E>> {
    public void bubbleSort(E[] list, Comparator<? super E> comparator) { // Enable generic array E to be compared by pulling comparator from its super class
        boolean next = true; // Sort should not be running
        for(int i = 1; i <list.length && next; i++) { // Only start if next = true
            next = false; // Start sort
            for(int k = 0; k < list.length - i; k++) {
                if (comparator.compare(list[k], list[i + 1]) > 0) { // Use comparator super to compare list items
                    E temp = list[i]; // Temp variable is set to list [i]
                    list[i] = list[i+1]; // list [i] is set to list [i+1]
                    list[i + 1] = temp; // List [i+1] is set to list[i]

                    next = true; // End sort
                }
            }
        }
    }
}
