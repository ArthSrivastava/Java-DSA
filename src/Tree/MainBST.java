package Tree;

import com.sun.source.tree.BinaryTree;

public class MainBST {
    public static void main(String[] args) {
        BinarySearchTree operations = new BinarySearchTree();
        BinaryTreeNode root = new BinaryTreeNode(26);
//        operations.insertRecursive(null, 26);
//        operations.insertRecursive(root, 27);
//        operations.insertRecursive(root, 23);
//        operations.insertRecursive(root, 29);
//        operations.insertRecursive(root, 1);
//        operations.insertRecursive(root, 100);
//        operations.insertRecursive(root, 28);

        operations.insertIterative(null, 26);
        operations.insertIterative(root, 2);
        operations.insertIterative(root, 89);
        operations.insertIterative(root, 32);
        operations.insertIterative(root, 56);
        operations.insertIterative(root, 92);
        OperationsOnBinaryTree op = new OperationsOnBinaryTree();
        op.inOrderTraversal(root);

//        System.out.println(operations.searchRecursive(root, 23));
        System.out.println(operations.searchIterative(root, 92));
    }
}
