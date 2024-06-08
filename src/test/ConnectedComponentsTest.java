package test;

import api.Graph;
import client.ConnectedComponents;

public class ConnectedComponentsTest {
    public static void main(String[] args) {
        testWithList();
        testWithMatrix();
    }

    private static void testWithMatrix() {
        System.out.println("************** Test CC with Matrix **************");
        Graph g = MatrixGraphTest.testAndCreateMatrixGraph();
        ConnectedComponents connectedComponents = new ConnectedComponents(g);
        System.out.println(connectedComponents.getNoOfConnectedComponents());
        printCCGroups(connectedComponents.getConnectedComponentGroups());
    }

    private static void testWithList() {
        System.out.println("************** Test CC with List **************");
        Graph g = ListGraphTest.testCreateAndAddEdge();
        ConnectedComponents connectedComponents = new ConnectedComponents(g);
        System.out.println(connectedComponents.getNoOfConnectedComponents());
        printCCGroups(connectedComponents.getConnectedComponentGroups());
    }

    private static void printCCGroups(int [] group) {
        for(int i = 0; i < group.length; i++) {
            System.out.println(i +" - "+ group[i]);
        }
    }
}
