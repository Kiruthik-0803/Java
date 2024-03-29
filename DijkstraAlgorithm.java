import java.util.*;
public class DijkstraAlgorithm {
    private static final int INF = Integer.MAX_VALUE;
    public static void dijkstra(int[][] graph, int start) {
        int n = graph.length;
        int[] distance = new int[n];
        boolean[] visited = new boolean[n];
        Arrays.fill(distance, INF);
        distance[start] = 0;
        for (int count = 0; count < n - 1; count++) {
            int u = minDistance(distance, visited);
            visited[u] = true;
            for (int v = 0; v < n; v++) {
                if (!visited[v] && graph[u][v] != 0 && distance[u] != INF && distance[u] + graph[u][v] < distance[v]) {
                    distance[v] = distance[u] + graph[u][v];
                }
            }
        }
     printSolution(distance);
    }
    private static int minDistance(int[] distance, boolean[] visited) {
        int min = INF;
        int minIndex = -1;
        for (int i = 0; i < distance.length; i++) {
            if (!visited[i] && distance[i] <= min) {
                min = distance[i];
                minIndex = i;
            }
        }
        return minIndex;
    }
    private static void printSolution(int[] distance) {
        System.out.println("Vertex \t Distance from Source");
        for (int i = 0; i < distance.length; i++) {
            System.out.println(i + " \t\t " + distance[i]);
        }
    }
    public static void main(String[] args) {
        int[][] graph = {
            {0, 4, 0, 0, 0, 0, 0, 8, 0},
            {4, 0, 8, 0, 0, 0, 0, 11, 0},
            {0, 8, 0, 7, 0, 4, 0, 0, 2},
            {0, 0, 7, 0, 9, 14, 0, 0, 0},
            {0, 0, 0, 9, 0, 10, 0, 0, 0},
            {0, 0, 4, 14, 10, 0, 2, 0, 0},
            {0, 0, 0, 0, 0, 2, 0, 1, 6},
            {8, 11, 0, 0, 0, 0, 1, 0, 7},
            {0, 0, 2, 0, 0, 0, 6, 7, 0}
        };
        dijkstra(graph, 0);
    }
}
