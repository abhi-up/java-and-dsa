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

public class InorderTraversal {
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

        // Method to perform recursive inorder traversal of the binary tree
        public void inorder(Node root) {
            if (root == null)
                return;

            inorder(root.left);
            System.out.print(root.data + " ");
            inorder(root.right);
        }

        // Method to perform iterative inorder traversal of the binary tree
        public void inorderIterative(Node root) {
            if (root == null)
                return;

            Stack<Node> stack = new Stack<>();
            Node current = root;

            while (current != null || !stack.isEmpty()) {
                // Reach the leftmost Node of the current Node
                while (current != null) {
                    stack.push(current);
                    current = current.left;
                }

                // Current must be null at this point
                current = stack.pop();
                System.out.print(current.data + " ");

                // We have visited the node and its left subtree. Now, it's right subtree's turn
                current = current.right;
            }
        }
    }

    public static void main(String[] args) {
        int[] nodes = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 };
        BinaryTree tree = new BinaryTree();
        Node root = tree.buildTree(nodes);

        System.out.println("Inorder traversal of the binary tree:");
        tree.inorder(root);

        System.out.println();

        System.out.println("Inorder traversal (Iterative) of the binary tree:");
        tree.inorderIterative(root);
    }
}
