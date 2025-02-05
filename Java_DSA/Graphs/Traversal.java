package Graphs;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Traversal {
    public static void main(String[] args){
        int V=5;
        ArrayList<ArrayList<Integer>> adj=new ArrayList<>();
        for (int i = 0; i < V; i++) {
            adj.add(new ArrayList<>());
        }

        addEdge(adj, 0, 1);
        addEdge(adj, 0, 2);
        addEdge(adj, 1, 2);
        addEdge(adj, 1, 3);
        addEdge(adj, 3, 4);
        Traversal traversal = new Traversal();
        ArrayList<Integer> bfsOutput = traversal.bfs(adj, V);
        System.out.println("BFS Traversal starting from node 0: " + bfsOutput);
    }

    // Method to add an edge to the graph
    public static void addEdge(ArrayList<ArrayList<Integer>> adj, int u, int v) {
        adj.get(u).add(v);
        adj.get(v).add(u);
    }

    public ArrayList<Integer> bfs(ArrayList<ArrayList<Integer>> adj,int V){
        ArrayList<Integer> bfs=new ArrayList<>();
        boolean[] vis =new boolean[V];
        Queue<Integer> q=new LinkedList<>();

        q.add(0);
        vis[0]=true;

        while(! q.isEmpty()){
            Integer node=q.poll();
            bfs.add(node);

            for(Integer it:adj.get(node)){
                if(!vis[it]){
                    vis[it]=true;
                    q.add(it);
                }
            }
        }
        return bfs;
    }
}
