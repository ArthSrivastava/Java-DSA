package Tree;


import org.w3c.dom.ls.LSOutput;

public class OperationsOnBinaryTree {
    public void inOrderTraversal(BinaryTreeNode root){
        if(root == null)
        {
            return;
        }
        inOrderTraversal(root.left);
        System.out.print(" " + root.data + " ");
        inOrderTraversal(root.right);
    }
    public void preOrderTraversal(BinaryTreeNode root){
        if(root == null)
        {
            return;
        }
        System.out.print(" " + root.data + " ");
        preOrderTraversal(root.left);
        preOrderTraversal(root.right);
    }
    public void postOrderTraversal(BinaryTreeNode root){
        if(root == null)
        {
            return;
        }
        postOrderTraversal(root.left);
        postOrderTraversal(root.right);
        System.out.print(" " + root.data + " ");
    }

    public int height(BinaryTreeNode root)
    {
        if(root == null)
            return 0;
        return Math.max(height(root.left), height(root.right)) + 1;
    }
}
