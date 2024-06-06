package test;

import api.Graph;
import impl.AdjecencyMatrixGraph;

public class MatrixGraphTest {
    public static void main(String[] args) {
        testAndCreateMatrixGraph();
    }

    public static Graph testAndCreateMatrixGraph() {
        Graph graph = new AdjecencyMatrixGraph(4);
        System.out.println("Vertices : " + graph.getVertices());
        graph.addEdge(0, 1);
        graph.addEdge(0, 2);
        graph.addEdge(0, 3);
        graph.addEdge(1, 2);
        graph.addEdge(2, 3);

        System.out.println(graph.getEdges());
        System.out.println(graph.getAdjecents(0));
        System.out.println(graph.getAdjecents(3));
        System.out.println(graph.getAdjecents(2));

        graph.addEdge(0, 4);
        graph.addEdge(3, 0);
        graph.addEdge(-1, 3);
        graph.getAdjecents(-1);
        graph.getAdjecents(4);
        System.out.println(graph.getAdjecents(3));
        return graph;
    }
}
