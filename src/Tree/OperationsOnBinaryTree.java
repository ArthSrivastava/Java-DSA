package Tree;


import org.w3c.dom.ls.LSOutput;

import java.util.LinkedList;
import java.util.Queue;

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

    public void bfsTraversal(BinaryTreeNode root, int k){
        if(root == null)
        {
            return;
        }
        if(k == 1)
        {
            System.out.print(root.data + " ");
            return;
        }
        bfsTraversal(root.left, k - 1);
        bfsTraversal(root.right, k - 1);
    }


    public void bfsOptimised(BinaryTreeNode root)
    {
        Queue<BinaryTreeNode> queue = new LinkedList<>();
        queue.add(root);
        BinaryTreeNode curr;
        int count = 1;
        int max = Integer.MIN_VALUE;
        while(!queue.isEmpty())
        {
            curr = queue.poll();
            max = Math.max(curr.data, max);
            System.out.print(curr.data + " ");
            if(curr.left != null) {
                queue.add(curr.left);
                count++;
            }
            if (curr.right != null) {
                queue.add(curr.right);
                count++;
            }
        }
        System.out.println();
//        System.out.println("Size:" + count);
        System.out.println("Max Element:" + max);
        System.out.println();
    }

    public void bfsLineByLine(BinaryTreeNode root)
    {
        Queue<BinaryTreeNode> queue = new LinkedList<>();
        queue.add(root);
        queue.add(null);
        BinaryTreeNode curr;
        while(queue.size() > 1)
        {
            curr = queue.poll();
            if(curr == null)
            {
                System.out.println();
                queue.add(null);
            }
            else {
                System.out.print(curr.data + " ");
                if (curr.left != null)
                    queue.add(curr.left);
                if (curr.right != null)
                    queue.add(curr.right);
            }
        }
    }

    public void bfsLineByLine2(BinaryTreeNode root) {
        Queue<BinaryTreeNode> queue = new LinkedList<>();
        queue.add(root);
        BinaryTreeNode curr;
        while (!queue.isEmpty()) {
            int count = queue.size();
            for (int i = 0; i < count; i++) {
                curr = queue.poll();
                System.out.print(curr.data + " ");
                if (curr.left != null)
                    queue.add(curr.left);
                if (curr.right != null)
                    queue.add(curr.right);
            }
            System.out.println();
        }
    }

    public int getSize(BinaryTreeNode root)
    {
        if(root == null)
            return 0;
        return 1 + getSize(root.left) + getSize(root.right);
    }

    public int getMax(BinaryTreeNode root){
        if(root == null)
            return Integer.MIN_VALUE;
        return Math.max(root.data, Math.max(getMax(root.left), getMax(root.right)));
    }

}
