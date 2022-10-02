package Tree.PepCoding;

import com.sun.source.tree.Tree;

import java.util.ArrayList;
import java.util.Stack;

public class GenericTree {
    private static class TreeNode {
        int data;
        ArrayList<TreeNode> children = new ArrayList<>(); //For storing child nodes
    }

    private static TreeNode createTree(int[] arr) {
        TreeNode root = new TreeNode();
        int l = arr.length;
        int i = 0;
        Stack<TreeNode> stack = new Stack<>();
        while (i < l) {
            if (arr[i] != -1) {
                TreeNode node = new TreeNode();
                node.data = arr[i];
                if (stack.isEmpty()) {
                    root = node;
                } else {
                    stack.peek().children.add(node);
                }
                stack.push(node);
            } else {
                stack.pop();
            }
            i++;
        }
        return root;
    }

    private static void displayTree(TreeNode root) {
        System.out.print(root.data + "->");
        for(TreeNode child: root.children) {
            System.out.print(child.data + ", ");
        }
        System.out.println(".");

        for (TreeNode child : root.children) {
            displayTree(child);
        }
    }
    public static void main(String[] args) {
        int[] arr = {10, 20, 50, -1, 60, -1, -1, 30, 70, -1, 80, 110, -1, 120, -1,
                -1, 90, -1, -1, 40, 100, -1, -1, -1};
        TreeNode root = createTree(arr);
        displayTree(root);
    }
}
