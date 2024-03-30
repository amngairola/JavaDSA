# Sorting Algorithms Notes

## Bubble Sort

- **Description**: Bubble sort repeatedly steps through the list, compares adjacent elements, and swaps them if they are in the wrong order. The pass through the list is repeated until the list is sorted.

# **Key Idea**:

Bubbles "rise" to the top of the array as the algorithm progresses.

# **Remember**:

Bubble up the smallest (or largest) elements by repeatedly swapping adjacent elements.

- **Pseudocode**:
  ```
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
Worst Case: O(n^2) - when the elements are sorted in reverse order.
**Space Complexity**:
O(1) - Bubble sort is an in-place sorting algorithm.

## Insertion Sort

- **Description**: Insertion sort builds the final sorted array one item at a time. It takes each element from the list and inserts it into its correct position in the already sorted part of the list.

# **Key Idea**:

Insert each element into its proper place, like sorting a deck of cards.

# **Remember**:

Insert each new element into its proper place by shifting larger elements to the right.
Pseudocode:

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

# **Key Idea**:

=======

> > > > > > > 7ecce33be2996c21742b8b007d22c57f62382135
> > > > > > > Select the smallest element and place it in the correct position.

# **Remember**:

Select the smallest (or largest) element and swap it with the first unsorted element.

Pseudocode:

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
** Here’s a step-by-step explanation of the cycle sort algorithm**:

1-Start with an unsorted array of n elements.
2-Initialize a variable, cycleStart, to 0.
3-For each element in the array, compare it with every other element to its right. If there are any elements that are smaller than the current element, increment cycleStart.
4-If cycleStart is still 0 after comparing the first element with all other elements, move to the next element and repeat step 3.
5-Once a smaller element is found, swap the current element with the first element in its cycle. The cycle is then continued until the current element returns to its original position.
plaintext

```
CycleSort(arr):
  Begin
for
start:= 0 to n - 2 do
key := array[start]
location := start
for i:= start + 1 to n-1 do
  if array[i] < key then
     location: =location +1
done
if location = start then
    ignore lower part, go for next iteration
while key = array[location] do
   location: = location + 1
done
if location != start then
    swap array[location] with key
while location != start do
    location start


for i:= start + 1 to n-1 do
     if array[i] < key then
          location: =location +1
done
while key= array[location]
      location := location +1
 if key != array[location]
      Swap array[location] and key
   done
 done
End

```

```
arr[] = {10, 5, 2, 3}
 index =  0   1   2   3
cycle_start = 0
item = 10 = arr[0]

Find position where we put the item
pos = cycle_start
i=pos+1
while(i<n)
if (arr[i] < item)
    pos++;

We put 10 at arr[3] and change item to
old value of arr[3].
arr[] = {10, 5, 2, 10}
item = 3

Again rotate rest cycle that start with index '0'
Find position where we put the item = 3
we swap item with element at arr[1] now
arr[] = {10, 3, 2, 10}
item = 5

Again rotate rest cycle that start with index '0' and item = 5
we swap item with element at arr[2].
arr[] = {10, 3, 5, 10 }
item = 2

Again rotate rest cycle that start with index '0' and item = 2
arr[] = {2, 3,  5, 10}

Above is one iteration for cycle_stat = 0.
Repeat above steps for cycle_start = 1, 2, ..n-2
```

**Time Complexity**:
Best Case: O(n^2) - when the elements are distinct.
Average Case: O(n^2) - when the elements have many duplicates.
Worst Case: O(n^2) - when the elements are sorted in reverse order.
**Space Complexity**: O(1) - Cycle sort is an in-place sorting algorithm.
