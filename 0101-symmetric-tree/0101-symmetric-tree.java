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
    public boolean isSymmetric(TreeNode root) {
        return isSame(root.left, root.right);
    }


    public boolean isSame(TreeNode nodeLeft, TreeNode nodeRigth) {
        if (nodeLeft == null && nodeRigth == null) {
            return true;
        }
        if (nodeLeft == null || nodeRigth == null) {
            return false;
        }

        if (nodeLeft.val == nodeRigth.val) {
            return isSame(nodeLeft.left, nodeRigth.right) && isSame(nodeLeft.right, nodeRigth.left);
        }

        return false;
    }
}