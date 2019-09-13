

O(n2) algorithms
============================================
1.Bubble Sort
--------------------------------------------
The algorithm works by comparing each item in the list with the item next to it, and swapping them if required. In other words, the largest element has bubbled to the top of the array. The algorithm repeats this process until it makes a pass all the way through the list without swapping any items.

```Java
void bubbleSort(int ar[])
{
   for (int i = (ar.length - 1); i >= 0; i--)
   {
      for (int j = 1; j ≤ i; j++)
      {
         if (ar[j-1] > ar[j])
         {
              int temp = ar[j-1];
              ar[j-1] = ar[j];
              ar[j] = temp;
   } } } }
```
<strong>Example</strong>.
 Here is one step of the algorithm. The largest element - 7 - is bubbled to the top:
<pre>
<span style="color : red">7, 5,</span> 2, 4, 3, 9
5,<span style="color : red"> 7, 2,</span> 4, 3, 9
5, 2, <span style="color : red">7, 4,</span> 3, 9
5, 2, 4, <span style="color : red">7, 3, </span>9
5, 2, 4, 3,<span style="color : red"> 7, 9</span>
5, 2, 4, 3, 7, 9
</pre>
The worst-case runtime complexity is O(n2).

2.Selection Sort
--------------------------------------------
<pre>
<Strong>Step 1 </Strong> − Set MIN to location 0
<Strong>Step 2 </Strong>− Search the minimum element in the list
<Strong>Step 3 </Strong>− Swap with value at location MIN
<Strong>Step 4 </Strong>− Increment MIN to point to next element
<Strong>Step 5 </Strong>− Repeat until list is sorted
</pre>
```Java
void selectionSort(int[] ar){
   for (int i = 0; i ‹ ar.length-1; i++)
   {
      int min = i;
      for (int j = i+1; j ‹ ar.length; j++)
            if (ar[j] ‹ ar[min]) min = j;
      int temp = ar[i];
      ar[i] = ar[min];
      ar[min] = temp;
} }
```
<pre>
Example:
<span style="color : red">Red</span>: Minimum value found in left array
<span style="color : yellow">Yellow</span>: Min location ( the first position in unsorted-array)
Swap red and yellow

<span style="color : yellow">29</span>, 64, 73, 34, <span style="color : red">20</span>
20, <span style="color : yellow">64</span>, 73, 34, <span style="color : red">29</span>
20, 29, <span style="color : yellow">73</span>, <span style="color : red">34</span>, 64
20, 29, 34, <span style="color : yellow">73</span>, <span style="color : red">64</span>
20, 29, 34, 64, 73
</pre>

The worst-case runtime complexity is O(n2).

3.Insertion Sort
--------------------------------------------
<pre>
<strong>Step 1 </strong>− Assume first element is already sorted;
<strong>Step 2 </strong>− Pick from second element to end; 
<strong>Step 3 </strong>− Compare with all elements in the sorted sub-array, the sub-array befroe Target. compare from [j-1] to 0;
<strong>Step 4 </strong>− Shift all the elements (move to [j], inorder to leave old [j-1] to Target) in the sorted sub-array that is greater than the Target.
<strong>Step 5 </strong>− Insert the Target to j ( Target > ar[j-1] and set ar[j] = Target or compare to 0, set ar[0] = target);
<strong>Step 6 </strong>− Repeat until array is sorted
</pre>

```Java
void insertionSort(int[] ar)
{
   for (int i=1; i ‹ ar.length; i++)
   {
      int target = ar[i]; int j = i;
      while (j > 0 && ar[j-1] > target)
      {
           ar[j] = ar[j-1];
           j--;
      }
      ar[j] = target;
} }
```

<pre>
Example:
<span style="color : yellow">Yellow</span>: sorted sub-array
<span style="color : red">Red</span>: Target

<span style="color : yellow">29</span>, <span style="color : red">20</span>, 73, 34, 64
<span style="color : yellow">20, 29</span>, <span style="color : red">73</span>, 34, 64
<span style="color : yellow">20, 29, 73</span>, <span style="color : red">34</span>, 64
<span style="color : yellow">20, 29, 34, 73</span>, <span style="color : red">64</span>
20, 29, 34, 64, 73
</pre>

The worst-case runtimecomplexity is O(n2). The best-case runtime complexity: O(n)
********************************************





O(n log n) algorithms
============================================




O(n) algorithms
============================================




********************************************
#### Reference
https://www.cs.cmu.edu/~adamchik/15-121/lectures/Sorting%20Algorithms/sorting.html

https://www.tutorialspoint.com/
