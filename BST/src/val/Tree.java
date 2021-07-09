package val;

public interface Tree<E> {
    boolean search(E ele); // Returns true if element exists in the tree
    void insert(E ele); // Inserts an element into the tree
    void inorder(); // Displays the nodes in the correct order from the tree
    int getSize(); // Returns the size of the tree
    int getNumberOfLeaves();
}
