package com.dsa.recap.tree.binaryTree.inOrder;


public class InOder {
    private void traverseTree(Node root) {
        traverseTree(root.left);
        System.out.println(root.data);
        traverseTree(root.right);
    }
}
