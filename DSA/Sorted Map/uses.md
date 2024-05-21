_Time-sensitive applications:_ applications with strong temporal constraints:

- An airport landing runway reservation system, which accepts only one landing request at a time t IFF no other landing is planned in the k minutes before or after t and the current (tcurrent) time. Example: for tcurrent=37', k=3 and a reservation list R=[41.2', 49', 56.3'], the request t=44' will NOT be accepted; but the request for t=53' will be accepted.
- The Completely Fair Scheduler (CFS) which the Linux kernel uses, maintains a list sorted by the amount of execution time in nanoseconds that a given task has already taken (virtual execution time). The shorter the runtime for a task, the greater its need to access the processor, and therefore the closer to the top of the list it is.
- Various problems of Computational Geometry:

  - The generation of Voronoi Diagrams: https://en.wikipedia.org/wiki/Voronoi_diagram
  - The problem of finding a pair of closest points of a set in a metric space: https://en.wikipedia.org/wiki/Closest_pair_of_points_problem

- Applications where the keys:

  - Belong to a completely sorted set (e.g. String objects).
  - Therefore, searches can be performed based either on these keys or on their nearest "neighbours" (predecessors and/or successors) or on their suffixes and/or prefixes.
  - Examples:

    - Internet routers
    - Simple Spell Checkers
    - The "AutoComplete" function of a Predictive Editor

  - Problem 1: List in Order the Entries of a Map
    - Design a static, generic, iterative method, entries, that returns a ListPOI with the Entries of a non-empty SortedMap in ascending order.
  - Problem 2: Sorting
    - Design a static, generic, iterative method, mapSort, that, with the help of a SortedMap, sorts the elements (Comparable) of a non-empty array, without duplicates.
  - Problem 3: 2-SUM (simplification of the subset sum problem)
    - Design a static, iterative method, 2ThatSum, that, given a nonempty array v of integers and an integer k, determines whether there exist in v two numbers which sum is k. Use a SortedMap as an auxiliary EDA.
