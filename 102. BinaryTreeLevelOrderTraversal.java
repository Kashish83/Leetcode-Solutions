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
    
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        if(root==null) return result;
        Queue<TreeNode>q= new LinkedList<>();
        q.offer(root);
        while(!q.isEmpty()){
            int levelSize =q.size();
             List<Integer> level= new ArrayList<>();
             for(int i=0; i<levelSize;i++){
                TreeNode node= q.poll();
                level.add(node.val);
                if(node.left!=null) q.offer(node.left);
                if(node.right!=null) q.offer(node.right);
             }
             result.add(level);

        }
        return result;
    }
}  


