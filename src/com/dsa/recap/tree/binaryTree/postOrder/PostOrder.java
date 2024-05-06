package com.dsa.recap.tree.binaryTree.postOrder;

public class PostOrder {
    private void traverseTree(Node root) {
        traverseTree(root.left);
        traverseTree(root.right);
        System.out.println(root.data);
    }
}
