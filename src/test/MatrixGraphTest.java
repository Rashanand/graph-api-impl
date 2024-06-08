package test;

import api.Graph;
import impl.AdjecencyMatrixGraph;

public class MatrixGraphTest {
    public static void main(String[] args) {
        testAndCreateMatrixGraph();
    }

    public static Graph testAndCreateMatrixGraph() {
        Graph g = new AdjecencyMatrixGraph(13);
        //System.out.println("Vertices : " + g.getVertices());
        g.addEdge(0, 5);
        g.addEdge(4, 3);
        g.addEdge(0, 1);
        g.addEdge(9, 12);
        g.addEdge(6, 4);
        g.addEdge(5, 4);
        g.addEdge(0, 2);
        g.addEdge(11, 12);
        g.addEdge(9, 10);
        g.addEdge(0, 6);
        g.addEdge(7, 8);
        g.addEdge(9, 11);
        g.addEdge(5, 3);
        return g;
    }
}
