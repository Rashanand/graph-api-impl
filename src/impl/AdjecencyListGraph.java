package impl;

import api.Graph;

import java.util.ArrayList;
import java.util.List;

public class AdjecencyListGraph implements Graph {
    class Node {
        int data;
        Node next;
        Node(int data) {
            this.data = data;
        }
    }

    Node [] graph = null;

    public AdjecencyListGraph(int size) {
        if (size <= 0) {
            throw new IllegalArgumentException("Size of graph cannot be zero or less!!");
        }
        graph = new Node[size];
    }

    @Override
    public void addEdge(int start, int end) {
        if(start >= 0 && start < graph.length && end >= 0 && end < graph.length) {
           Node node = new Node(end);

           if(graph[start] != null) {
               Node curr = graph[start];
               while (curr.next != null) {
                   curr = curr.next;
               }
               curr.next = node;
           } else {
               graph[start] = node;
           }
        } else {
            throw new IllegalArgumentException("Inavlid start or end!!");
        }
    }

    @Override
    public int getVertices() {
        return graph.length;
    }

    @Override
    public int getEdges() {
        int edges = 0;
        for(int i = 0; i < graph.length; i++) {
            Node curr = graph[i];
            while (curr != null) {
                edges++;
                curr = curr.next;
            }
        }
        return edges;
    }

    @Override
    public List<Integer> getAdjecents(int v) {
        List<Integer> adjs = null;
        if(graph[v] != null) {
            adjs = new ArrayList<>();
            Node curr = graph[v];
            while (curr != null) {
                adjs.add(curr.data);
                curr = curr.next;
            }
        }
        return adjs;
    }
}
