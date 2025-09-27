package dsa_bst;


class Node {
    int data;
    Node left, right;

    public Node(int data) {
        this.data = data;
        left = right = null;
    }
}

public class BinarySearchTree{
    Node root;

    // Insert a new node
    public Node insert(Node root, int val) {
        if (root == null) {
            root = new Node(val);
            return root;
        }

        if (val < root.data) {
            root.left = insert(root.left, val);
        } else if (val > root.data) {
            root.right = insert(root.right, val);
        }

        return root;
    }

    // Search for a node
    public boolean search(Node root, int key) {
        if (root == null) return false;

        if (root.data == key) return true;
        if (key < root.data) return search(root.left, key);
        return search(root.right, key);
    }

    // In-order traversal (Left, Root, Right)
    public void inOrder(Node root) {
        if (root == null) return;

        inOrder(root.left);
        System.out.print(root.data + " ");
        inOrder(root.right);
    }

    // Main method to test
    public static void main(String[] args) {
        BinarySearchTree tree = new BinarySearchTree();

        int[] values = {50, 30, 70, 20, 40, 60, 80};
        for (int val : values) {
            tree.root = tree.insert(tree.root, val);
        }

        System.out.print("In-order Traversal: ");
        tree.inOrder(tree.root);  // Output: 20 30 40 50 60 70 80

        System.out.println("\nSearch 40: " + tree.search(tree.root, 40)); // true
        System.out.println("Search 90: " + tree.search(tree.root, 90));   // false
    }
}
