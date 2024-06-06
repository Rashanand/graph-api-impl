package test;

import api.Graph;
import client.BreadthFirstPath;

public class BFSTest extends ListGraphTest{
    public static void main(String[] args) {
        Graph graph = testCreateAndAddEdge();
        //printAllEdges(graph);

        BreadthFirstPath breadthFirstPath = new BreadthFirstPath(graph, 0);
        breadthFirstPath.printBFPath();
    }
}
