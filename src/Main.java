import java.util.*;

public class GudangGraph {

    static final int JUMLAH_NODE = 5;
    static String[] gudang = {"A", "B", "C", "D", "E"};
    static int[][] adjacencyMatrix = new int[JUMLAH_NODE][JUMLAH_NODE];

    // Inisialisasi adjacency matrix
    public static void buatGraph() {
        adjacencyMatrix[0][1] = 1; // A -> B
        adjacencyMatrix[0][2] = 1; // A -> C
        adjacencyMatrix[1][3] = 1; // B -> D
        adjacencyMatrix[2][3] = 1; // C -> D
        adjacencyMatrix[3][4] = 1; // D -> E
        adjacencyMatrix[1][4] = 1; // B -> E
        adjacencyMatrix[2][0] = 1; // C -> A
    }

    // BFS dari gudang A
    public static void bfs(int start) {
        boolean[] visited = new boolean[JUMLAH_NODE];
        Queue<Integer> queue = new LinkedList<>();

        visited[start] = true;
        queue.add(start);

        System.out.print("Jalur BFS dari gudang A: ");

        while (!queue.isEmpty()) {
            int current = queue.poll();
            System.out.print(gudang[current] + " ");

            for (int i = 0; i < JUMLAH_NODE; i++) {
                if (adjacencyMatrix[current][i] == 1 && !visited[i]) {
                    visited[i] = true;
                    queue.add(i);
                }
            }
        }
        System.out.println();
    }

    // DFS dari gudang A
    public static void dfs(int start, boolean[] visited) {
        visited[start] = true;
        System.out.print(gudang[start] + " ");

        for (int i = 0; i < JUMLAH_NODE; i++) {
            if (adjacencyMatrix[start][i] == 1 && !visited[i]) {
                dfs(i, visited);
            }
        }
    }

    public static void tampilkanMatrix() {
        System.out.println("Adjacency Matrix:");
        System.out.print("  ");
        for (String g : gudang) {
            System.out.print(g + " ");
        }
        System.out.println();
        for (int i = 0; i < JUMLAH_NODE; i++) {
            System.out.print(gudang[i] + " ");
            for (int j = 0; j < JUMLAH_NODE; j++) {
                System.out.print(adjacencyMatrix[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void main(String[] args) {
        buatGraph();
        tampilkanMatrix();
        bfs(0); // mulai dari A (index 0)

        System.out.print("Jalur DFS dari gudang A: ");
        boolean[] visited = new boolean[JUMLAH_NODE];
        dfs(0, visited);
        System.out.println();
    }
}
