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

public class InorderSuccessorBinaryTree {
    // Function to find the leftmost node in a subtree
    private TreeNode findLeftmost(TreeNode node) {
        if (node == null) {
            return null;
        }

        while (node.left != null) {
            node = node.left;
        }

        return node;
    }

    // Function to find the inorder successor of a node in a binary tree
    public TreeNode inorderSuccessor(TreeNode root, TreeNode target) {
        if (root == null || target == null) {
            return null;
        }

        // Case 1: If the target node has a right subtree
        if (target.right != null) {
            return findLeftmost(target.right); // Leftmost node in the right subtree
        }

        // Case 2: If the target node does not have a right subtree
        TreeNode successor = null;
        TreeNode current = root;

        while (current != null) {
            if (target.val < current.val) {
                successor = current;
                current = current.left;
            } else if (target.val > current.val) {
                current = current.right;
            } else {
                break; // Found the target node, exit the loop
            }
        }

        return successor;
    }

    public static void main(String[] args) {
        // Create a binary search tree
        TreeNode root = new TreeNode(20);
        root.left = new TreeNode(10);
        root.right = new TreeNode(30);
        root.left.left = new TreeNode(5);
        root.left.right = new TreeNode(15);
        root.right.left = new TreeNode(25);
        root.right.right = new TreeNode(35);

        InorderSuccessorBinaryTree tree = new InorderSuccessorBinaryTree();

        // Find the inorder successor for node with value 10
        TreeNode targetNode = root.left;
        TreeNode successor = tree.inorderSuccessor(root, targetNode);

        if (successor != null) {
            System.out.println("Inorder successor of " + targetNode.val + " is " + successor.val);
        } else {
            System.out.println("Inorder successor of " + targetNode.val + " not found.");
        }
    }
}
