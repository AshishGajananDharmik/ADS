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

public class PrintHeadNodeBinaryTree {
    // Function to perform preorder traversal and print head nodes
    public void printHeadNodes(TreeNode root) {
        if (root == null) {
            return;
        }

        System.out.println("Head node: " + root.val);

        printHeadNodes(root.left); // Recur on left subtree
        printHeadNodes(root.right); // Recur on right subtree
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

        PrintHeadNodeBinaryTree printer = new PrintHeadNodeBinaryTree();
        printer.printHeadNodes(root);
    }
}
