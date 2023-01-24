package javaCode;

import headers.TreeNode;

public class pathSum {

    public boolean hasPathSum(TreeNode root, int targetSum) {

        return dfs(root, targetSum, 0);

    }

    public boolean dfs(TreeNode root, int targetSum, int currentSum) {

        if (root == null) {
            return false;
        }

        currentSum += root.val;

        if (root.left == null && root.right == null) {
            return currentSum == targetSum;
        }

        return dfs(root.left, targetSum, currentSum) || dfs(root.right, targetSum, currentSum);
    }
}
