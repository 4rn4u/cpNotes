Method Add:

- Best case: when the element to insert is greater than its parent (only one comparison) Ω(1)
- Worst case: the complexity is O(log2n) if the added element
  is the new minimum: h = log2n
- It has been empirically proved that on average 2.6 comparisons are needed to insert a new element (constant complexity Θ(1)):

Method removeMin:

- Best case: The root data is the new minimum of the Heap, soit does NOT have to be sunk Ω(1)
- Worst case: The data in the root is a new maximum of the Heap, so we have to sink currPos to one leaf, i.e. h = log2n times or O(log2n)
- On average: Θ (log2n)

Method Arrange (recursive):
Size of the problem (n); the height of the complete BT to rearrange (h = log2n)

- Recurrence relation for the general case (for a BT that is not a leaf;n>0):
  - Tarrange(h) = 2 \* Tarrange(h - 1) + Tsink(x)
  - Best case (best case of sink ∈ Ω(1)):
    TB (h) = 2 _ TB (h - 1) + k _ 1
    TB arrange (h=log2n) ∈ Θ(2h=2log2n=n) → TB arrange (n) ∈ Ω(�)
  - Worst case (worst case of sink ∈ Ω(ℎ)):
    Tw (h) = 2 _ Tw (h - 1) + k _ h
    Tw arrange (h=log2n) ∈ Θ(2h=2log2n=n) → Tw arrange (n) ∈ �(�)
  - Average case: Tarrange(n) ∈ Θ(�)

Method Arrange (iterative):

- Average case: TarrangeIterative (n) ∈ Θ(�)

HeapSort:

- The cost of HeapSort is O(N\*log2N)
  - QuickSort has a complexity O(N2) as worst case
  - MergeSort needs an auxiliar array
- Cost HeapSort = cost constructor + N * cost of removeMin
  TheapSort(N) ∈ O(N) + N*O(log2N) = O(N\*log2N)
  - Cost HeapSort to sort only the first k elements of the array: O(N + k\*log2N)
