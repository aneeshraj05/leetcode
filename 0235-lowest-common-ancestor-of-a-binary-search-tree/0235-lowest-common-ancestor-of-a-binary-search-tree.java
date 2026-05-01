/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root==null) return null;
        Queue<TreeNode> qu=new LinkedList<>();
        Map<TreeNode,TreeNode> parent=new HashMap<>();
        qu.offer(root);
        parent.put(root,null);
        while(!qu.isEmpty()){

            TreeNode node=qu.poll();
            if(node.left!=null){
                qu.offer(node.left);
                parent.put(node.left,node);
            }
             if(node.right!=null){
                qu.offer(node.right);
                parent.put(node.right,node);
            }

           

        }
        
        TreeNode curr=q;
        
         Set<TreeNode> set=new HashSet<>();
            while(p!=null){
                set.add(p);
                p=parent.get(p);
            }
while(!set.contains(curr)){

curr=parent.get(curr);

}

        return curr; 
        
    }
}