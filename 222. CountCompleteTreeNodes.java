class Solution {
    public int countNodes(TreeNode root) {
        if(root==null){
            return 0;
        }
      int  lcount= countNodes(root.left);
       int rcount=countNodes(root.right);
        return 1+lcount+rcount;
        
    }
}