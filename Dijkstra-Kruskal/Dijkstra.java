/**
 * Created by Khmely on 14.06.2018.
 */
public class Dijkstra {
    private int V;
    private int[][] matrix;

    Dijkstra(int v){
        V = v;
        matrix = new int[v][v];
    }
    void addVertex(){
        V++;
        int[][] tmp = new int[V][V];
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[i].length; j++){
                tmp[i][j] = matrix[i][j];
            }
        }
        matrix = tmp;
    }

    void addEdge(int v,int w, int weight){
        matrix[v][w] = weight;
        matrix[w][v] = weight;
    }
    void print(){
        System.out.print("   ");
        for (int i=0; i<matrix.length; i++){
            System.out.print(" " + (i) + " ");
        }
        System.out.println();
        System.out.print("   ");
        for (int i=0; i<matrix.length; i++){
            System.out.print("---");
        }
        System.out.println();
        for(int i=0; i<matrix.length; i++){
            System.out.print(i + " |");
            for(int j=0; j<matrix[i].length; j++){
                System.out.print(" " + matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    void dijkstra()
    {
        int src = 0;
        int[] dist = new int[V];
        int[] prev = new int[V];
        boolean[] visited = new boolean[V];

        for (int i = 0; i < V; i++) {
            prev[0] = -1;
            dist[i] = Integer.MAX_VALUE;
            visited[i] = false;
        }
        dist[src] = 0;

        for (int x = 0; x < V-1; x++) {
            int u = minDist(dist, visited);
            visited[u] = true;
            for (int v = 0; v < V; v++) {
                if (!visited[v] && matrix[u][v] != 0 && dist[u] + matrix[u][v] < dist[v]) {
                    prev[v] = u;
                    dist[v] = dist[u] + matrix[u][v];
                }
            }
        }

       
        System.out.println("Distance - Path");
        for (int i = 1; i < V; i++) {
            System.out.print(dist[i] + "\t\t" + 0 + " ");
            printPath(prev, i);
            System.out.println();
        }

    }

    int minDist(int dist[], boolean used[])
    {
        int min = Integer.MAX_VALUE;
        int min_index = 0;

        for (int v = 0; v < V; v++)
        {
            if (!used[v] && dist[v] <= min) {
                min = dist[v];
                min_index = v;
            }
        }

        return min_index;
    }

    void printPath(int prev[], int j)
    {
        if (prev[j]==-1)
            return;

        printPath(prev, prev[j]);

        System.out.print(j + " ");
    }
}
