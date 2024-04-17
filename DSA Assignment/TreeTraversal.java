public class TreeTraversal {
    // Inner class representing a tree node
    private static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        public TreeNode(int val) {
            this.val = val;
            this.left = null;
            this.right = null;
        }
    }

    // Inner class representing the binary tree
    private static class BinaryTree {
        TreeNode root;

        public BinaryTree(TreeNode root) {
            this.root = root;
        }

        // Inorder traversal
        public void inorderTraversal(TreeNode node) {
            if (node == null) {
                return;
            }
            inorderTraversal(node.left);
            System.out.print(node.val + " ");
            inorderTraversal(node.right);
        }

        // Preorder traversal
        public void preorderTraversal(TreeNode node) {
            if (node == null) {
                return;
            }
            System.out.print(node.val + " ");
            preorderTraversal(node.left);
            preorderTraversal(node.right);
        }

        // Postorder traversal
        public void postorderTraversal(TreeNode node) {
            if (node == null) {
                return;
            }
            postorderTraversal(node.left);
            postorderTraversal(node.right);
            System.out.print(node.val + " ");
        }
    }

    public static void main(String[] args) {
        // Create a binary tree
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);

        BinaryTree binaryTree = new BinaryTree(root);

        // Perform tree traversals
        System.out.println("Inorder traversal:");
        binaryTree.inorderTraversal(root);
        System.out.println();

        System.out.println("Preorder traversal:");
        binaryTree.preorderTraversal(root);
        System.out.println();

        System.out.println("Postorder traversal:");
        binaryTree.postorderTraversal(root);
        System.out.println();
    }
}
