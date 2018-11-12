/**
 * Created by Khmely on 14.06.2018.
 */
public class Main {

    public static void main(String[] args) {
        Dijkstra tab = new Dijkstra(7);

        tab.addEdge(0,1, 8);
        tab.addEdge(0,3, 4);
        tab.addEdge(0,4, 2);
        tab.addEdge(1,2, 1);
        tab.addEdge(2,3, 2);
        tab.addEdge(2,6, 6);
        tab.addEdge(3,6, 3);
        tab.addEdge(4,5, 14);
        tab.addEdge(5,6, 9);
        tab.addEdge(3,5, 13);
        tab.addEdge(2,5, 20);

        tab.dijkstra();


        int V = 6;  // Number of vertices in graph
        int E = 8;  // Number of edges in graph
	        Graph graph = new Graph(V, E);

	        // add edge 0-1
	        graph.edge[0].src = 0;
	        graph.edge[0].dest = 1;
	        graph.edge[0].weight = 5;

	        // add edge 0-2
	        graph.edge[1].src = 1;
	        graph.edge[1].dest = 2;
	        graph.edge[1].weight = 8;

	        // add edge 0-3
	        graph.edge[2].src = 0;
	        graph.edge[2].dest = 3;
	        graph.edge[2].weight = 4;

	        // add edge 1-3
	        graph.edge[3].src = 0;
	        graph.edge[3].dest = 4;
	        graph.edge[3].weight = 1;

	        // add edge 1-4
	        graph.edge[4].src = 4;
	        graph.edge[4].dest = 5;
	        graph.edge[4].weight = 10;

	        graph.edge[5].src = 2;
	        graph.edge[5].dest = 5;
	        graph.edge[5].weight = 12;

	        graph.edge[6].src = 3;
	        graph.edge[6].dest = 5;
	        graph.edge[6].weight = 2;

	        graph.edge[7].src = 2;
	        graph.edge[7].dest = 3;
	        graph.edge[7].weight = 3;

	        graph.KruskalMST();

    }



}