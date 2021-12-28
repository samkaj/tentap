# Searching and sorting

## Binary search

Binary search is the most commmon search algorithm for sorted arrays. It has a time complexity of O(log N).

### Procedure for binary search

For an array a, with goal g.
Do the following while the low <= high:

1. If the midpoint is less than the goal:

    - Set the low point to mid + 1
2. If the midpoint is greater than the goal:

    - Set the high point to mid - 1
3. If the midpoint equals the goal:

    - We have found the goal, return the index

### Code for binary search

```python
def binary_search(a, g);
    lo = 0
    hi = length of a
    mid = (lo + hi) / 2

    while lo <= hi:
        if a[mid] < goal:
            lo = mid + 1
        else if a[mid] > goal:
            hi = mid - 1
        else
            return mid
    
    return not found // this is if no element is found in the array
```

## Insertion sort

Small sorting algorithm for small arrays, the procedure is like arranging a hand of cards.  

### Procedure for insertion sort

Start with the whole array, we will divide it into two parts, one sorted, one unsorted.

- Mark the first element as sorted.

- Take the first element in the unsorted array and insert it into the sorted list where it belongs. Use binary search to find insertion point.

- When the unsorted part is empty, we're done.

### Code for insertion sort

```python
def insertion_sort(a):
    for i = 0; i < len(a); i++:
        val = a[i]
        j = i - 1
        while j > 0 and a[j-1] > val:
            a[j] = a[j-1]
            j--
        a[j] = val
```
