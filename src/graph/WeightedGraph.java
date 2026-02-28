package graph;

public class WeightedGraph {
	public static void main(String[] args) {
		int n = 5, m = 5;
		int adj[][] = new int[n + 1][n + 1];

		// edge 1-->2
		adj[1][2] = 2;
		adj[2][1] = 1;

		// edge 2-->3
		adj[2][3] = 1;
		adj[3][2] = 1;

		// edge 1-->3
		adj[1][3] = 3;
		adj[3][1] = 1;
		
		//edge 2--4
		adj[2][4] = 1;
		adj[4][2] = 1;
		
		//edge 2--5
		adj[2][5] = 6;
		adj[5][2] = 6;
		
		//edge 4--5
		adj[4][5] = 3;
		adj[5][5] = 3;
		

		// Print adjacency matrix
		for (int i = 0; i <= n; i++) {
			for (int j = 0; j <= n; j++) {
				System.out.print(adj[i][j] + " ");
			}
			System.out.println();
		}

	}

}
// implementation of weighted graphs
