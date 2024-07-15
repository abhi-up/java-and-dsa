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

public class PostorderTraversal {
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

        // Method to perform recursive postorder traversal of the binary tree
        public void postorder(Node root) {
            if (root == null)
                return;

            postorder(root.left);
            postorder(root.right);
            System.out.print(root.data + " ");
        }

        // Method to perform iterative postorder traversal of the binary tree
        public void postorderIterative(Node root) {
            if (root == null)
                return;

            Stack<Node> stack1 = new Stack<>();
            Stack<Node> stack2 = new Stack<>();

            stack1.push(root);

            while (!stack1.isEmpty()) {
                Node current = stack1.pop();
                stack2.push(current);

                if (current.left != null) {
                    stack1.push(current.left);
                }
                if (current.right != null) {
                    stack1.push(current.right);
                }
            }

            while (!stack2.isEmpty()) {
                Node node = stack2.pop();
                System.out.print(node.data + " ");
            }
        }
    }

    public static void main(String[] args) {
        int[] nodes = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 };
        BinaryTree tree = new BinaryTree();
        Node root = tree.buildTree(nodes);

        System.out.println("postorder traversal of the binary tree:");
        tree.postorder(root);

        System.out.println();

        System.out.println("postorder traversal (Iterative) of the binary tree:");
        tree.postorderIterative(root);
    }
}
