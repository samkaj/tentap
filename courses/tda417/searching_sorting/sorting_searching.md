# Binary search

Binary search is the most commmon search algorithm for sorted arrays. It has a time complexity of O(log N).

## Procedure

For an array a, with goal g.
Do the following while the low <= high:

1. If the midpoint is less than the goal:

    - Set the low point to mid + 1
2. If the midpoint is greater than the goal:

    - Set the high point to mid - 1
3. If the midpoint equals the goal:

    - We have found the goal, return the index

## Pseudocode

```pseudo
function binary_search(a, g)
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
