package client;

import api.Graph;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BreadthFirstPath {
    private boolean [] isVisited;
    private int [] edgeTo;
    private Graph graph;
    private int source;

    public BreadthFirstPath(Graph graph, int source) {
        if(graph != null && source >= 0) {
            this.graph = graph;
            this.source = source;
            isVisited = new boolean[graph.getVertices()];
            edgeTo = new int[graph.getVertices()];
            bfs();
        } else {
            throw new IllegalArgumentException("Invalid parameter!!!");
        }
    }

    public void bfs() {
        Queue<Integer> queue = new LinkedList();
        isVisited[source] = true;
        queue.add(source);
        while (!queue.isEmpty()) {
            int v = queue.poll();
            List<Integer> adjs = graph.getAdjecents(v);
            if(adjs != null) {
                for (int w : adjs) {
                    if (!isVisited[w]) {
                        isVisited[w] = true;
                        queue.add(w);
                        edgeTo[w] = v;
                    }
                }
            }
        }
    }

    public void printBFPath() {
        for (int i = 0; i < edgeTo.length; i++)
            System.out.println(edgeTo[i] +" - "+ i);
    }
}
