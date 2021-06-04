package val;

public class Main {

    public static void main(String[] args) {
        GenericStack<Integer> test = new GenericStack<>();

        try {
            System.out.println("Stack is empty: " + test.isEmpty()); // SUCCESS: isEmpty == true
            //System.out.println(test.peek()); // SUCCESS: Error message works properly

            // Test .push() methods (fill the stack)
            test.push(1);
            test.push(2);
            test.push(3);
            test.push(4);
            test.push(5);
            //test.push(6); // SUCCESS: Error message works properly

            System.out.println(test.toString()); // Outputs the array stack LIFO

            System.out.println("Stack is empty: " + test.isEmpty()); // SUCCESS: isEmpty == false

            System.out.println("Test Peek: " + test.peek());

            // Test .pop() methods (remove items from top of stack)
            System.out.println("Last in: " + test.pop() + " POPPED!");
            System.out.println(test.pop() + " POPPED!");
            System.out.println(test.pop() + " POPPED!");

            System.out.println("Test Peek: " + test.peek());

            System.out.println(test.pop() + " POPPED!");
            System.out.println("First in: " + test.pop() + " POPPED!");
            //System.out.println(test.pop()); // SUCCESS: Error message works properly
        } catch(Error err) {
            System.out.println("Error:" + err.getMessage());
        }
    }
}
