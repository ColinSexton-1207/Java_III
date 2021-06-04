package val;

import java.util.Arrays;

public class GenericStack<E> {
    private Object[] list; // Generic object array
    private int size = 0; // Current position/size of stack utilized
    private static final int DEFAULT = 5; // Default capacity of the array stack

    public GenericStack() {
        list = new Object[DEFAULT]; // Defaults size of array stack
    }

    public boolean isEmpty() {
        return size == 0; // Returns true if no elements are in the array
    }

    public boolean isFull() {
        return size == list.length; // Returns true if array is maxed out
    }

    public void push(E ele) throws Error {
        if(isFull()) throw new Error("StackOverflowError - Stack is full"); // Throw error if stack is at capacity

        list[size++] = ele; // Input element is added to the stack
    }

    @SuppressWarnings("unchecked") // I DON'T KNOW HOW TO FIX THIS
    public E pop() throws Error {
        if(isEmpty()) throw new Error("StackUnderflowError - Stack is empty"); // Throw error is stack is empty

        E ele = (E) list[--size]; // Save last element to "ele" before decrement is applied
        list[size] = null; // Removed element value no longer exists
        return ele; // Returns removed element
    }

    @SuppressWarnings("unchecked") // I DON'T KNOW HOW TO FIX THIS
    public E peek() throws Error {
        if(isEmpty()) throw new Error("StackUnderflowError - Stack is empty"); // Throw error is stack is empty

        return (E) list[size -1]; // Save element on "top" of stack to "ele"
    }

    @Override
    public String toString() {
        return "Stack: " + Arrays.toString(list); // DON'T HAVE TO IMPORT ANYTHING TO DO THIS IN JAVASCRIPT
    }
}
