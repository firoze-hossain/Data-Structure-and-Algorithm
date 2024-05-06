# Tree traversal(06-05-2024):<br>
Tree traversal is a process of visiting nodes of a tree. Because there is no random access.<br>
Here we have used Binary Tree, Not Binary search Tree.<br>
Binary trees have at most two children, not more than that.<br>
There are three types of tree traversal of binary Tree:<br>
i) In-Order<br>
ii)Post-Order<br>
iii)Pre-Order<br>
i) **In-Order**: <br>
When we want to navigate a tree using recursion for In-Order, we use Left->Root->Right
[For Binary search tree, we use non-decreasing order(Left->Root->Right)]<br>


ii) **Post-Order**:<br>
When we want to navigate a tree using recursion for Post-Order, we use Left->Right->Root.
[We used to delete in tree from root to leaf nodes]<br>



iii) **Pre-Order**:<br>
When we want to navigate a tree using recursion for Post-Order, we use Root->Left->Right.
For pre-order we copy a tree, first we (create root node, then branch node and lastly leaf node)<br>

