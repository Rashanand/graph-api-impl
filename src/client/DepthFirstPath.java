package client;

import api.Graph;

import java.util.List;

public class DepthFirstPath {
    private boolean isVisited[];
    private int path[];
    private int source;

    public DepthFirstPath(Graph graph, int source) {
        if(graph != null) {
            this.isVisited = new boolean[graph.getVertices()];
            this.path = new int[graph.getVertices()];
            this.source = source;
            dfs(graph, source);
        }
    }

    private void dfs(Graph graph, int v) {
        isVisited[v] = true;
        List<Integer> adjs = graph.getAdjecents(v);
        if(adjs != null) {
            for(int w : adjs) {
                if(!isVisited[w]) {
                    dfs(graph, w);
                    path[w] = v;
                }
            }
        }
    }

    public int[] getPaths() {
        return path;
    }
}
