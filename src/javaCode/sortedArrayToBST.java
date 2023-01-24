package javaCode;

import headers.TreeNode;

public class sortedArrayToBST {

    public TreeNode sortedArrayToBST(int[] nums) {

        if (nums == null) {
            return null;
        }

        return helper(nums, 0, nums.length - 1);
    }


    public TreeNode helper(int[] nums, int left, int right) {

        if (left > right) {
            return null;
        }

        int mid = (right + left) / 2;

        TreeNode root = new TreeNode(nums[mid]);
        root.left = helper(nums, left, mid - 1);
        root.right = helper(nums, mid + 1, right);

        return root;

    }
}
