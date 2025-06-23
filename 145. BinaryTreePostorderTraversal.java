import java.util.*;
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {}

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
class Solution {
      static void postOrder(TreeNode root, List<Integer>ans){
        if(root==null){
            return;
        }
        
        postOrder(root.left,ans);
        postOrder(root.right,ans);
        ans.add(root.val);
        
    }
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer>ans=new ArrayList<>();
        if(root==null){
            return ans;
        }
        postOrder(root,ans);
        return ans;
    }
}
