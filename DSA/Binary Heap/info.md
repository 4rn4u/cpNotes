<-- A Binary Heap is a Binary Tree (BT) -->

// Properties for Complete Binary Tree
Shape (structural) property:
a heap is a complete binary tree

Heap (sort) property:
In a min-heap, the element of a parent node is always smaller or equal than its children.

Shape property: a heap is a complete binary tree (N: size)
Its maximum height is: _log2N_
The cost of the algorithms in the worst case is logarithmic: _O(log N)_

The complete binary trees allow for an array representation: Eytzinger's method allows to represent acomplete BT in an array by placing the nodes of the BT in the same order in which they are visited on their levels path: the Root is stored in position 1 of the array; the Left Child of the Root in position 2; the Right Child of the Rootin position 3; and so on.

Given the i-th node:

- Position of its left child: _2*i (if 2*i ≤ size)_
- Position of its right child: _2*i+1 (if 2*i+1 ≤ size)_
- Position of its parent: _i/2 (if i ≠ 1)_

• Left child: theArray[2*i]
• Right child: theArray[2*i+1]
• Parent: theArray[i/2]

// Properties for Partially-Sorted Binary Tree

- ∀i: 1 < i ≤ size: theArray[i/2] ≤ theArray[i]
- Every path from the root to a leaf is a sorted sequence (ascending order in a min-heap):
- The root is the node with the smallest element (or greatest in a Max-Heap)
- Each subtree of a Heap is also a Heap

- 1 of Array always root so getMin() is O(1); insert() is O(log N); deleteMin() is O(log N);

Estimated average cost: for most operations, at least those requiring access to one of its data, it varies between O(1) and O(log size), so it is in any case sub-linear.
