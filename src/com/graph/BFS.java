package com.graph;

public class BFS {

    public static void main(String[] args) {
        Graph g = new Graph();
        GraphAPI ga = new GraphAPI();
        ga.createGraph(g, true);
        bfs(g, 0);
    }
    public static void bfs(Graph g, int s) {
        Queue q = new Queue();
        int nvert = g.nvertices;
        int nedges = g.nedges;
        int y;
        EdgeNode en = new EdgeNode();
        boolean[] discovered = new boolean[nvert];
        boolean[] processed = new boolean[nvert];
        int[] parents = new int[nvert];
        q.enque(s);
        discovered[s] = true;
        while (!q.isEmpty()) {
            int u = q.deque();
            process_vertex_early(u);
            processed[u] = true;
            en = g.edgeNodes[u];
            while (en != null) {
                y = en.y;
                if (processed[y] == false || g.directed == true) {
                    process_edge(u, y);
                }
                if (discovered[y] == false) {
                    q.enque(y);
                    discovered[y] = true;
                    parents[y] = u;
                }
                en = en.next;
            }
            process_vertex_late(u);
        }
    }
    private static void process_vertex_early(int u) {
        System.out.println("vertex " + u + " processed");
    }

    private static void process_edge(int u, int y) {
        System.out.println("edge (" + u + "," + y + ") processed");
    }

    private static void process_vertex_late(int u) {
        
    }
}
