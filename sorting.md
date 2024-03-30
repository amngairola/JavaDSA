# Sorting Algorithms Notes
Select the smallest element and place it in the correct position.

# **Remember**:

Select the smallest (or largest) element and swap it with the first unsorted element.

Pseudocode:
plaintext

```
SelectionSort(arr):
  n = length of arr
  for i from 0 to n-1:
      min_index = i
      for j from i+1 to n-1:
          if arr[j] < arr[min_index]:
              min_index = j
      swap(arr[min_index], arr[i])
```

Selection Sort
**Time Complexity**:
Best Case: O(n^2) - always.
Average Case: O(n^2) - always.
Worst Case: O(n^2) - always.
**Space Complexity**: O(1) - Selection sort is an in-place sorting algorithm.

### Cycle Sort

- **Description**: Cycle sort is an in-place sorting algorithm that works by minimizing the number of memory writes. It is based on the idea that array elements are placed in their correct position one at a time.

# **Key Idea**:

Cycle through the array to find the correct position for each element.

# **Remember**:

Cycle through the array to place each element where it belongs, minimizing writes.
Pseudocode:
plaintext

```
CycleSort(arr):
  OptimizedCycleSort(arr):
  n = length of arr
  for cycle_start from 0 to n-2:
      item = arr[cycle_start]
      pos = cycle_start
      for i from cycle_start+1 to n-1:
          if arr[i] < item:
              pos = pos + 1
      if pos == cycle_start:
          continue
      while item == arr[pos]:
          pos = pos + 1
      if pos != cycle_start:
          swap(item, arr[pos])
      while pos != cycle_start:
          pos = cycle_start
          for i from cycle_start+1 to n-1:
              if arr[i] < item:
                  pos = pos + 1
          while item == arr[pos]:
              pos = pos + 1
          if item != arr[pos]:
              swap(item, arr[pos])

```

**Time Complexity**:
Best Case: O(n^2) - when the elements are distinct.
Average Case: O(n^2) - when the elements have many duplicates.
Worst Case: O(n^2) - when the elements are sorted in reverse order.
**Space Complexity**: O(1) - Cycle sort is an in-place sorting algorithm.
