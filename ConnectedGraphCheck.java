import java.util.*;
public class ConnectedGraphCheck {
    static int[] visited;
    static List<List<Integer>> graph;

    public static void main(String[] args) {
        int n = 7; 
        visited = new int[n];
        graph = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            graph.add(new ArrayList<>());
        }
        addEdge(0, 1);
        addEdge(0, 2);
        addEdge(1, 2);
        addEdge(2, 3);
        addEdge(3, 4);
        addEdge(4, 5);
        addEdge(5, 6);

        int source = 0;
        int destination = 6;

        if (isConnected(source, destination)) {
            System.out.println("Node " + source + " and Node " + destination + " are connected.");
        } else {
            System.out.println("Node " + source + " and Node " + destination + " are not connected.");
        }
    }
    public static void addEdge(int u, int v) {
        graph.get(u).add(v);
        graph.get(v).add(u); 
    }
    public static void DFS(int node) {
        visited[node] = 1;
        for (int neighbor : graph.get(node)) {
            if (visited[neighbor] == 0) {
                DFS(neighbor); 
            }
        }
    }
    public static boolean isConnected(int source, int destination) {
        Arrays.fill(visited, 0); 
        DFS(source); 
        return visited[destination] == 1;
    }
}
