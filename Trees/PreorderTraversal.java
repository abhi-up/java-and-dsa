import java.util.Stack;

class Node {
    int data;
    Node left;
    Node right;

    Node(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }
}

public class PreorderTraversal {
    static class BinaryTree {
        static int idx = -1;

        // Method to build the binary tree from an array
        public Node buildTree(int[] nodes) {
            idx++;

            if (nodes[idx] == -1)
                return null;

            Node newNode = new Node(nodes[idx]);

            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);

            return newNode;
        }

        // Method to perform preorder traversal of the binary tree
        public void preorder(Node root) {
            if (root == null)
                return;

            // Print the root node
            System.out.print(root.data + " ");
            // Traverse the left subtree
            preorder(root.left);
            // Traverse the right subtree
            preorder(root.right);
        }

        // Method to perform iterative preorder traversal of the binary tree
        public void preorderIterative(Node root) {
            if (root == null)
                return;

            Stack<Node> stack = new Stack<>();
            stack.push(root);

            while (!stack.isEmpty()) {
                Node current = stack.pop();
                System.out.print(current.data + " ");

                // Push right child first so that left child is processed first
                if (current.right != null) {
                    stack.push(current.right);
                }
                if (current.left != null) {
                    stack.push(current.left);
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] nodes = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 };
        BinaryTree tree = new BinaryTree();
        Node root = tree.buildTree(nodes);

        System.out.println("Preorder traversal of the binary tree:");
        tree.preorder(root);

        System.out.println();

        System.out.println("Preorder traversal (Iterative) of the binary tree:");
        tree.preorderIterative(root);
    }
}
