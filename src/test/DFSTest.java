package test;

import api.Graph;
import client.DepthFirstPath;

public class DFSTest {
    public static void main(String[] args) {
        testDFSWithList();
        testDFSWithMatrix();
    }

    private static void testDFSWithList() {
        System.out.println("************** Test DFS with List **************");
        Graph graph = ListGraphTest.testCreateAndAddEdge();
        ListGraphTest.printAllEdges(graph);
        testDFS(graph);
    }

    private static void testDFSWithMatrix() {
        System.out.println("************** Test DFS with Matrix **************");
        testDFS(MatrixGraphTest.testAndCreateMatrixGraph());
    }

    private static void testDFS(Graph graph) {
        DepthFirstPath dfs = new DepthFirstPath(graph, 0);
        System.out.println("All dfs paths :");
        for(int i = 0; i < dfs.getPaths().length; i++) {
            System.out.println(i +" - "+dfs.getPaths()[i]);
        }
    }


}
