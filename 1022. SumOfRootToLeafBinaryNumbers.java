 import java.util.*;
 class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) {
        val = x;
    }
}
class Solution {
    private int totalsum=0;
    public int sumRootToLeaf(TreeNode root) {
        return dfs(root,0);
    }
    private int dfs(TreeNode node, int currentSum){
        if(node==null) return 0;
        currentSum = currentSum * 2 + node.val;
        if(node.left==null && node.right==null){
            return currentSum;
        }
       return dfs(node.left,currentSum)+dfs(node.right,currentSum);
    }
}
