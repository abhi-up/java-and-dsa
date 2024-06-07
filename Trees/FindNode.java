class TreeNode {
    int data;
    TreeNode left;
    TreeNode right;

    TreeNode(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }

    public String toString() {
        return "Value= " + this.data;
    }
}

class BinaryTree {
    TreeNode root;

    BinaryTree() {
        this.root = null;
    }

    public void insert(int data) {
        System.out.println("Inserting " + data);
        root = insert(root, data);
        System.out.println("Inserted " + data);
    }

    TreeNode insert(TreeNode root, int data) {
        if (root == null) {
            System.out.println("Creating new node for " + data);
            root = new TreeNode(data);
            return root;
        }

        if (data <= root.data) {
            System.out.println("Going left of " + root.data);
            root.left = insert(root.left, data);
        } else {
            System.out.println("Going right of " + root.data);
            root.right = insert(root.right, data);
        }
        return root;
    }

    public boolean findNode(int val) {
        System.out.println("Searching for " + val);
        boolean found = findNode(root, val);
        if (found) {
            System.out.println(val + " found in the tree");
        } else {
            System.out.println(val + " not found in the tree");
        }
        return found;
    }

    public boolean findNode(TreeNode root, int val) {
        if (root == null) {
            return false;
        }
        if (root.data == val) {
            return true;
        }

        if (val <= root.data) {
            return findNode(root.left, val);
        } else {
            return findNode(root.right, val);
        }
    }
}

public class FindNode {
    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        tree.insert(7);
        tree.insert(4);
        tree.insert(9);
        tree.insert(8);
        tree.insert(5);
        tree.insert(2);
        tree.insert(6);
        tree.insert(1);

        System.out.println("Search result for 5: " + tree.findNode(5));
        System.out.println("Search result for 10: " + tree.findNode(10));
    }
}
