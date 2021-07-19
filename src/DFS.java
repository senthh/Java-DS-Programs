import java.util.Iterator;
import java.util.LinkedList;

public class DFS {
    private LinkedList<Integer> adjList[];
    private boolean visited[];

    DFS(int vertices) {

        adjList = new LinkedList[vertices];
        visited = new boolean[vertices];
        for(int v = 0; v< vertices; v++) {
            adjList[v] = new LinkedList<Integer>();
        }
    }
    void addEdge(int src, int dest) {
        adjList[src].add(dest);
    }
    public static void main(String args[]) {
        System.out.println("DFS Programs");
        DFS dfs = new DFS(4);
        dfs.addEdge(0, 1);
        dfs.addEdge(0, 2);
        dfs.addEdge(1, 2);
        dfs.addEdge(2, 3);

        dfs.dfsTraversal(0);
    }
    void dfsTraversal(int starting_vertex) {
        visited[starting_vertex] = true;
        System.out.print(starting_vertex + " ");
        Iterator<Integer> next_vertices = adjList[starting_vertex].listIterator();
        while(next_vertices.hasNext()) {
            int next_vertex = next_vertices.next();
            if( !visited[next_vertex] ) {
                dfsTraversal(next_vertex);
            }
        }

    }
}
