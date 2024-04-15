package util;

import api.Graph;

import java.util.ArrayList;
import java.util.List;

public class GraphUtil {
    public static List<String> getAllEdges(Graph graph) {
        List<String> edges = null;
        if(graph != null) {
            edges = new ArrayList<>();
            for (int v = 0; v < graph.getVertices(); v++) {
                List<Integer> adjs = graph.getAdjecents(v);
                for (int w = 0; w < adjs.size(); w++) {
                    edges.add(v + " - " + adjs.get(w));
                }
            }
        }
        return edges;
    }

    public static int getIndegree(int vertex, Graph graph) {
        int indegree = 0;
        if(graph != null && vertex <= 0 && vertex >= graph.getVertices()) {
            indegree = graph.getAdjecents(vertex).size();
        } else {
            throw new IllegalArgumentException("Invalid params!!");
        }
        return indegree;
    }

    public static int getMaxIndegree(Graph graph) {
        int maxIndegree = 0;

        return maxIndegree;
    }
}
