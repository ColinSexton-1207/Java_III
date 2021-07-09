package val;

public class Main {

    public static void main(String[] args) {
        Integer[] obj = {200, 201, 4984, 278, 3, 20};
        BST<Integer> tree = new BST<>(obj); // Init tree and use constructor to (using insert method) to add array of objects to tree

        for(Integer integer : obj) tree.insert(integer); // Insert elements into the tree

        tree.inorder(); // Traverses tree in order
        System.out.println("Search for 3 within the tree: " + tree.search(3)); // Search for an element
        System.out.println("Size of tree: " + tree.getSize()); // Get the size of the tree

        System.out.println(tree.getNumberOfLeaves());
    }
}
