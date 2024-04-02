# Learn Interpolation search in 8 minutes(02-04-2024):
Interpolation Search implements/improves over binary search , but it is better for uniformly distributed(1,2 ,3,4,5,6 etc) data. Basically the term “guesses” are involved in interpolation search. The value might be based on calculated probe results, if the probe is incorrect, the search area becomes narrow and it creates a new probe.

i)Average Case: O(log(logn))
ii)Worst Case: O(n)-Linear time- It works proportionally if values increase exponentially.
### The formula of find the probe:
int probe = low + (high - low) * (value - arr[low]) / (arr[high] - arr[low]);
### For difficult data set:
int[] arr = {1, 2, 4, 8, 16, 32, 64, 128, 256, 512, 1024};
int index = interpolationSearch(arr, 256);
There happens five guesses:
#### Results:
Probe: 2
Probe: 4
Probe: 6
Probe: 7
Probe: 8
Element found at index: 8

### For Uniformly Distributed data:
//the value is increased by one
There happens only one guess:
int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
int index = interpolationSearch(arr, 8);
#### Results:
Probe: 7
Element found at index: 7
