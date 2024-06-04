public class breadth {
    protected int visited[];
    protected int orderVisited[];
    protected Queue<Integer> q;

    public int[] toArrayBFS(){
        int res[] new int[numVertices()];
        visited = new int[numVertices()];
        orderVisited = 0;
        q = new ArrayQueue<Integer>();
        for (int i = 0; i< numVertices(); i++){
            if (visited[i] == 0) toArrayBFS(i,res);
        }
        return res;
    }

    protected void toArrayBFS(int v, int[] res){
        res[orderVisited++] = v;
        visited[v] = 1;
        q.enqueue;
        while(!q.isEmpty()){
            ListPOI<Adjacent> l = adjacentsTo(u);
            for(l.begin(); !l.isEnd(); l.next()){
                int w = l.get().getTarget();
                if (visited[w] == 0){
                    res[orderVisited++] = w;
                    visited[v] = 1;
                    q.enqueue(w);
                }
            }
        }
    }
}
