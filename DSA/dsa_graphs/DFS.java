package dsa_graphs;

import java.util.*;


public class DFS {

    // Perform DFS from a starting node
    public static void dfs(int node, ArrayList<ArrayList<Integer>> adj, boolean[] visited) {
        visited[node] = true;
        System.out.print(node + " ");

        // Visit all unvisited neighbors
        for (int neighbor : adj.get(node)) {
            if (!visited[neighbor]) {
                dfs(neighbor, adj, visited);
            }
        }
    }

    public static void main(String[] args) {
        int v = 5;  // number of vertices (0 to 4)

        // Step 1: Create an adjacency list
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < v; i++) {
            adj.add(new ArrayList<>());
        }

        // Step 2: Add edges (undirected graph)
        adj.get(0).add(1);
        adj.get(1).add(0);

        adj.get(0).add(2);
        adj.get(2).add(0);

        adj.get(1).add(3);
        adj.get(3).add(1);

        adj.get(2).add(4);
        adj.get(4).add(2);

        // Step 3: Prepare visited array
        boolean[] visited = new boolean[v];

        // Step 4: Perform DFS starting from node 0
        System.out.print("DFS Traversal: ");
        dfs(0, adj, visited);
    }
}
