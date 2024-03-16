class TreeNode {
    int data; // Data stored in the node
    TreeNode left; // Reference to the left child node
    TreeNode right; // Reference to the right child node

    // Constructor to initialize the node with data
    TreeNode(int data) {
        this.data = data;
        this.left = null; // Initialize left child as null
        this.right = null; // Initialize right child as null
    }

    // Method to provide a string representation of the node
    public String toString() {
        return "Value= " + this.data; // Return the string representation of the node's data
    }
}

class BinarySearchTree {
    TreeNode root; // Reference to the root node of the binary search tree

    // Constructor to initialize the binary search tree with null root
    BinarySearchTree() {
        this.root = null;
    }

    // Method to insert a new node with given data into the binary search tree
    public void insert(int data) {
        TreeNode node = new TreeNode(data); // Creating a new node with given data

        // If the tree is empty, make the new node as the root and return
        if (root == null) {
            root = node;
            return;
        }

        TreeNode current = root; // Start traversing from the root node

        // Traverse the tree to find the appropriate position to insert the new node
        while (true) {
            if (data <= current.data) { // If data is less than or equal to the current node's data
                if (current.left == null) { // If left child is null, insert the new node as the left child
                    current.left = node;
                    break;
                }
                current = current.left; // Move to the left child
            } else { // If data is greater than the current node's data
                if (current.right == null) { // If right child is null, insert the new node as the right child
                    current.right = node;
                    break;
                }
                current = current.right; // Move to the right child
            }
        }
    }

    // Method to provide a string representation of the root node's data
    public String toString() {
        return "value= " + this.root.data;
    }
}

public class InsertionRecursive {
    public static void main(String[] args) {
        BinarySearchTree root = new BinarySearchTree(); // Creating a new instance of BinarySearchTree

        // Inserting elements into the binary search tree
        root.insert(5);
        root.insert(4);
        root.insert(2);
        root.insert(6);
        root.insert(8);
        root.insert(1);
        root.insert(7);
        root.insert(0);

        System.out.println(root); // Printing the root node's data
    }
}
