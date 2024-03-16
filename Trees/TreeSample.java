class TreeNode {
    int data; // Data stored in the node
    TreeNode left; // Reference to the left child node
    TreeNode right; // Reference to the right child node

    // Constructor to initialize the node with data
    TreeNode(int data) {
        this.data = data;
    }

    // Method to provide a string representation of the node
    public String toString() {
        return "Value= " + data;
    }
}

public class TreeSample {
    public static void main(String[] args) {
        // Creating the root node with data 7
        TreeNode root = new TreeNode(7);

        // Creating left child node with data 4 and attaching it to the root
        root.left = new TreeNode(4);

        // Creating right child node with data 10 and attaching it to the root
        root.right = new TreeNode(10);
    }
}
