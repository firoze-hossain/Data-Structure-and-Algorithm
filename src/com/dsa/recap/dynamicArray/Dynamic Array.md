## Dynamic Arrays(26-03-2024):

### Static Array:
It has fixed sized capacity when declared at compile time. We can not increase its size after declaration. Find index happens in constant time O(1). But deleting and searching elements happen in Linear time O(n).  And also the search element is Linear time O(n). Cause it search the element from first to last
i)Deleting element - It shifts element by one form right to left
ii)Insert element -It shifts element from left to right to make location available
[Note: But inserting and deleting element in the last, it happens at O(1) constant time, because no shifting needed]
It holds contiguous memory locations.
![Static](https://sbme-tutorials.github.io/gallery/dna_array.svg "Static")
### Dynamic Array:
It’s all operations like inserting and deleting , get the index happens like a static array. But When the element size becomes full we can say it another way when size==capacity, it increases its size. It’s means internally it declares another array capacity of double(capacity*2) of present’s array. Then it copies all elements from previous to new. It happens in O(n) linear time.But the memory address of copied elements become different.And we don;t need the double capacity so we can reverse as the same way.
![dynamic](https://media.geeksforgeeks.org/wp-content/uploads/dynamicarray.png "dynamic")

### Advantages of Dynamic array:
i) Random access element O(1) constant time
ii) Good locality and cache utilisation(Because memory address of elements are consecutive)
iii) Insert and delete element at the ended happens in O(1) time

### Disadvantages of Dynamic Array:
i)Waste more memory than linked list(suppose we need to insert one new element when the capacity is full of array, but it grows capacity double, extra memory addresses are wasted)
ii)Shifting elements are time consuming -Linear time O(n)
iii)Expanding and shrinking size happens at Linear time
