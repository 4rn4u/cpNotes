Pre-Order search for e in a single BST path (size N and height H):

- If e is in the root node of the BST: Tget(n=N) ∈ Ω (1)
- If e is not in the BST and is searched in its longest path:
  - BST (Degenerate): Tget(N) ∈ O(N = H)
  - BST (Balanced): Tget(N) ∈ O(log N = H)
- Average case: Tget(N) ∈ Θ(log N = H)
