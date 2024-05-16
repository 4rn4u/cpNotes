public class BinaryHeap<E extends Comparable<E>> implements PriorityQueue<E> {
protected static final int DEFAULT_CAPACITY = 11;
// A Heap is a Complete Binary Tree, and thus,...
// HAS AN Implicit Representation
protected E[] theArray;
// HAS A size or number o nodes
protected int size;
/** Creates an empty Priority Queue (PQ)
* with initial capacity DEFAULT_CAPACITY
*/
public BinaryHeap() { this(DEFAULT_CAPACITY); }
/** Creates an empty Priority Queue (PQ)
* with initial capacity n
*/
@SuppressWarnings("unchecked")
public BinaryHeap(int n) {
theArray = (E[]) new Comparable[n];
size = 0;
}
