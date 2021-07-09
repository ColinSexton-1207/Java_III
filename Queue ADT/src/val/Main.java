package val;

public class Main {

    public static void main(String[] args) {
        Queue<Integer> intQueue = new Queue();

            intQueue.enqueue(10);
            intQueue.enqueue(7);
            intQueue.enqueue(5);
            intQueue.enqueue(3);
            intQueue.enqueue(13);

            System.out.println(intQueue.toString()); // Testing enqueue(E) and toString()
            System.out.println("First Element: " + intQueue.peek()); // Testing Peek

            System.out.println("Removed Element: " + intQueue.dequeue());

        Queue<Double> doubQueue = new Queue();

            doubQueue.enqueue(3.3);
            doubQueue.enqueue(5.3);
            doubQueue.enqueue(9.3);
            doubQueue.enqueue(13.3);
            doubQueue.enqueue(7.3);

            System.out.println(doubQueue.toString()); // Testing enqueue(E) and toString()
            System.out.println("First Element: " + doubQueue.peek()); // Testing Peek
    }
}
