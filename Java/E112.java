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
    public boolean hasPathSum(TreeNode root, int sum) {
        return subSum(root, 0, sum);
    }

    private boolean subSum(TreeNode root, int count, int sum) {
        if (root == null) return false;
        if (count + root.val == sum && root.left == null && root.right == null) return true;
        return subSum(root.left, count + root.val, sum) || subSum(root.right, count + root.val, sum);
    }
}
