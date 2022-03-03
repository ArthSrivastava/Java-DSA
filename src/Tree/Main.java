package Tree;

public class Main {
    public static void main(String[] args) {
        BinaryTreeNode root = new BinaryTreeNode(40);
        root.left = new BinaryTreeNode(10);
        root.right = new BinaryTreeNode(20);
        root.right.left = new BinaryTreeNode(76);
        root.right.left.right = new BinaryTreeNode(87);
        root.left.left = new BinaryTreeNode(100);
        root.right.right = new BinaryTreeNode(50);
        OperationsOnBinaryTree operations = new OperationsOnBinaryTree();
        System.out.print("InOrder:");
        operations.inOrderTraversal(root);
        System.out.println();
        System.out.print("PreOrder:");
        operations.preOrderTraversal(root);
        System.out.println();
        System.out.print("PostOrder:");
        operations.postOrderTraversal(root);
        System.out.println();
        System.out.print("Height:");
        System.out.println(operations.height(root));
    }
}
