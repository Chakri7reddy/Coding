import java.util.*;

public class Dijkstra {
    private static final int INF = Integer.MAX_VALUE;
    public static void dijkstra(int[][] graph, int src) {
        int n = graph.length;
        int[] dist = new int[n];
        boolean[] visited = new boolean[n];
        Arrays.fill(dist, INF);
        dist[src] = 0;
        for (int count = 0; count < n - 1; count++) {
            int u = minDistance(dist, visited);
            visited[u] = true;
            for (int v = 0; v < n; v++) {
                if (!visited[v] && graph[u][v] != 0 && dist[u] != INF && dist[u] + graph[u][v] < dist[v]) {
                    dist[v] = dist[u] + graph[u][v];
                }
            }
        }
        printSolution(dist);
    }
    private static int minDistance(int[] dist, boolean[] visited) {
        int min = INF, minIndex = -1;
        for (int v = 0; v < dist.length; v++) {
            if (!visited[v] && dist[v] < min) {
                min = dist[v];
                minIndex = v;
            }
        }
        return minIndex;
    }
    private static void printSolution(int[] dist) {
        System.out.println("Vertex \t Distance from Source");
        for (int i = 0; i < dist.length; i++) {
            System.out.println(i + " \t\t " + dist[i]);
        }
    }
    public static void main(String[] args) {
        int[][] graph = {
                {0, 2, 4, 0, 0},
                {2, 0, 0, 0, 3},
                {4, 0, 0, 1, 2},
                {0, 0, 1, 0, 1},
                {0, 3, 2, 1, 0}
        };
        int src = 0;
        dijkstra(graph, src);
        System.out.println("Lokireddy Chakridhar Reddy - 2022601278 ");
    }
}