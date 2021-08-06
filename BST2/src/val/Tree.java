package val;

public interface Tree<E> {
    boolean search(E ele); // Returns true if element exists in the tree
    boolean insert(E ele); // Inserts an element into the tree
    boolean delete(E ele); // Deletes an element in the tree
    void inorder(Node<E> root); // Displays the nodes in the correct order from the tree
    @Override
    boolean add(E ele) { return insert(ele); } // Adds element to the tree
    @Override
    boolean remove(Object ele) { return delete((E) ele); }
    int getSize(); // Returns the size of the tree
    void BFT(E ele); // Breadth First Search Traversal
}
