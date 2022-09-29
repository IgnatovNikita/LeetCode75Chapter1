package com.company;

import java.util.LinkedList;
import java.util.List;

/*Given the root of a binary tree, determine if it is a valid binary search tree (BST).

A valid BST is defined as follows:

The left subtree of a node contains only nodes with keys less than the node's key.
The right subtree of a node contains only nodes with keys greater than the node's key.
Both the left and right subtrees must also be binary search trees.

 */
public class ValidateBinarySearchTree {
    private LinkedList<Integer> res = new LinkedList<>();

    public List<Integer> preorderTraversal(TreeNode root) {
        if (root == null){
            return res;
        }
        res.add(root.val);
        preorderTraversal(root.left);
        preorderTraversal(root.right);

        return res;
    }


    public boolean isValidBST(TreeNode root) {
        if (root == null) return true;

        res = new LinkedList<>();
        preorderTraversal(root.left);
        for (int t:res
             ) {
            if (t >= root.val) return false;
        }
        res = new LinkedList<>();
        preorderTraversal(root.right);
        for (int t:res
        ) {
            if (t <= root.val) return false;
        }

         return isValidBST(root.left) && isValidBST(root.right);

    }

}
