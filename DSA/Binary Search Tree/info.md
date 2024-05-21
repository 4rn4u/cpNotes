_Linear_ data structures allow to describe sets of data that allow relationships of successor (or of predecessor).
-Example: list of customers of an enterprise, jobs in the print queue, etc.

_Trees_ allow to represent hierarchical structures among data sets.

- Example: structure of directories, genealogic tree, arithmetic expressions, etc.

- A _Balanced Binary Search Tree (BST)_ is a Binary Tree (BT) such that:
  1. STRUCTURAL PROPERTY: Balanced BT
  2. SORT PROPERTY: Sorted Search Property
- An BT is Searchable or satisfies the Sorted Search property if:
  - All the data in its left (sub)tree is less than, or equal, to that located at its root node
  - All the data in its right (sub)tree is greater than the one at its root node
  - The left and right (sub)trees are also BST

Each Edge (u, v) is labelled by the range of data that can bereached from u, which becomes smaller as the depth of u increases:

- when get (13) only one Path can be followed from the Root, the one where 13 is located by definition of the BST.
- when get (14) as it is not in the BST, the only point in the BST where it could be, i.e. its insertion point, is located.

Finding a data d in O(H), i.e. O(log N), in a balanced BST (BST) where H is the height of the tree, since only one of its paths from the root has to be explored in depth:

- Operations where it is possible: get(e), add(e), remove(e), getMin(), removeMin(), getMax(), removeMax(), successor(e), predecesor(e), etc.
- Ascending sorting of the data in �(N), as it is enough to traverse it In-Order.
- Computing the size of a BST and the size of each of its nodes (sub-trees) in O(1), as there is only one insertion and deletion path, the size of its nodes can be computed as the BST is being created:
  - inserting Element e creates the leaf node containing it with size 1
  - when inserting/deleting a proper descendant of a given node of a BST its
    size is increased/decreased by 1
- Selection of the k-th smallest element of a Collection in O(H), i.e. O(logN), in a balanced BST
- Range operations in O(H), i.e. O(log N), in a balanced BST

_A BT is Balanced if the difference in heights between its left and right children is at most 1_

Types of BST: Complete and Balanced, Balanced and not Complete, Degenerate
