import java.util.*;
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int val) {
        this.val = val;
    }
}
class Solution {
    
      static void inOrder(TreeNode root, List<Integer>ans){
        if(root==null){
            return;
        }
        
        inOrder(root.left,ans);
        ans.add(root.val);
        inOrder(root.right,ans);
    }
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer>ans=new ArrayList<>();
        if(root==null){
            return ans;
        }
        inOrder(root,ans);
        return ans;
    }
}
