# sorting-algorithms

## Integer Sort

Counting algorithms

## Comparison Sort

Comparison Sorts compare element at each stap of the algorithm to determine in the element should be to the left or right of another. Lower bound is **Olog( n)**

## Running time and Space complexity

|    Algorithm    | Best-case | Worst-case | Average-case | Space-complexity  |   stable    |
| :-------------: | :-------: | :--------: | :----------: | :---------------: | :---------: |
|   Merge Sort    | O(nlogn)  |  O(nlogn)  |   O(nlogn)   |       O(n)        |     yes     |
|   Quick Sort    | O(nlogn)  |   O(n^2)   |   O(nlogn)   | log n best, n avg | usually not |
| Insertion Sort  |   O(n)    |   O(n^2)   |    O(n^2)    |       O(1)        |     yes     |
|   Bubble Sort   |   O(n)    |   O(n^2)   |    O(n^2)    |       O(1)        |     yes     |
|    Heap Sort    | O(nlogn)  |  O(nlogn)  |   O(nlogn)   |       O(1)        |     No      |
| Comparison Sort | O(k + n)  |  O(k + n)  |   O(k + n)   |     O(k + n)      |     yes     |

## Merge Sort

Mergesort is a divide and conquer, comparison-based algorithm that focuses on how to merge together two pre-sorted arrays such that the resulting array is also sorted. It divides input array into two halves, calls itself for the two halves and then merge the two sorted halves.

```{r, eval=FALSE}
A = [13, 21, 9, 23, 41, 17, 8, 12]
-> [13, 21, 9, 23] | [41, 17, 8, 12]
-> [13, 21] | [9, 23] || [41, 17] | [8, 12]
-> [13] | [21] || [9] |[23] ||| [41] | [17] || [8] | [12]
-> [13, 21] | [9, 23] || [17, 41] | [8, 12]
-> [9, 13, 21, 23] | [8, 12, 17, 41]
-> [8, 9, 12, 13, 17, 21, 23, 41]
```
