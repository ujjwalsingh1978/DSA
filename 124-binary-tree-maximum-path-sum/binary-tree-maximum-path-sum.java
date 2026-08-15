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
    int maxsum = Integer.MIN_VALUE;
    public int maxPathSum(TreeNode root) {
        sum(root);
        return maxsum;
    }
    public int sum(TreeNode root){
        if(root == null ) return 0;
        int sumLeft = Math.max(0 , sum(root.left));
        int sumRight = Math.max(0 , sum(root.right));
        int Summ = root.val + sumLeft + sumRight;
        maxsum = Math.max(Summ, maxsum);
        return root.val + Math.max(sumLeft ,sumRight);
    }
}