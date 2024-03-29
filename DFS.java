import java.util.*;
import java.util.LinkedList;
public class DFS1 {
    static LinkedList<Integer> adj[];
    static int nodes;

    public DFS1(int nodes) {
        DFS.nodes = nodes;
        adj = new LinkedList[nodes];
        for (int i = 0; i < nodes; i++) {
            adj[i] = new LinkedList<>();
        }
    }

    void addEdge(int u, int v) {
        adj[u].add(v);
        adj[v].add(u);
    }

    static void displayAdjacencyList(LinkedList<Integer> adj[], int V) {
        for (int i = 0; i < V; i++) {
            System.out.print(i + "->");
            for (int x : adj[i]) {
                System.out.print(x + "-> ");
            }
            System.out.println("NULL ");
        }
    }

    public static int countConnectedNodes() {
        boolean[] visited = new boolean[nodes];
        int count = 0;

        for (int i = 0; i < nodes; i++) {
            if (!visited[i]) {
                depthFirstSearch(i, visited);
                count++;
            }
        }

        return count;
    }

    public static void depthFirstSearch(int start, boolean[] visited) {
        Stack<Integer> stack = new Stack<>();
        visited[start] = true;
        stack.push(start);

        while (!stack.isEmpty()) {
            int node = stack.pop();

            for (int n : adj[node]) {
                if (!visited[n]) {
                    visited[n] = true;
                    stack.push(n);
                }
            }
        }
    }

    public static void main(String args[]) {
        DFS1 g = new DFS1(4);
        g.addEdge(0, 1);
        g.addEdge(1, 2);
        g.addEdge(2, 3);
        g.addEdge(3, 0);
        displayAdjacencyList(g.adj, 4);
        System.out.println("Number of connected nodes: " + countConnectedNodes());
    }
}
