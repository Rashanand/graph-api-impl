package client;

import api.Graph;

import java.util.List;

public class ConnectedComponents {
    private boolean [] isMarked;
    private int [] connectedComponentIds;
    private int noOfConnectedComponents;

    public ConnectedComponents(Graph g) {
        if(g != null) {
            isMarked = new boolean[g.getVertices()];
            connectedComponentIds = new int[g.getVertices()];
            noOfConnectedComponents = 0;
            countConnectedComponents(g);
        } else {
            System.out.println("Graph not initialized!!!");
        }
    }

    private void countConnectedComponents(Graph g) {
        for (int i = 0; i < g.getVertices(); i++) {
            if(!isMarked[i]) {
                connectedComponentIds[i] = ++noOfConnectedComponents;
                dfs(g, i);
            }
        }
    }

    private void dfs(Graph g, int v) {
        isMarked[v] = true;
        List<Integer> adjs = g.getAdjecents(v);
        if(adjs != null) {
            for(int w: adjs) {
                if(!isMarked[w]) {
                    connectedComponentIds[w] = noOfConnectedComponents;
                    dfs(g, w);
                }
            }
        }
    }

    public int getNoOfConnectedComponents() {
        return noOfConnectedComponents;
    }

    public int[] getConnectedComponentGroups() {
        return connectedComponentIds;
    }
}
