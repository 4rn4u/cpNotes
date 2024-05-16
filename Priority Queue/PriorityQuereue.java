public interface PriorityQueue<E extends Comparable<E>> {
    /** Taken into account its priority, adds Element e to a PQ. */
    void add(E e);

    /** IFF !isEmpty():
     * gets and removes the Element with the highest priority from a PQ.
     */
    E removeMin();

    /** IFF !isEmpty():
     * gets the Element with the highest priority from a PQ. */
    E getMin();

    /** Checks whether a PQ is empty. */
    boolean isEmpty();
}
