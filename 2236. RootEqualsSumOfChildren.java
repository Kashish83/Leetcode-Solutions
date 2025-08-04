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
    public boolean checkTree(TreeNode root) {
        if(root==null) return true;
        
        if(root.val==root.left.val+root.right.val) return true;
        else{
            return false;
        }
    }
}