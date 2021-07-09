package val;

public class Node<E> {
    protected E element; // Element to be placed in a branch
    protected Node<E> left; // Left branch
    protected Node<E> right; // Right branch

    public Node(E ele) { element = ele; } // Construct a node object
}
