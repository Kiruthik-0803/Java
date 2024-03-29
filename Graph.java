public class Graph {
    private int[][] adjMatrix;
    private int numVertices;

    public Graph(int numVertices) {
        this.numVertices = numVertices;
        adjMatrix = new int[numVertices][numVertices];
    }
    public void addEdge(int source, int destination) {
        adjMatrix[source][destination] = 1;
        adjMatrix[destination][source] = 1;
    }
    public void displayMatrix() {
        for (int i = 0; i < numVertices; i++) {
            for (int j = 0; j < numVertices; j++) {
                System.out.print(adjMatrix[i][j] + " ");
            }
            System.out.println();
        }
    }
    public void displayList() {
        for (int i = 0; i < numVertices; i++) {
            System.out.print(i + " -> ");
            for (int j = 0; j < numVertices; j++) {
                if (adjMatrix[i][j] == 1) {
                    System.out.print(j + "-> ");
                }
            }
            System.out.print("NULL");
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Graph graph = new Graph(5);
        graph.addEdge(0, 1);
        graph.addEdge(0, 2);
        graph.addEdge(1, 2);
        graph.addEdge(2, 3);
        graph.addEdge(3, 4);
        graph.displayMatrix();
        graph.displayList();
    }
}