# Hash Tables(13-05-2024):
A hashtable is a key-value(also known as entry) pair.
i) Hashtable generates unique key for the value
### Advantages:
i) Fast insertion,deletion,look up
ii) It is not good for small data set,but good for large data set
### Hashing:
i) Takes keys and hashCode() method generates hash Integer value based on the type of data structure that is used for the key.
Index=key.hashCode()%11(capacity of hashtable)
### Bucket:
i) It is a indexed storage location for one or more entries
ii) Can store multiple entries in case of collision(behaving as LiknedList)
### Collision:
i) When hashcode method generates same index value for more than one key
ii) Less collision more efficiency
### Complexity:
### Runtime:
O(1)-Constant time
O(n)-Linear time-> If collision occurs
