package Tree.PracticeProblems;

import Tree.BinaryTreeNode;

public class Main {
    public static void main(String[] args) {
        NodesAtKDistance op = new NodesAtKDistance();
        BinaryTreeNode root = new BinaryTreeNode(22);
        root.left = new BinaryTreeNode(40);
        root.left.left = new BinaryTreeNode(46);
        root.left.right = new BinaryTreeNode(38);
        root.right = new BinaryTreeNode(100);
        root.right.left = new BinaryTreeNode(120);
        root.right.left.right = new BinaryTreeNode(270);
        op.solve(root, 2);
    }
}
