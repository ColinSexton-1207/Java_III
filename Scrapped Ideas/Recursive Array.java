package val;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class RecursiveArray<E> {
    public Scanner input = new Scanner(System.in);

    private E[] list; // Generic array
    private int size; // Current position/size of array
    private static final int DEFAULT = 5; // Default size of the array

    // Class constructor that finishes setting up default array
    @SuppressWarnings("unchecked")
    public RecursiveArray() {
        list = (E[]) new Object[DEFAULT];
    }

    private boolean isFull() {
        return size == list.length;
    }
    
    // Get Array
    @SuppressWarnings("unchecked")
    public E getList() {
        return (E) list;
    }

    // Add elements to the array
    @SuppressWarnings("unchecked")
    public void pushArray() throws Exception {
        if(isFull()) enlargeArray(); // If array is full, enlarge the Array (only if continuing the tests)
        try {
            for(int i = 0; i < list.length; i++) {
                list[i] = (E)input.next(); // Stores element to Array
                size++; // Increases size tracker of the Array
            }
        } catch(InputMismatchException err) {
            throw new Exception(err);
        }
    }

    // Reverse the array using recursion
    @SuppressWarnings("unchecked")
    public E reverseArray(E list, int start, int end) {
        if(start < end){
            E temp = list[end]; // Store last value in Array temporarily
            list[end] = list[start]; // Last value becomes first value
            list[start] = temp; // First value becomes stored last value

            start++;
            end--;
            return reverseArray(list, start+1, end-1);
        }
        else return (E) list;
    }

    public E findMax() {

    }

    // Method to make a larger array as needed to avoid Out of Bounds Exception
    private void enlargeArray() {
        int newBounds = list.length * 2; // Doubles the length of the array
        list = Arrays.copyOf(list, newBounds); // Copies elements of old array to new array w/ new size
        // BUG!!! For some reason, this does not copy the old array over to the new array
    }

    @Override
    public String toString() {
        return "Array: " + Arrays.toString(list);
    }
}
