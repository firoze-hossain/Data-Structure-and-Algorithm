# Quick Sort(12-04-2024):
1) Quick sort is a in-place algorithm
2) It is a recursive divide and conquer algorithm
3) It works with pivot
4) The smaller element is always on the left of pivot
5) We can set pivot to start or middle or end of our array, but the standard is to set at the end
   ![quick sort](https://media.geeksforgeeks.org/wp-content/uploads/20231219164812/Quick-Sort-Algorithm.png "quick sort")
6) It always divides the array with two partitions recursively
### Complexity:
#### Runtime:
The best and average case: O(nlogn)-Quasilinear
Worst case: O(n^2)- If array is sorted(already)
### Space:
O(logn)- It uses in-place, But takes more space than bubble,insertion,selection
It uses call stack- So it takes more memory