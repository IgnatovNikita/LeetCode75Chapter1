package com.company;

import java.util.LinkedList;

/*Given a binary search tree (BST), find the lowest common ancestor (LCA) node of two given nodes in the BST.

According to the definition of LCA on Wikipedia: “The lowest common ancestor is defined between two nodes p and q as the lowest node in T that has both p and q as descendants (where we allow a node to be a descendant of itself).”

 */
public class LowestCommonAncestorofaBinarySearchTree{
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        LinkedList<TreeNode> pList = new LinkedList<>();
        LinkedList<TreeNode> qList = new LinkedList<>();

        //pList.add(root);
        //qList.add(root);
        TreeNode next = root;
        while (!pList.contains(p)){
            pList.add(next);
            if (p.val > next.val) next = next.right;
            else if (p.val < next.val) next = next.left;
            else break;
        }
        next = root;
        while (!qList.contains(q)){
            qList.add(next);
            if (q.val > next.val) next = next.right;
            else if (q.val < next.val) next = next.left;
            else break;
        }

        while (qList.size() != 0 && pList.size() != 0){
            TreeNode next1 = pList.poll();
            System.out.println(next1.val);
            if (next1 == qList.poll()) next = next1;
            else break;
        }

        return next;
    }
}
