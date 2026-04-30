/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
   
    public boolean hasPathSum(TreeNode root, int targetSum) {
      if(root==null){
        return false;
      }
      Stack<TreeNode> stack=new Stack<>();
      Stack<Integer> sum=new Stack<>();
      stack.push(root);
      sum.push(root.val);

    while(!stack.isEmpty()){
        TreeNode node=stack.pop();
        int s=sum.pop();

        if(node.left==null&& node.right==null && targetSum==s){
            return true;

        }
        if(node.right!=null){
            stack.push(node.right);
            sum.push(s+node.right.val);
        }
        if(node.left!=null){
            stack.push(node.left);
            sum.push(s+node.left.val);
        }

    }
    return false;
        
    }
   
}