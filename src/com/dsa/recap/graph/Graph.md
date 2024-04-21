# Graph(21-04-2024):
Graph is a non-linear aggregation of nodes and edges. It is used to model a network.
Nodes are called vertices and edges are called linked between nodes. The links between nodes are called adjacency.
### There are two types of graph:
i) Undirected graph
ii)Directed graph

### i)Undirected graph:
There is not a specific direction of edge

Example: Facebook. Each user is node and connected with another node

### ii) Directed graph:
A graph whose edge has direction is called directed graphs.

Example: Street map. One way or two way direction.
### Two Popular way to represent the adjacency between nodes:
i) Adjacency Matrix
ii)Adjacency List
### i)Adjacency Matrix:
An adjacency matrix is like 2D arrays. It has columns and rows.
It starts to travel to the beginning of the index of element and searches forward the row and if it finds any 1. Then we call there is adjacency or link between two nodes/vertices.

i) Runtime complexity: O(1)-Constant time.. To find the edge.
ii) Space complexity: O(n^2)- Use a lot of edges. If there are 5 elements, then there will be created 25 spaces.

### ii)Adjacency List:
It is an array/arrayList of LinkedList. Each element is counted as a LinkedList. Each element will contain the address of adjacent other elements.

i) Runtime complexity: O(n)-Linear time.. To find the edge.
ii) Space complexity: O(n+e → Node + edge)- Use less space over adjacent matrix