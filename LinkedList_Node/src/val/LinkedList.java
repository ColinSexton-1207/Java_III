package val;

public class LinkedList<E> {
    private Node<E> head;
    private Node<E> tail;
    private int size;

    // Constructor
    public LinkedList() {
        head = null;
        tail = null;
        size = 0;
    }

    // Shortcut for print function
    public void println(Object line) { System.out.println(line); }

    // Getter Methods
    public int getSize() { return size; }

    // Add Methods
    public void addHead(E ele) {
        Node<E> node = new Node(ele);

        node.Next = head; // Next element becomes node's head element
        head = node; // Head becomes new node element

        if(tail == null) { tail = head; } // If last element is null, last element is first element
        size++; // Increase size of list
    }

    public void addLast(E ele) {
        Node<E> node = new Node(ele);

        if(tail == null) { tail = head; } // If last element is null, last element is first element
        else {
            tail.Next = node; // New tail is created
            tail = tail.Next; // Tail element moves up an element
        }

        size++; // Size of list is increased
    }

    // Remove Methods
    public E removeElement(int index) {
        if(index < 0 || index > size) { return null; } // Out of bounds safeguard
        else if(index == 0) {
            Node<E> temp = head; // Placeholder for head element
            head = head.Next; // New head is transitioned one slot over
            size--; // Back up baby let's go

            return temp.element; // Returns the temporary element which would be at index 0 AKA: current head
        }
        else {
            Node<E> current = head;

            for(int i = 0; i < index -1; i++) { current = current.Next; } // As usual we must move to next element

            Node<E> removedEle = current.Next;
            Node<E> secondNext = current.Next; // Placeholder for next element
            Node<E> temp = secondNext.Next; // Temp is next element's next element

            current.Next = temp; // Next element takes on temp element
            size--; // Back it up again
            return removedEle.element; // This -should- return the indexed element and remove it
        }
    }

    // Print Method
    public void print() {
        Node<E> current = head; // Current value is at the head of the linked list

        // Run so long as the current element exists
        while(current != null) {
            println(current.element); // Outputs current element
            current = current.Next; // Moves onto next element in the linked list
        }
    }
}
