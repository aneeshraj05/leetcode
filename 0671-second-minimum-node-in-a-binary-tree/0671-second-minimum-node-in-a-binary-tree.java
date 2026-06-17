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
    public int findSecondMinimumValue(TreeNode root) {
        if(root.left==null) return -1;
        Queue<TreeNode> q=new LinkedList<>();
        q.offer(root);
        boolean found=false;
        int min=Integer.MAX_VALUE;
        int m=root.val;
        while(!q.isEmpty()){
            TreeNode current=q.poll();
            if(current.left!=null){
                q.offer(current.left);
                q.offer(current.right);

            
            if(current.left.val>m){
                min=Math.min(min,current.left.val);
                found=true;
            }
            if(current.right.val>m){
                min=Math.min(min,current.right.val);
                found=true;
            }
            }
        }

        return found?min:-1;
    }
}