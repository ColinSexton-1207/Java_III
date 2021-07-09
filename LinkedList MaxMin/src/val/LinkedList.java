package val;

public class LinkedList {
    // Due to using comparisons for Min/Max, it is easier to use Integer rather than a generic E
    private Node<Integer> head;
    private Node<Integer> tail;
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
    public void addHead(Integer ele) {
        Node<Integer> node = new Node(ele);

        node.Next = head; // Next element becomes node's head element
        head = node; // Head becomes new node element

        if(tail == null) { tail = head; } // If last element is null, last element is first element
        size++; // Increase size of list
    }

    public void addLast(Integer ele) {
        Node<Integer> node = new Node(ele);

        if(tail == null) { tail = head; } // If last element is null, last element is first element
        else {
            tail.Next = node; // New tail is created
            tail = tail.Next; // Tail element moves up an element
        }

        size++; // Size of list is increased
    }

    // Remove Methods
    public Integer removeElement(int index) {
        if(index < 0 || index > size) { return null; } // Out of bounds safeguard
        else if(index == 0) {
            Node<Integer> temp = head; // Placeholder for head element
            head = head.Next; // New head is transitioned one slot over
            size--; // Back up baby let's go

            return temp.element; // Returns the temporary element which would be at index 0 AKA: current head
        }
        else {
            Node<Integer> current = head;

            for(int i = 0; i < index -1; i++) { current = current.Next; } // As usual we must move to next element

            Node<Integer> removedEle = current.Next;
            Node<Integer> secondNext = current.Next; // Placeholder for next element
            Node<Integer> temp = secondNext.Next; // Temp is next element's next element

            current.Next = temp; // Next element takes on temp element
            size--; // Back it up again
            return removedEle.element; // This -should- return the indexed element and remove it
        }
    }

    // Max Method
    public Integer max() {
        Integer max = head.element;
        Node<Integer> current = head;

        while(current.Next != null) {
            current = current.Next; // Move through the Linked list

            if(current.element > max) { max = current.element; } // Largest element saved
        }

        return max; // Returns largest element
    }

    // Min Method
    public Integer min() {
        Integer min = head.element;
        Node<Integer> current = head;

        while(current.Next != null) {
            current = current.Next;

            if(current.element < min) { min = current.element; }
        }

        return min;
    }

    public Integer sum(Integer max, Integer min) {
        Integer sum = max + min;

        int index = 2; // Place the sum in this index

        Node<Integer> current = head;
        for(int i = 1; i < index; i++) current = current.Next;

        Node<Integer> temp = current.Next;
        current.Next = new Node<>(sum);
        (current.Next).Next = temp;
        size++;

        return sum;
    }

    // Print Method
    public void print() {
        Node<Integer> current = head; // Current value is at the head of the linked list

        // Run so long as the current element exists
        while(current != null) {
            println(current.element); // Outputs current element
            current = current.Next; // Moves onto next element in the linked list
        }
    }
}
