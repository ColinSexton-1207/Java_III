package val;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
	    LinkedList list = new LinkedList();
	    Random rand = new Random();

	    for(int i = 0; i < 15; i++) { list.addHead(rand.nextInt(90) + 10); }

	    list.print();

	    println("Max: " + list.max());
	    println("Min: " + list.min());
	    println("Sum: " + list.sum(list.max(), list.min()));
    }

    public static void println(Object line) { System.out.println(line); }
}
