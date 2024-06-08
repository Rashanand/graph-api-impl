package test;

import api.Graph;
import client.BreadthFirstPath;

public class BFSTest {
    public static void main(String[] args) {
        Graph graph = ListGraphTest.testCreateAndAddEdge();
        //printAllEdges(graph);

        BreadthFirstPath breadthFirstPath = new BreadthFirstPath(graph, 0);
        breadthFirstPath.printBFPath();
    }
}
