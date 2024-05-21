public interface SortedMap<K extends Comparable<K>, V> extends Map<K, V> {
    /** Entry of the minimum key*/
    MapEntry<K, V> getMinEntry();
    /** minimum key*/
    K getMin();
    /** Entry of the maximum key*/
    MapEntry<K, V> getMaxEntry();
    /** maximum key*/
    K getMax();
    /** Next Entry to K in order*/
    MapEntry<K, V> entrySuccessor(K k);
    /** successor – next key to k in order*/
    K successor(K k);
    /** previous Entry to K in order*/
    MapEntry<K, V> entryPredecessor(K k);
    /** predecessor – previous key to k in order*/
    K predecessor(K k);
}
