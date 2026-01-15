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
        public boolean isSameTree(TreeNode p, TreeNode q) {
            List<Integer> arr1=new ArrayList<>();
            List<Integer> arr2=new ArrayList<>();
            preorder(arr1, p);
            preorder(arr2,q);

            return arr1.equals(arr2);

            
        }
        static void preorder(List<Integer> arr, TreeNode root){
            if(root==null){
                arr.add(null);
                return;
            }
            arr.add(root.val);
            preorder(arr,root.left);
            preorder(arr,root.right);
        }

    }