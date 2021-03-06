package Tree;

import com.sun.source.tree.BinaryTree;

public class BinarySearchTree {
    public BinaryTreeNode insertRecursive(BinaryTreeNode root, int x)
    {
        if(root == null) {
            return new BinaryTreeNode(x);
        }
        else if(x < root.data) {
            root.left = insertRecursive(root.left, x);
        }
        else if(x > root.data) {
            root.right = insertRecursive(root.right, x);
        }
        return root;
    }

    public BinaryTreeNode insertIterative(BinaryTreeNode root, int x)
    {
        BinaryTreeNode node = new BinaryTreeNode(x);
        BinaryTreeNode parent = null, curr = root;
        while(curr != null)
        {
            parent = curr;
            if(x < curr.data) {
                curr = curr.left;
            } else if (x > curr.data) {
                curr = curr.right;
            } else {
                return root;
            }
        }
        if (parent == null) {
            return node;
        } else if (x > parent.data) {
            parent.right = node;
        } else {
            parent.left = node;
        }
        return root;
    }

    public boolean searchRecursive(BinaryTreeNode root, int x) {
        if (root == null) {
            return false;
        } else if (x == root.data) {
            return true;
        } else if (x > root.data) {
            return searchRecursive(root.right, x);
        } else {
            return searchRecursive(root.left, x);
        }
    }

    public boolean searchIterative(BinaryTreeNode root, int x) {
        BinaryTreeNode curr = root;
        while (curr != null) {
            if (x == curr.data) {
                return true;
            } else if (x > curr.data) {
                curr = curr.right;
            } else {
                curr = curr.left;
            }
        }
        return false;
    }

    public BinaryTreeNode deleteRecursive(BinaryTreeNode root, int x) {
        if(root == null)
            return null;
        else if (x < root.data) {
            root.left = deleteRecursive(root.left, x);
        } else if (x > root.data) {
            root.right = deleteRecursive(root.right, x);
        } else {
            if (root.right == null) {
                return root.left;
            } else if (root.left == null) {
                return root.right;
            } else {
                BinaryTreeNode temp = getInorderSuccDeletion(root);
                root.data = temp.data;
                root.right = deleteRecursive(root.right, temp.data);
            }
        }
        return root;
    }

    private BinaryTreeNode getInorderSuccDeletion(BinaryTreeNode root) {
        BinaryTreeNode curr = root.right;
        while (curr != null && curr.left != null) {
            curr = curr.left;
        }
        return curr;
    }
}
