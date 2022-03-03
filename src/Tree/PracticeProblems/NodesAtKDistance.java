package Tree.PracticeProblems;

import Tree.BinaryTreeNode;

public class NodesAtKDistance {
    public void solve(BinaryTreeNode root, int k)
    {
        if(root == null)
            return;
        if(k == 0)
            System.out.print(root.data + " ");
        else{
            solve(root.left, k - 1);
            solve(root.right, k - 1);
        }
    }

}
