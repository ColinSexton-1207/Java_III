package val;

public class Main {

    public static void main(String[] args) {
        Stack test = new Stack();

       try {
            // Test .push() methods (fill the stack)
            test.push(1);
            test.push(2);
            test.push(3);
            test.push(4);
            test.push(5);

            System.out.println(test.toString()); // Outputs the array stack LIFO

            System.out.println("Sum of elements: " + test.sum(test.getList(), test.getLength()));

            test.sort(test.getList());

            System.out.println(test.toString());
        } catch(Error err) {
            System.out.println("Error: " + err.getMessage());
        }
    }
}
