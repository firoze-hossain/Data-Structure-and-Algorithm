package com.dsa.recap.tree.binaryTree.preOrder;

public class PreOrder {
    private void traverseTree(Node root) {
        System.out.println(root.data);
        traverseTree(root.left);
        traverseTree(root.right);
    }
}
