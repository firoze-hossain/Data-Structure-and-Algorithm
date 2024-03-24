### Learn Linked Lists in 13 minutes(24-03-2024):
LinkedList is great for inserting and deleting data. But randomly accessing data is not good. In LinkedList nodes are in non-consecutive memory loaction
#### Singly LinkedList:
![Singly](https://media.geeksforgeeks.org/wp-content/uploads/singly-linkedlist.png "Singly")
In LinkedList every element is a node. In the singly linked list each node has two parts.. One data and another address of the next node. The first node is head and last node is tail. It starts traversing from head to tail.It stops traversing when it will have the address is null.

#### Doubly LinkedList:
![Doubly](https://media.geeksforgeeks.org/wp-content/cdn-uploads/gq/2014/03/DLL1.png "Doubly")
In the doubly linked list there are three part address-data-address. The First address is linked with the previous node and last address is linked with the next node. In the doubly linked list we can start traversing from head to tail or tail to head.

In Java Collection, The LinkedList is implemented by doubly linked list.
We can use stack and queue using linked list.
In Java LinkedList it implements the Deque Interface. We can tell it double ended queue.
**For searching element linkedlist will take O(n)-Linear time
** But adding and deleting element it will take O(1)-Constant time
#### Advantages:
i)Dynamic Data structure(if more allocation needs in run time it is possible)
ii) Deleting and Inserting happen in O(1) constant time
iii) No/Low memory wasted

#### Disadvantages:

i)It takes more memory for data it takes spaces for address and doubly linked list takes more than singly linked list
ii) Nor random access elements.. for accessing it takes O(n).. traversing whole lnkedlist to find element
#### Uses:
i)Implements stack and queue data structure
ii)In GPS navigation(Starts- {Every steps and stops along with is node}-> Final Destination)
iii)Music playlist (one song don’t stay with another song in memory location)
