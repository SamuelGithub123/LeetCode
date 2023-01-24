package javaCode;

import headers.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class binaryTreeInorder {

    public List<Integer> inorderTraversal(TreeNode root) {

        List<Integer> result = new ArrayList<>();

        if (root == null) {
            return result;
        }

        TreeNode current = root;
        Stack<TreeNode> stack = new Stack<>();


        while (!stack.empty() || current != null) {

            if (current != null) {
                stack.push(current);
                current = current.left;
            }

            else {
                current = stack.pop();
                result.add(current.val);
                current = current.right;
            }
        }
        return result;
    }
}
