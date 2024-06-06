package test;

import api.Graph;
import client.DepthFirstPath;

public class DFSTest extends ListGraphTest{
    public static void main(String[] args) {
        Graph graph = testCreateAndAddEdge();
        printAllEdges(graph);

        DepthFirstPath dfs = new DepthFirstPath(graph, 0);
        System.out.println("All dfs paths :");
        for(int i = 0; i < dfs.getPaths().length; i++) {
            System.out.println(i +" - "+dfs.getPaths()[i]);
        }
    }


}
