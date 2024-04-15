package api;

import java.util.List;

public interface Graph {
    void addEdge(int start, int end);
    int getVertices();
    int getEdges();
    List<Integer> getAdjecents(int v);
}
