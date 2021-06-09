package val;

import java.util.Arrays;
import java.util.Scanner;

public class RecursiveArray {
    public Scanner input = new Scanner(System.in);

    private int[] list; // Generic array
    private int size; // Current position/size of array
    private static final int DEFAULT = 5; // Default size of the array

    // Class constructor that finishes setting up default array
    public RecursiveArray() {
        list = new int[DEFAULT];
    }

    private boolean isFull() {
        return size == list.length;
    }

    // Get Methods
    public int[] getList() { return list; }
    public int getLength() { return list.length; }

    // Add elements to the array
    public void pushArray() throws Exception {
        if(isFull()) enlargeArray(); // If array is full, enlarge the Array (only if continuing the tests)
        for(int i = 0; i < list.length; i++) {
            list[i] = input.nextInt(); // Stores element to Array
            size++; // Increases size tracker of the Array
        }
    }

    // Reverse the array using recursion
    public int[] reverseArray(int[] list, int start, int end) throws Exception {
        try {
            if (start < end) { // Condition start MUST be less than end in order to swap values, stops if equals
                int temp = list[start]; // Store last value in Array temporarily
                list[start] = list[end]; // Last value becomes first value
                list[end] = temp; // First value becomes stored last value

                return reverseArray(list, ++start, --end); // Call function again (recursively)
            } else return list;
        } catch (ArrayIndexOutOfBoundsException err) { throw new Exception(err); }
    }

    public int maxArray(int[] list, int count, int max) {
        if(count == 0) max = list[count]; // Default max value is stored
        else if(count == list.length) return max; // Returns max value of array once end of array has been reached
        else if(max < list[count]) return maxArray(list, count++, list[count]); // Pass new max off to next recursed (lol) run
        return maxArray(list, count+1, max); // Increment counter if no max is found
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
