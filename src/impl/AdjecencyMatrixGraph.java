package impl;

import api.Graph;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AdjecencyMatrixGraph implements Graph {
    private int [][] adjMatrix;
    private int size;

    public AdjecencyMatrixGraph(int size) {
        if (size <= 0) {
            throw new IllegalArgumentException("Size of graph cannot be zero or less!!");
        }
        this.size = size;
        this.adjMatrix = new int[size][size];
    }
    @Override
    public void addEdge(int source, int destination) {
        if(source >= 0 && source < size && destination >= 0 && destination < size) {
            adjMatrix[source][destination] = 1;
            //adjMatrix[destination][source] = 1;
        } else {
            System.out.println("Invalid source or destination passed!!!");
        }
    }

    @Override
    public int getVertices() {
        return size;
    }

    @Override
    public int getEdges() {
        return (int)Arrays.stream(adjMatrix).flatMapToInt(Arrays::stream).filter(i -> i > 0).count();
    }

    @Override
    public List<Integer> getAdjecents(int v) {
        List<Integer> adjs = null;
        if(v >= 0 && v < size) {
            adjs = new ArrayList<>(size);
            for(int i = 0; i < adjMatrix[v].length; i++) {
                if (adjMatrix[v][i] > 0) {
                    adjs.add(i);
                }
            }
        } else {
            System.out.println("Invalid vertex passed!!!");
        }
        return adjs;
    }
}
