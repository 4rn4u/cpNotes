public class depth {
    protected int visited[];
    protected int orderVisited;

    public int[] toArrayDFS(){
        int res[] = new int[numVertices()];
        visited = new int[numVertices()];
        orderVisited = 0;
        for (int i = 0; i<numVertices(); i++){
            if (visited[i] == 0) toArrayDFS(i,res);
        }
        return res;
    }

    protected void toArrayDFS(int v, int res[]){
        res[orderVisited++] = v;
        visited[v] = 1
        ListPOI<Adjacent> l = adjacentsTo(v);
        for (l.begin(); !l.isEnd(); l.next()){
            int w = l.get().getTarget();
            if (visited[w] == 0) toArrayDFS(w, res);
        }
    }

}

public class depth {
    protected int visited[];
    protected int orderVisited[];

    public int[] toArrayDFS(){
        int[] res = new int[numVertices()];
        visited = new int[numVertices()];
        orderVisited = 0;
        for (int i = 0; i<numVertices(); i++){
            if (visited[i] == 0) toArrayDFS(i, res);
        }
        return res;
    }

    protected void toArrayDFS(int v, int[] res){
        res[orderVisisted++] = v;
        visited[v] = 1;
        ListPOI<Adjacent> l = adjacentsTo(v);
        for (l.begin(); !l.isEnd(); l.next(){
            int w = l.get().getTarget();
            if (visited[w] == 0) toArrayDFS(w,res);
        }
    }
}
