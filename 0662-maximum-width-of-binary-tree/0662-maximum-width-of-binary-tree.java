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
class Pair{
    TreeNode node;
    long index;
    Pair(TreeNode node,long index){
        this.node=node;
        this.index=index;
    }
}


class Solution {
    public int widthOfBinaryTree(TreeNode root) {
        if(root==null) return 0;
        Queue<Pair> queue=new LinkedList<>();
        queue.offer(new Pair(root,0));
        int maxwidth=0;
        while(!queue.isEmpty()){
            int size=queue.size();
           long minIndex=queue.peek().index;
           long first=0;
           long last=0;
           for(int i=0;i<size;i++){
            Pair current=queue.poll();
            long currIndex=current.index-minIndex;

            TreeNode node=current.node;
            if(i==0){
                first=currIndex;
            }
            if(i==size-1){
                last=currIndex;
            }
            if(node.left!=null){
                queue.offer(new Pair(node.left,2*currIndex+1));
            }
             if(node.right!=null){
                queue.offer(new Pair(node.right,2*currIndex+2));
            }
           }
           int width=(int) (last-first+1);
           maxwidth=Math.max(width,maxwidth);
        }

return maxwidth;
        
    }
}