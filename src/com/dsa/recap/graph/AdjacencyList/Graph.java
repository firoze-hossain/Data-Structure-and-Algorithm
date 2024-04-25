package com.dsa.recap.graph.AdjacencyList;

import java.util.ArrayList;
import java.util.LinkedList;

public class Graph {
    public ArrayList<LinkedList<Node>> aList;

    public Graph() {
        aList = new ArrayList<>();
    }

    public void addNode(Node node) {
        LinkedList<Node> currentList = new LinkedList<>();
        currentList.add(node);
        aList.add(currentList);
    }

    public void addEdge(int src, int dest) {
        LinkedList<Node> currentList = aList.get(src);
        Node dstNode = aList.get(dest).get(0);
        currentList.add(dstNode);
    }

    public boolean checkEdge(int src, int dest) {
        LinkedList<Node> currentList = aList.get(src);
        Node dstNode = aList.get(dest).get(0);
        for (Node node : currentList) {
            if (node == dstNode) {
                return true;
            }
        }
        return false;
    }

    public void print() {
        for (LinkedList<Node> currentList : aList) {
            for (Node node : currentList) {
                System.out.print(node.data + " -> ");
            }
            System.out.println();
        }
    }
}
