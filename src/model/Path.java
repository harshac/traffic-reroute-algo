package model;

import java.util.ArrayList;

public class Path {
    private ArrayList<Node> nodes = new ArrayList<Node>();
    private Integer maxFlow = 0;

    public void print(int cost[][]) {
        for (Node node : nodes) {
            node.print();
        }
        System.out.println("\nMax flow: " + maxFlow);
        System.out.println("Cost: " + calculateCost(cost));
    }

    public void addNode(Node node) {
        nodes.add(node);
    }

    public void setMaxFlow(Integer maxFlow) {
        this.maxFlow = maxFlow;
    }

    public int calculateCost(int cost[][]) {
        int pathCost = 0;
        Node startNode = nodes.get(0);
        for (Node node : nodes) {
            pathCost += cost[startNode.getValue()][node.getValue()];
            startNode = node;
        }
        return pathCost;
    }
}
