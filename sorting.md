# Sorting Algorithms Notes

## Bubble Sort

- **Description**: Bubble sort repeatedly steps through the list, compares adjacent elements, and swaps them if they are in the wrong order. The pass through the list is repeated until the list is sorted.
  **Key Idea**: Bubbles "rise" to the top of the array as the algorithm progresses.
  **Remember**: Bubble up the smallest (or largest) elements by repeatedly swapping adjacent elements.

- **Pseudocode**:
  ```plaintext
  BubbleSort(arr):
      n = length of arr
      for i from 0 to n-1:
          for j from 0 to n-i-1:
              if arr[j] > arr[j+1]:
                  swap(arr[j], arr[j+1])
  ```

**Time Complexity**:
Best Case: O(n) - when the list is already sorted.
Average Case: O(n^2) - when the elements are randomly arranged.
Worst Case: O(n^2) - when the elements are sorted in reverse order. \***\*Space Complexity\*\***: O(1) - Bubble sort is an in-place sorting algorithm.

## Insertion Sort

- **Description**: Insertion sort builds the final sorted array one item at a time. It takes each element from the list and inserts it into its correct position in the already sorted part of the list.

**Key Idea**: Insert each element into its proper place, like sorting a deck of cards.
**Remember**: Insert each new element into its proper place by shifting larger elements to the right.
Pseudocode:
plaintext

```InsertionSort(arr):
  n = length of arr
  for i from 1 to n-1:
      key = arr[i]
      j = i - 1
      while j >= 0 and arr[j] > key:
          arr[j + 1] = arr[j]
          j = j - 1
      arr[j + 1] = key

```

**Time Complexity**:
Best Case: O(n) - when the list is already sorted.
Average Case: O(n^2) - when the elements are randomly arranged.
Worst Case: O(n^2) - when the elements are sorted in reverse order.
**Space Complexity**: O(1) - Insertion sort is an in-place sorting algorithm.

## Selection Sort

- **Description**: Selection sort repeatedly finds the minimum element from the unsorted part of the array and moves it to the beginning. The sorted array is built one element at a time.

**Key Idea**: Select the smallest element and place it in the correct position.
**Remember**: Select the smallest (or largest) element and swap it with the first unsorted element.

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

**Key Idea**: Cycle through the array to find the correct position for each element.

**Remember**: Cycle through the array to place each element where it belongs, minimizing writes.
Pseudocode:
plaintext

```
CycleSort(arr):
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
