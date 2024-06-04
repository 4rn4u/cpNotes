public int[] toTopologialArray() {
    visited = new int[numvertices()];
    Stack<Integer> pVExplored = new ArrayStack<Integer>();
    for (int vSource = 0; vSource < numvertices(); vSource++) {
        if (visited[vSource] == 0) topologialOrder(vSource, pVExplored);
    }
    int res[] = new int[numvertices()];
    for (int i = 0; i < numVertices(); i++) res[i] = pVExplored.pop();
    return res;
}

protected void topologicalOrder(int source, Stack<Integer> pVExplored) {
    visited[source] = 1;
    ListPOI<Adjacent> aux = adjacentsTo(source);
    int target = aux.get().getTarget();
    if (visited[target] == 0) topologicalOrder(target, pVExplored);
    pVExplored.push(souce);
}
