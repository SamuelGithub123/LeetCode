package javaCode;

import headers.TreeNode;

public class balancedBinaryTree {

    private boolean balanced;

    public boolean isBalanced(TreeNode root) {

        balanced = true;

        height(root);

        return balanced;

    }

    public int height(TreeNode root) {

        if (root == null) {
            return 0;
        }

        int leftHeight = height(root.left);
        int rightHeight = height(root.right);

        int result = leftHeight - rightHeight;

        if (result > 1 || result < -1) {
            balanced = false;
        }

        return 1 + Math.max(leftHeight, rightHeight);

    }
}
