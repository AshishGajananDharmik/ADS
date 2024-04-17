class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    public TreeNode(int val) {
        this.val = val;
        this.left = null;
        this.right = null;
    }
}

public class BinaryTreeSearch {
    // Recursive method to search for a node with a given value in a binary tree
    public TreeNode search(TreeNode root, int value) {
        if (root == null || root.val == value) {
            return root;
        }

        TreeNode leftResult = search(root.left, value);
        if (leftResult != null) {
            return leftResult; // Node found in the left subtree
        }

        return search(root.right, value); // Node found in the right subtree or not found
    }

    public static void main(String[] args) {
        // Create a binary tree
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(7);

        BinaryTreeSearch searcher = new BinaryTreeSearch();

        int valueToSearch = 5;
        TreeNode resultNode = searcher.search(root, valueToSearch);

        if (resultNode != null) {
            System.out.println("Node with value " + valueToSearch + " found.");
        } else {
            System.out.println("Node with value " + valueToSearch + " not found.");
        }
    }
}
