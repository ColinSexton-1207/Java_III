package val;
import java.util.Comparator;

public class BST<E> implements Tree<E> {
    private Node<E> root;
    private int size;
    private Comparator<E> comp;


    public BST(E ele) {
        this.comp = (eleOne, eleTwo) -> ((Comparable<E>)eleOne).compareTo(eleTwo);
        size = 0;
    }

    @Override
    public boolean insert(E ele) {
        if(root == null) root = new Node(ele); // Creates a new root if no node exists
        else {
            Node<E> current = root; // Start at root
            Node<E> parent = current; // Track previously saved node

            while(current != null) {
                // Check if new element is greater than current element
                if(comp.compare(ele, current.element) > 0) {
                    parent = current; // Previous node stored in parent
                    current = current.right; // Moves to right side of tree
                }
                // Check is new element is less than current element
                else if(comp.compare(ele, current.element) < 0) {
                    parent = current; // Previou node stored in parent
                    current = current.left; // Moves to left side of tree
                }
                // Check if element equal current element
                else return false;
            }
            // Insert element into tree
            if(comp.compare(ele, parent.element) > 0) parent.right = new Node(ele); // Inserts into the right
            else if(comp.compare(ele, parent.element) < 0) parent.left = new Node(ele); // Inserts into the left
        }

        size++; // Increment size of the tree
        return true; // Lets user know their element has been inserted successfully
    }

    @Override
    public boolean delete(E ele) {
        Node<E> current = root; // Start at root
        Node<E> parent = current; // Track previously saved node

        while(current != null) {
            // Check if new element is greater than current element
            if(comp.compare(ele, current.element) > 0) {
                parent = current; // Previous node stored in parent
                current = current.right; // Moves to right side of tree
            }
            // Check is new element is less than current element
            else if(comp.compare(ele, current.element) < 0) {
                parent = current; // Previou node stored in parent
                current = current.left; // Moves to left side of tree
            }
            // Check if element equal current element
            else break;
        }

        if(root == null) return false; // If root DNE, there's nothing to delete
        if(current.left == null) {
            if(parent == null) root = current.right; // If parent element DNE, move to the right node
            else {
                if(comp.compare(ele, parent.element) < 0) parent.left = current.left; // If element is less than current element, parent becomes current
                else parent.right = current.right; // If element is greater than current element, parent becomes current
            }
        }
        else {
            Node<E> parentRightMost = current; // Current element is parent of the rightmost
            Node<E> rightMost = current.left; // Right most element is current.left

            while(rightMost.right != null) {
                parentRightMost = rightMost;
                rightMost = rightMost.right; // Keep moving right
            }

            current.element = rightMost.element; // Replace element in current w/ element in rightMost

            if(parentRightMost.right == rightMost) parentRightMost.right = rightMost.left; // Get rid of rightMost node
            else parentRightMost.left = rightMost.left;
        }

        size--; // Decrement size of tree
        return true; // Element deleted successfully
    }

    @Override
    public boolean search(E ele) {
        Node<E> current = root; // Start search @root of tree

        // Run while current.element exists
        while(current != null) {
            if(comp.compare(ele, current.element) < 0) current = current.left; // Search element is to the left
            else if(comp.compare(ele, current.element) > 0) current = current.right; // Search element is to the left
            else return true; // Ele matches current.element, return element is found
        }
        return false; // Ele does not exist within the BTree
    }

    @Override
    public void inorder(Node<E> root) {
        if(root == null) return; // Root DNE, no traversal required
        inorder(root.left); // Move to root.left
        inorder(root.right); // Move to root.right
    }

    @Override
    public int getSize() {
        return size;
    }

    public void BFT(Node<E> root) {
        java.util.LinkedList<Node<E>> queue = new java.util.LinkedList<Node<E>>();

        if(root == null) return;

        queue.add(root); // Adds root element to the queue

        while(!queue.isEmpty()) {
            Node<E> node = queue.removeFirst();

            // If node branch exists, add element to the queue
            if(node.left != null) queue.add(node.left);
            if(node.right != null) queue.add(node.right);
        }
    }
}