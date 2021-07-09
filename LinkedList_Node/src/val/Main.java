package val;

public class Main {

    public static void main(String[] args) {
	    LinkedList<Double> list = new LinkedList<Double>();

	    list.addHead(10.1);
	    list.addLast(3.3);
	    list.addHead(2.5);
	    list.addLast(7.3);

	    list.println("Linked List");
	    list.print();

	    list.removeElement(2); // Remove at index 2

		list.println("Removed");
		list.print();
    }
}
