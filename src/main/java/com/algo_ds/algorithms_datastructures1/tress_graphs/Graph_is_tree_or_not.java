package com.algo_ds.algorithms_datastructures1.tress_graphs;// A Java Program to check whether a graph is tree or not

import java.util.Iterator;
import java.util.LinkedList;

// This class represents a directed graph using adjacency 
// list representation 
class Graph_is_tree_or_not  
{ 
	private int V; // No. of vertices 
	private LinkedList<Integer> adj[]; //Adjacency List 

	// Constructor 
	Graph_is_tree_or_not(int v)
	{ 
		V = v; 
		adj = new LinkedList[v]; 
		for (int i=0; i<v; ++i) 
			adj[i] = new LinkedList(); 
	} 

	// Function to add an edge into the graph 
	void addEdge(int v,int w) 
	{ 
		adj[v].add(w); 
		adj[w].add(v); 
	} 

	// A recursive function that uses visited[] and parent 
	// to detect cycle in subgraph reachable from vertex v. 
	Boolean isCyclicUtil(int v, Boolean visited[], int parent) 
	{ 
		// Mark the current node as visited 
		visited[v] = true; 
		Integer i; 

		// Recur for all the vertices adjacent to this vertex 
		Iterator<Integer> it = adj[v].iterator(); 
		while (it.hasNext()) 
		{ 
			i = it.next(); 

			// If an adjacent is not visited, then recur for 
			// that adjacent 
			if (!visited[i]) 
			{ 
				if (isCyclicUtil(i, visited, v)) 
					return true; 
			} 

			// If an adjacent is visited and not parent of 
			// current vertex, then there is a cycle. 
			else if (i != parent) 
			return true; 
		} 
		return false; 
	} 

	// Returns true if the graph is a tree, else false. 
	Boolean isTree() 
	{ 
		// Mark all the vertices as not visited and not part 
		// of recursion stack 
		Boolean visited[] = new Boolean[V]; 
		for (int i = 0; i < V; i++) 
			visited[i] = false; 

		// The call to isCyclicUtil serves multiple purposes 
		// It returns true if graph reachable from vertex 0 
		// is cyclcic. It also marks all vertices reachable 
		// from 0. 
		if (isCyclicUtil(0, visited, -1)) 
			return false; 

		// If we find a vertex which is not reachable from 0 
		// (not marked by isCyclicUtil(), then we return false 
		for (int u = 0; u < V; u++) 
			if (!visited[u]) 
				return false; 

		return true; 
	} 

	// Driver method 
	public static void main(String args[]) 
	{ 
		// Create a graph given in the above diagram 
/*		Graph_is_tree_or_not g1 = new Graph_is_tree_or_not(5);
		g1.addEdge(1, 0); 
		g1.addEdge(0, 2); 
		g1.addEdge(0, 3); 
		g1.addEdge(3, 4); 
		if (g1.isTree()) 
			System.out.println("Graph is Tree"); 
		else
			System.out.println("Graph is not Tree");*/

		Graph_is_tree_or_not g2 = new Graph_is_tree_or_not(5);
		g2.addEdge(1, 0); 
		g2.addEdge(0, 2); 
		g2.addEdge(2, 1); 
		g2.addEdge(0, 3); 
		g2.addEdge(3, 4); 

		if (g2.isTree()) 
			System.out.println("Graph is Tree"); 
		else
			System.out.println("Graph is not Tree");

	} 
} 
// This code is contributed by Aakash Hasija 
