public class GraphRepresent {
    public static void main(String[] args) {
        int n = 3, m = 3;
        int adj [][]= new int[n+1][n+1];
        

        //for undirected graph rule adj[i][j] = 1 and adj[j][i] = 1
        //for directed graph rule adj[i][j] = 1 and adj[j][i] = 0
        
        // undirected edge 0-->1
        adj[0][1] = 1 ;
        adj[1][0] = 1;

        //unbdirected edge 1-->2
        adj[1][2] = 1;
        adj[2][1] = 1;

        // undirected edge 2-->3
        adj[3][2] = 1;
        adj[2][3] = 1;

        //so we can understand the graph like this 
        // 0----1----2----3
       //    and now we will print the adjacency matrix
        for(int i=0; i<=n; i++){
            for(int j=0; j<=n; j++){
                System.out.print(adj[i][j]+" ");
            }
            System.out.println();
        }
 
    }
}
