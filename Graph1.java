import java.util.LinkedList;
class Graph1 {
    private int numVertices;
    private LinkedList<Integer>[] adjLists;
    public Graph1(int V) {
        numVertices = V;
        adjLists = new LinkedList[V];
        for (int i = 0; i < V; i++) {
            adjLists[i] = new LinkedList<>();
        }
    }
    public void addEdge(int src, int dest) {
        adjLists[src].add(dest);
        adjLists[dest].add(src); 
    }
    public void printGraph() {
        for (int i = 0; i < numVertices; i++) {
            System.out.print("Vertex " + i + ": ");
            for (int v : adjLists[i]) {
                System.out.print(v + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int V = 4; 
        Graph1 graph = new Graph1(V);
        graph.addEdge(0, 1);
        graph.addEdge(0, 2);
        graph.addEdge(0, 3);
        graph.addEdge(1, 2);
        graph.printGraph();
    }
}
