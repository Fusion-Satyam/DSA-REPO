package dsa_bst;


public class BSTUsingArr {
    private Integer[] tree;
    private int size;

    public BSTUsingArr(int capacity) {
        tree = new Integer[capacity];
        size = capacity;
    }

    // Insert a value into the BST
    public void insert(int value) {
        insertAt(0, value);
    }

    private void insertAt(int index, int value) {
        if (index >= size) {
            System.out.println("Tree is full or too deep!");
            return;
        }

        if (tree[index] == null) {
            tree[index] = value;
        } else if (value < tree[index]) {
            insertAt(2 * index + 1, value); // go left
        } else if (value > tree[index]) {
            insertAt(2 * index + 2, value); // go right
        } else {
            // value already exists
            System.out.println("Value already exists in the tree: " + value);
        }
    }

    // Inorder traversal
    public void inorder() {
        System.out.print("Inorder: ");
        inorderTraversal(0);
        System.out.println();
    }

    private void inorderTraversal(int index) {
        if (index >= size || tree[index] == null) return;

        inorderTraversal(2 * index + 1); // left
        System.out.print(tree[index] + " "); // root
        inorderTraversal(2 * index + 2); // right
    }

    public static void main(String[] args) {
        BSTUsingArr bst = new BSTUsingArr(31); // enough size for height 5 tree
        int[] values = {15, 10, 20, 8, 12, 17, 25};
        for (int v : values) {
            bst.insert(v);
        }

        bst.inorder();  // should print: 8 10 12 15 17 20 25
    }
}
