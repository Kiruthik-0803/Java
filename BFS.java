import java.util.*;
import java.util.LinkedList;
public class BFS {
    static LinkedList<Integer> adj[];
    static int nodes;
    public BFS(int nodes) {
        BFS.nodes = nodes;
        adj = new LinkedList[nodes];
        for (int i = 0; i < nodes; i++) {
            adj[i] = new LinkedList<>();
        }
    }

    void addedge(int u, int v) {
        adj[u].add(v);
        adj[v].add(u);
    }

    static void displayadjacencylist(LinkedList<Integer> adj[], int V) {
        for (int i = 0; i < V; i++) {
            System.out.print(i + "->");
            for (int x : adj[i]) {
                System.out.print(x + "-> ");
            }
            System.out.println("NULL ");

        }
    }

    public static void Breadthfirstsearch(int s) {
        boolean visited[] = new boolean[nodes];
        LinkedList<Integer> queue = new LinkedList<Integer>();
        visited[s] = true;
        queue.add(s);

        while (!queue.isEmpty()) {
            s = queue.poll();
            System.out.print(s + " ");

            for (int n : adj[s]) {
                if (!visited[n]) {
                    visited[n] = true;
                    queue.add(n);
                }
            }
        }
    }

    public static void main(String args[]) {
        BFS g = new BFS(4);
        g.addedge(0, 1);
        g.addedge(1, 2);
        g.addedge(2, 3);
        g.addedge(3, 0);
        displayadjacencylist(g.adj, 4);
        System.out.println("BFS:");
        Breadthfirstsearch(2);
    }
}
