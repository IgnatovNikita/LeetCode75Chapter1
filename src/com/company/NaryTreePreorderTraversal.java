package com.company;

import java.util.LinkedList;
import java.util.List;

//Given the root of an n-ary tree, return the preorder traversal of its nodes' values.
//
//Nary-Tree input serialization is represented in their level order traversal.
// Each group of children is separated by the null value (See examples)
public class NaryTreePreorderTraversal {
    private final List<Integer> res = new LinkedList<>();
    public List<Integer> preorder(Node root) {
        if (root == null) return res;
        res.add(root.val);
        for (Node ch: root.children){

            preorder(ch);
        }
        return res;
    }
}
