package Tree;

public class Main {
    public static void main(String[] args) {
        BinaryTreeNode root = new BinaryTreeNode(40);
        root.left = new BinaryTreeNode(10);
        root.right = new BinaryTreeNode(20);
        root.left.left = new BinaryTreeNode(100);
    }
}
