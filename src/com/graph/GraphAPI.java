package com.graph;

import java.util.Scanner;

class EdgeNode {

    int y;
    int weight;
    EdgeNode next;

    public EdgeNode(int y, int weight) {
        this.y = y;
        this.weight = weight;
    }

    public EdgeNode() {
        super();
    }
}

class ParentNodeValue implements Comparable<ParentNodeValue> {

    int parent;
    int num;
    int value;

    @Override
    public int compareTo(ParentNodeValue other) {
        if (this.value < other.value) {
            return -1;
        } else if (this.value > other.value) {
            return +1;
        } else {
            return 0;
        }
    }
}

class Graph {

    EdgeNode[] edgeNodes;
    int[] degree;
    int nvertices;
    int nedges;
    boolean directed;
}

public class GraphAPI {

    public void initializeGraph(Graph graph, boolean directed) {
        graph.nvertices = 0;
        graph.nedges = 0;
        graph.directed = directed;
        graph.edgeNodes = new EdgeNode[graph.nvertices];
        graph.degree = new int[graph.nvertices];
        for (int i = 0; i < graph.degree.length; i++) {
            graph.degree[i] = 0;
        }
    }

    public void initializeGraph(Graph graph, int nv, int ne, boolean directed) {
        graph.nvertices = nv;
        graph.nedges = ne;
        graph.directed = directed;
        graph.edgeNodes = new EdgeNode[graph.nvertices];
        graph.degree = new int[graph.nvertices];
        for (int i = 0; i < graph.degree.length; i++) {
            graph.degree[i] = 0;
        }
    }
    Scanner sc;

    public void createGraph(Graph graph, boolean directed) {
        int x, y;
        sc = new Scanner(System.in);
        System.out.println("Enter number of vertices");
        int nv = Integer.parseInt(sc.nextLine());
        System.out.println("Enter number of edges");
        int ne = Integer.parseInt(sc.nextLine());
        initializeGraph(graph, nv, ne, directed);
        System.out.println("Give the edges for each pair of vertices:");
        for (int i = 0; i < ne; i++) {
            x = sc.nextInt();
            y = sc.nextInt();
            insertEdge(graph, i + 1, x, y, directed);
        }
    }

    public void insertEdge(Graph graph, int i, int x, int y, boolean directed) {
        if (x > graph.nvertices || y > graph.nedges) {
        } else {
            EdgeNode temp = new EdgeNode();
            temp.y = y;
            System.out.println("Give edge " + i + " weight");
            temp.weight = sc.nextInt();
            temp.next = graph.edgeNodes[x];
            graph.edgeNodes[x] = temp;

            graph.degree[x]++;
            System.out.println("edge (" + x + "," + y + ") inserted");
            if (directed == false) {
                insertEdge(graph, i, y, x, true);
            } else {
                graph.nedges++;
            }
        }
    }

    public void printGraph(Graph graph) {
        EdgeNode en = new EdgeNode();
        for (int i = 0; i < graph.nvertices; i++) {
            System.out.print(i + "\t");
            en = graph.edgeNodes[i];
            while (en != null) {
                System.out.print(en.y + " ");
                en = en.next;
            }
            System.out.println();
        }

    }

    public void findPath(int start, int end, int[] parents) {
        if (start == end) {
            System.out.println(start + " ");
        } else {
            findPath(start, parents[end], parents);
            System.out.println(end + " ");
        }
    }

    public void TopSort(Graph g) {
        int nv = g.nvertices;
        int[] indegrees = new int[nv];
        boolean[] visited = new boolean[nv];
        for (int i = 0; i < nv; i++) {
            visited[i] = false;
        }
        for (int i = 0; i < nv; i++) {
            for (EdgeNode en = g.edgeNodes[i]; en != null; en = en.next) {
                indegrees[en.y]++;
            }
        }
        Queue q = new Queue();
        boolean sum = true;
        while (true) {
            for (int i = 0; i < nv; i++) {
                if (indegrees[i] == 0 && !visited[i]) {
                    q.enque(i);
                }
            }
            while (!q.isEmpty()) {
                int v = q.deque();
                visited[v] = true;
                System.out.println(v + " ");
                EdgeNode en = g.edgeNodes[v];
                while (en != null) {
                    indegrees[en.y]--;
                    en = en.next;
                }
            }
            sum = true;
            for (int i = 0; i < nv; i++) {
                sum = sum && visited[i];
            }
            if (sum) {
                break;
            }
        }
    }

    public void PrimsAlgo(Graph g) { //hav to do
        final int MAX_NUM = 65536;
        int nv = g.nvertices;
        IndexMinPQ<ParentNodeValue> heap = new IndexMinPQ<ParentNodeValue>(nv);
        ParentNodeValue[] nodes = new ParentNodeValue[nv];
        for (int i = 0; i < nv; i++) {
            nodes[i] = new ParentNodeValue();
        }
        for (int i = 0; i < nodes.length; i++) {
            nodes[i].parent = 0;
            nodes[i].num = i;
            nodes[i].value = MAX_NUM;
        }
        for (int i = 0; i < nv; i++) {
            heap.insert(i, nodes[i]);
        }
        while (!heap.isEmpty()) {
            ParentNodeValue min = heap.minKey();
            heap.delete(heap.minIndex());
            int minnum = min.num;
            System.out.println("processed " + minnum);
            EdgeNode en = g.edgeNodes[minnum];
            for (EdgeNode i = en; i != null; i = i.next) {
                int y = en.y;
                boolean b = heap.contains(y);
                if (b && i.weight < heap.keyOf(y).value) {
                    heap.keyOf(y).parent = minnum;
                    heap.keyOf(y).value = i.weight;
                }
            }
        }
    }
}
