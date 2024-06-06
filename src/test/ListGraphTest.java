package test;

import api.Graph;
import impl.AdjecencyListGraph;
import util.GraphUtil;

import java.util.List;

public class ListGraphTest {
    public static void main(String[] args) {
        Graph graph = testCreateAndAddEdge();
        printAllEdges(graph);
    }

    public static Graph testCreateAndAddEdge() {
        Graph g = new AdjecencyListGraph(13);
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

    public static void printAllEdges(Graph graph) {
        List<String> edges = GraphUtil.getAllEdges(graph);
        for(String edge : edges) {
            System.out.println(edge);
        }
    }
}
