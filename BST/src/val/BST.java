package val;

import java.util.Comparator;

public class BST<E> implements Tree<E> {
    protected Node<E> root;
    protected int size = 0; // Initialize default size to 0
    protected Comparator<E> comp;

    // Constructor w/ natural order comparator
    @SuppressWarnings("unchecked")
    public BST(E rootEle) {
        this.comp = (eleOne, eleTwo) -> ((Comparable<E>)eleOne).compareTo(eleTwo);
    }

    // Constructor w/ natural order comparator && create a BTree from an array of object
    @SuppressWarnings("unchecked")
    public BST(E[] obj) {
        this.comp = (eleOne, eleTwo) -> ((Comparable<E>)eleOne).compareTo(eleTwo);
    }

    // Search for a given element
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

    // Insert elements into a BTree
    @Override
    public void insert(E ele) {
        if(root == null) root = new Node<>(ele); // Creates a new BTree w/ ele as the root
        else {
            Node<E> parent = null; // Parent node init
            Node<E> current = root; // Start insertion point @root of tree

            // Run while current.element exists
            while(current != null) {
                if(comp.compare(ele, current.element) < 0) {
                    parent = current; // Parent node is stored w/ current element
                    current = current.left; // Store current element @left of node
                }
                else if(comp.compare(ele, current.element) > 0) {
                    parent = current; // Parent node is stored w/ current element
                    current = current.right; // Store current element @right of node
                }
                else {
                    // Create the new node and attach @parent
                    assert parent != null;
                    if(comp.compare(ele, parent.element) < 0) current.left = new Node<>(ele);
                    else parent.right = new Node<>(ele);
                }
            }
        }
        size++; // Increase size of BTree
    }

    // Inorder from root
    @Override
    public void inorder() {
        inorder(root);
    }

    // Inorder from subtree
    protected void inorder(Node<E> root) {
        if(root == null) return; // If root doesn't exist, end process
        System.out.println(root.element + " "); // Print current element in tree
        inorder(root.left); // Move to next element (left)
        inorder(root.right); // Move to next element (right)
    }

    // Return size of the BTree
    @Override
    public int getSize() {
        return size;
    }

    // Return number of leaves && if # is odd/even
    @Override
    public int getNumberOfLeaves() {
        return getNumberOfLeaves(root);
    }

    public int getNumberOfLeaves(Node<E> root) {

        if(root == null) return 0; // No nodes exist

        if(root.left == null && root.right == null) return 1; // Returns one as root is the only node
        else return getNumberOfLeaves(root.left) + getNumberOfLeaves(root.right); // Return number of leaves w/o children
    }
}
