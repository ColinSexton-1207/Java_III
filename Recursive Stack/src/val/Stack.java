package val;

import java.util.Arrays;

public class Stack {
    private int[] list;
    private int size;
    private static final int DEFAULT = 5;

    // Constructor
    public Stack() {
        list = new int[DEFAULT];
        size = 0;
    }

    // Get Methods
    public int[] getList() { return list; }
    public int getLength() { return list.length; }

    public boolean isEmpty() {
        return size == 0; // Returns true if no elements are in the array
    }

    public boolean isFull() {
        return size == list.length; // Returns true if array is maxed out
    }

    public void push(int ele) throws Error {
        if(isFull()) throw new Error("StackOverflowError - Stack is full"); // Throw error if stack is at capacity

        list[size++] = ele; // Input element is added to the stack
    }

    public int pop() throws Error {
        if(isEmpty()) throw new Error("StackUnderflowError - Stack is empty"); // Throw error is stack is empty

        int ele = list[--size]; // Save last element to "ele" before decrement is applied
        list[size] = 0; // Removed element value no longer exists
        return ele; // Returns removed element
    }

    public int peek() throws Error {
        if(isEmpty()) throw new Error("StackUnderflowError - Stack is empty"); // Throw error is stack is empty

        return list[size -1]; // Save element on "top" of stack to "ele"
    }

    public int sum(int[] list, int size) {
        if(size <= 0) return 0; // If size reaches zero (length) finish
        return (sum(list, size -1) + list[size -1]); // Recursively call sum pass list and size -1, + list@size-1
    }

    public void sortAlgo(int[] list, int popped) {
        if(list.isEmpty() || popped > list.peek()) { // If stack is empty OR temp is greater than existing values
            list.push(popped); // Push temp value for sort
        }

        // If top greater, remove top
        int temp = list.pop();
        sortAlgo(list, popped);

        list.push(temp);
    }

    public void sort(int[] list) {
        if(!list.isEmpty()) {
            int temp = list.pop(); // Pop element from the list to be sorted
            sort(list); // Recursively continues the sort
            sortAlgo(list, temp); // Calls the algorithm that updates the list with the sorted elements
        }
    }

    @Override
    public String toString() {
        return "Stack: " + Arrays.toString(list); // DON'T HAVE TO IMPORT ANYTHING TO DO THIS IN JAVASCRIPT
    }
}
