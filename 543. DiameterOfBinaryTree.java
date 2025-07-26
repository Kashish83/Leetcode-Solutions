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
    public int height(TreeNode root){
        if(root==null || (root.left==null&& root.right==null) ){
            return 0;
        }
        int lh = height(root.left);
        int rh= height(root.right);
        return Math.max(lh,rh)+1;
    }
   
    public int diameterOfBinaryTree(TreeNode root) {
        if(root==null|| (root.left==null&& root.right==null) ) return 0;
       int leftAns = diameterOfBinaryTree(root.left);
       int rightAns = diameterOfBinaryTree(root.right);
       int mid = height(root.left)+height(root.right);
        if(root.left!=null) mid++;
       if(root.right!=null) mid++;
       int max = Math.max(leftAns,Math.max(rightAns,mid));
       return max;

        
    }
}
