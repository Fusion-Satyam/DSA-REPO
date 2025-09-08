package dsa_graphs;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class BFS {


    public static ArrayList<Integer> bfs(int start , ArrayList<ArrayList<Integer>> adj , boolean vis[]){
        Queue <Integer> queue = new LinkedList<>();
        queue.add(start);
        vis[start] = true;
        

            

    }
    public static void main(String[] args) {
         int n = 5;
         ArrayList<ArrayList<Integer>> adj = new ArrayList<>();

         for (int i = 0; i<=n ; i++){
            adj.add(new ArrayList<Integer>());
         }

         adj.get(0).add(1);
            adj.get(1).add(0);

            adj.get(1).add(2);
            adj.get(2).add(1);

            adj.get(2).add(3);
            adj.get(3).add(2);

            adj.get(0).add(2);
            adj.get(2).add(0);

            adj.get(1).add(3);
            adj.get(3).add(1);

            boolean vis[] = new boolean[n];

            System.out.println("BFS :");

            bfs


    }
    
}
