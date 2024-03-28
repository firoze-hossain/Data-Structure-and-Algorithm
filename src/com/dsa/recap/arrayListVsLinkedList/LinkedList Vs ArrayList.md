# LinkedLists vs ArrayLists(28-03-2024):

Which data structure is more efficient for which operation we can examine it by Java’s System class nanoTime() method.
Java’s LinedList and ArrayList Class with different Operation:

## Random Access:
Getting 0(First no index) no index from 1000000 elements by get(0) method:
LinkedList: 26200 ns
ArrayList: 9800 ns
ArrayList faster for random access LinkedList

Getting middle of value by from 1000000 by get(500000) method:
LinkedList: 4943401 ns
ArrayList: 4800 ns
ArrayList faster for random access than LinkedList



Getting last element from 1000000 by get(999999) method:
LinkedList: 7901 ns
ArrayList: 1200 ns
Here, LinkedList takes less time than previous because LinkedList in Java is a Doubly LinkedList. We can Traverse through from head or tail in LinkedList.
ArrayList faster for random access than LinkedList

## Removing element:
Remove element from first index remove(0):
LinkedList: 20401 ns
ArrayList: 887600 ns
LinkedList will take less time, and ArrayList will take much time, because it will shift all element by one from right to left
Remove element from middle index remove(500000):
LinkedList: 4395801 ns
ArrayList: 404899 ns
Here arraylist takes least time, because there needs less shifting from right to left
Remove element from the last of the list remove(999999):
LinkedList: 15199 ns
ArrayList: 8200 ns
Here arrayList takes less time.. Because there is no shifting need to insert and delete in arraylist.

So we can see arraylist is more efficient
