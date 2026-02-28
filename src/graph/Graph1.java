package graph;

import java.util.ArrayList;

public class Graph1 {
	public static void main(String[] args) {
		int n = 4, m = 4;
		ArrayList<ArrayList<Integer>> adj = new ArrayList<ArrayList<Integer>>();

		// n+1
		for (int i = 1; i <= n; i++)
			adj.add(new ArrayList<Integer>());

		// edge 1--2
		adj.get(1).add(2);
		adj.get(2).add(1);

		// edge 1--3
		adj.get(3).add(1);
		adj.get(1).add(3);

		// edge 2--3
		adj.get(2).add(3);
		adj.get(3).add(2);

		// printing the edges
		for (int i = 1; i < n; i++) {
			for (int j = 1; j < adj.get(i).size(); j++) {
				System.out.print(adj.get(i).get(j) + " ");
			}
			System.out.println();
		}
	}

}

//storing the undirected graph adjacency list
